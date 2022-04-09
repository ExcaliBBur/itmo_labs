package com.company.utilities;

import com.company.sourse.Dragon;

import java.io.IOException;
import java.io.Serializable;
import java.util.*;

/**
 * Collection controller class
 */
public class CollectionController implements Serializable{
    public static LinkedHashMap<Long, Dragon> collection = FileController.getCollection();

    /**
     * Method to sort collection
     */
    public static void sortCollection(){
        List<Map.Entry<Long, Dragon>> list = new ArrayList<Map.Entry<Long, Dragon>>(collection.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Long, Dragon>>(){
            public int compare(Map.Entry<Long,Dragon> o1, Map.Entry<Long,Dragon> o2){
                return (int) (o1.getKey() - o2.getKey());
            }
        });
        collection.clear();
        list.forEach(s -> collection.put(s.getKey(),s.getValue()));
    }

    /**
     * New dragon without generation id
     * @param s dragon id
     */
    public CollectionController(String s){
        DataController data = new DataController("without id");
        Dragon dragon = new Dragon(Long.parseLong(s), data.getName(), data.getCoordinates(), data.getCreationDate(), data.getAge(), data.getWingspan(),
                data.getWeight(), data.getColor(), data.getHead());
        collection.put(Long.parseLong(s),dragon);
    }

    /**
     * Method to get collection
     * @return collection
     */
    public static Map<Long, Dragon> getCollection() {
        sortCollection();
        return collection;
    }

    /**
     * Method to get collection for user
     * @return collection for user
     */
    public static Collection<Dragon> getCollectionForUser() throws IOException {
        sortCollection();
        return collection.values();
    }
}