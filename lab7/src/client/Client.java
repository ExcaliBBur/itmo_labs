package client;

import com.company.utilities.Requester;
import com.company.utilities.Response;
import com.company.utilities.User;

import java.io.*;
import java.net.*;

/**
 * Class to client management
 */
public class Client implements Serializable {
    public final static int PORT = 9610;
    private final static int TIMEOUT = 3000;
    private final static int MAX_TIMEOUT_ATTEMPTS = 4;
    private static int timeout_attempts = 0;
    private static DatagramPacket sendPacket;
    public final static InetSocketAddress addr = new InetSocketAddress("localhost", PORT);
    public static DatagramSocket socket;

    static {
        try {
            socket = new DatagramSocket();
            socket.setSoTimeout(TIMEOUT);
        } catch (SocketException e) {
        }
    }

    public static void sendResponse(Requester requester) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(requester);
        objectOutputStream.flush();
        byte[] buff = byteArrayOutputStream.toByteArray();
        DatagramPacket packet = new DatagramPacket(buff, buff.length, addr);
        sendPacket = packet;
        socket.send(packet);
    }

    /**
     * Method to receive answer from server
     *
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws SocketException
     */
    public static void receiveAnswer() throws IOException, ClassNotFoundException, SocketException {
        byte[] buff = new byte[8192];
        DatagramPacket packet = new DatagramPacket(buff, buff.length);
        try {
            socket.receive(packet);
        } catch (SocketTimeoutException e) {
            if (timeout_attempts == MAX_TIMEOUT_ATTEMPTS) {
                System.out.println("Превышено кол-во попыток переподключения.");
                exit();
            } else {
                System.out.println("Сервер временно недоступен, попытка переподключения...");
                timeout_attempts++;
                socket.send(sendPacket);
                receiveAnswer();
            }
        } catch (SocketException ignored) {}
        byte[] data = packet.getData();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data));
            System.out.println(objectInputStream.readObject());
        } catch (StreamCorruptedException e) {
            timeout_attempts = 0;
        } catch (EOFException e) {
            System.out.println("Закончилось место");
        }
    }

    /**
     * Method to receive response
     * @return Request
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static Requester receiveResponse() throws IOException, ClassNotFoundException {
        byte[] buff = new byte[4096];
        DatagramPacket packet = new DatagramPacket(buff, buff.length);
        try {
            socket.receive(packet);
        } catch (IOException e) {
            if (timeout_attempts != MAX_TIMEOUT_ATTEMPTS) {
                System.out.println("Сервер временно недоступен, попытка переподключения...");
                socket.send(sendPacket);
                receiveResponse();
                timeout_attempts++;
                return null;
            } else {
                System.out.println("Превышено кол-во попыток переподключений");
                exit();
            }
        }
        timeout_attempts = 0;
        byte[] data = packet.getData();
        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data));
        return (Requester) objectInputStream.readObject();
    }
    /**
     * Method to receive error from server
     *
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws StreamCorruptedException
     */
    public static void receiveError() throws IOException, ClassNotFoundException, StreamCorruptedException {
        byte[] buff = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buff, buff.length);
        try {
            socket.receive(packet);
        } catch (SocketTimeoutException e) {
            if (timeout_attempts != MAX_TIMEOUT_ATTEMPTS) {
                System.out.println("Сервер временно недоступен, попытка переподключения...");
                socket.send(sendPacket);
                receiveError();
                timeout_attempts++;
                return;
            } else {
                System.out.println("Превышено кол-во попыток переподключений");
                exit();
            }
        }
        timeout_attempts = 0;
        byte[] data = packet.getData();
        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data));
        CommandHandlerClient.error = (String) objectInputStream.readObject();
    }

    /**
     * Method to exit from client
     */
    public static void exit() {
        System.out.println("Клиент заканчивает свою работу...");
        socket.close();
        AppClient.flag = false;
    }
}
