# Лабораторная работа №1

<a href = "https://github.com/ExcaliBBur/prog_labs/tree/main/lab1">Репозиторий</a>

Написать программу на языке Java, выполняющую соответствующие варианту действия. Программа должна соответствовать следующим требованиям:

Она должна быть упакована в исполняемый jar-архив.
Выражение должно вычисляться в соответствии с правилами вычисления математических выражений (должен соблюдаться порядок выполнения действий и т.д.).
Программа должна использовать математические функции из стандартной библиотеки Java.
Результат вычисления выражения должен быть выведен в стандартный поток вывода в заданном формате.
Выполнение программы необходимо продемонстрировать на сервере helios.

1. Создать одномерный массив h типа long. Заполнить его числами от 3 до 15 включительно в порядке убывания. <br/>
2. Создать одномерный массив x типа double. Заполнить его 20-ю случайными числами в диапазоне от -6.0 до 8.0. <br/>
3. Создать двумерный массив e размером 13x20. Вычислить его элементы по следующей формуле (где x = x[j]): <br/>
![image](https://user-images.githubusercontent.com/90529328/227249869-9442cce5-128d-4618-9542-90a0c47549c4.png) <br/>
4. Напечатать полученный в результате массив в формате с двумя знаками после запятой. <br/>

# Лабораторная работа №2

<a href = "https://github.com/ExcaliBBur/prog_labs/tree/main/lab2">Репозиторий</a>

На основе базового класса Pokemon написать свои классы для заданных видов покемонов. Каждый вид покемона должен иметь один или два типа и стандартные базовые характеристики:

* очки здоровья (HP)
* атака (attack)
* защита (defense)
* специальная атака (special attack)
* специальная защита (special defense)
* скорость (speed)
Классы покемонов должны наследоваться в соответствии с цепочкой эволюции покемонов. На основе базовых классов PhysicalMove, SpecialMove и StatusMove реализовать свои классы для заданных видов атак.

Атака должна иметь стандартные тип, силу (power) и точность (accuracy). Должны быть реализованы стандартные эффекты атаки. Назначить каждому виду покемонов атаки в соответствии с вариантом. Уровень покемона выбирается минимально необходимым для всех реализованных атак.

Используя класс симуляции боя Battle, создать 2 команды покемонов (каждый покемон должен иметь имя) и запустить бой.

Базовые классы и симулятор сражения находятся в jar-архиве (обновлен 9.10.2018, исправлен баг с добавлением атак и кодировкой). Документация в формате javadoc - здесь.

Информацию о покемонах, цепочках эволюции и атаках можно найти на сайтах http://poke-universe.ru, http://pokemondb.net, http://veekun.com/dex/pokemon

<b> Комментарии </b> <br/>
Цель работы: на простом примере разобраться с основными концепциями ООП и научиться использовать их в программах.

Что надо сделать (краткое описание)

Ознакомиться с документацией, обращая особое внимание на классы Pokemon и Move. При дальнейшем выполнении лабораторной работы читать документацию еще несколько раз.
Скачать файл Pokemon.jar. Его необходимо будет использовать как для компиляции, так и для запуска программы. Распаковывать его не надо! Нужно научиться подключать внешние jar-файлы к своей программе.
Написать минимально работающую программу и посмотреть как она работает. <br/>

```
Battle b = new Battle();
Pokemon p1 = new Pokemon("Чужой", 1);
Pokemon p2 = new Pokemon("Хищник", 1);
b.addAlly(p1);
b.addFoe(p2); 
b.go();
```

Создать один из классов покемонов для своего варианта. Класс должен наследоваться от базового класса Pokemon. В конструкторе нужно будет задать типы покемона и его базовые характеристики. После этого попробуйте добавить покемона в сражение.
Создать один из классов атак для своего варианта (лучше всего начать с физической или специальной атаки). Класс должен наследоваться от класса PhysicalMove или SpecialMove. В конструкторе нужно будет задать тип атаки, ее силу и точность. После этого добавить атаку покемону и проверить ее действие в сражении. Не забудьте переопределить метод describe, чтобы выводилось нужное сообщение.
Если действие атаки отличается от стандартного, например, покемон не промахивается, либо атакующий покемон также получает повреждение, то в классе атаки нужно дополнительно переопределить соответствующие методы (см. документацию). При реализации атак, которые меняют статус покемона (наследники StatusMove), скорее всего придется разобраться с классом Effect. Он позволяет на один или несколько ходов изменить состояние покемона или модификатор его базовых характеристик.
Доделать все необходимые атаки и всех покемонов, распределить покемонов по командам, запустить сражение.
![image](https://user-images.githubusercontent.com/90529328/227252353-e3d83095-d45b-4ae8-beb7-598c200d365d.png) <br/>

# Лабораторная работа №3 

<a href = "https://github.com/ExcaliBBur/prog_labs/tree/main/lab3">Репозиторий</a>

<b> Описание предметной области, по которой должна быть построена объектная модель: </b> <br/>

<i> И приведение разразилось долгим глухим смехом. Но Фрекен Бок было не до смеха. Она кинулась к двери и стала расшвыривать мебель. В мнгновение ока разобрал баррикаду, она с громким криком выбежала в переднюю. Приведение полетело следом, а Малыш побежал за ним. Последним мчался Бимбо и заливисто лаял. Он узнал приведение по запаху и думал, что началась веселая игра. Приведение, впрочем, тоже так думало. </i> <br/>
<b> Программа должна удовлетворять следующим требованиям: </b>

* Доработанная модель должна соответствовать принципам SOLID.
* Программа должна содержать как минимум два интерфейса и один абстрактный класс (номенклатура должна быть согласована с преподавателем).
* В разработанных классах должны быть переопределены методы equals(), toString() и hashCode().
* Программа должна содержать как минимум один перечисляемый тип (enum).

<b>Порядок выполнения работы:</b>

* Доработать объектную модель приложения.
* Перерисовать диаграмму классов в соответствии с внесёнными в модель изменениями.
* Согласовать с преподавателем изменения, внесённые в модель.
* Модифицировать программу в соответствии с внесёнными в модель изменениями.

# Лабораторная работа №4

<a href = "https://github.com/ExcaliBBur/prog_labs/tree/main/lab4">Репозиторий</a>

Доработать программу из лабораторной работы №3, обновив реализацию объектной модели в соответствии с новой версией описания предметной области.

<i>Но тут из-под папиной кровати раздался глухой голос, в котором звучало ещё больше удовлетворения: И маленькое приведение стремительно, со свистом вылетело из-под кровати. И приведение разразилось долгим глухим смехом. Но Фрекен Бок было не до смеха. Она кинулась к двери и стала расшвыривать мебель.
В мнгновение ока разобрал баррикаду, она с громким криком выбежала в переднюю. Приведение полетело следом, а Малыш побежал за ним. Последним мчался Бимбо и заливисто лаял. Он узнал приведение по запаху и думал, что началась веселая игра. Приведение, впрочем, тоже так думало. Но потом оно немного поотстало, чтобы получилась 
настоящая погоня. Так они носились по всей квартире - впереди скакала Фрекен Бок, а за ней мчалось приведение: в кухню и из кухни, в столовую и из столовой, в комнату Малыша и из комнаты Малыша и снова в кухню, большую комнату, комнату Малыша и снова, и снова... Фрекен Бок все время вопила так, что в конце концов приведение даже 
попыталось её успокоить.</i> <br/>

<b> Программа должна удовлетворять следующим требованиям: </b>

* В программе должны быть реализованы 2 собственных класса исключений (checked и unchecked), а также обработка исключений этих классов.
* В программу необходимо добавить использование локальных, анонимных и вложенных классов (static и non-static).

<b>Порядок выполнения работы: </b>

* Доработать объектную модель приложения.
* Перерисовать диаграмму классов в соответствии с внесёнными в модель изменениями.
* Согласовать с преподавателем изменения, внесённые в модель.
* Модифицировать программу в соответствии с внесёнными в модель изменениями.

# Лабораторная работа №5

<a href = "https://github.com/ExcaliBBur/prog_labs/tree/main/lab5">Репозиторий</a>

<b> Реализовать консольное приложение, которое реализует управление коллекцией объектов в интерактивном режиме. 
  В коллекции необходимо хранить объекты класса Dragon, описание которого приведено ниже. </b>

<b>Разработанная программа должна удовлетворять следующим требованиям: </b>

* Класс, коллекцией экземпляров которого управляет программа, должен реализовывать сортировку по умолчанию.
* Все требования к полям класса (указанные в виде комментариев) должны быть выполнены.
* Для хранения необходимо использовать коллекцию типа java.util.HashSet
* При запуске приложения коллекция должна автоматически заполняться значениями из файла.
* Имя файла должно передаваться программе с помощью: аргумент командной строки.
* Данные должны храниться в файле в формате csv
* Чтение данных из файла необходимо реализовать с помощью класса java.io.BufferedReader
* Запись данных в файл необходимо реализовать с помощью класса java.io.FileOutputStream
* Все классы в программе должны быть задокументированы в формате javadoc.
* Программа должна корректно работать с неправильными данными (ошибки пользовательского ввода, отсутсвие прав доступа к файлу и т.п.).

<b>В интерактивном режиме программа должна поддерживать выполнение следующих команд: </b>

* help : вывести справку по доступным командам
* info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)
* show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении
* add {element} : добавить новый элемент в коллекцию
* update id {element} : обновить значение элемента коллекции, id которого равен заданному
* remove_by_id id : удалить элемент из коллекции по его id
* clear : очистить коллекцию
* save : сохранить коллекцию в файл
* execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.
* exit : завершить программу (без сохранения в файл)
* remove_greater {element} : удалить из коллекции все элементы, превышающие заданный
* remove_lower {element} : удалить из коллекции все элементы, меньшие, чем заданный
* history : вывести последние 14 команд (без их аргументов)
* average_of_wingspan : вывести среднее значение поля wingspan для всех элементов коллекции
* count_less_than_color color : вывести количество элементов, значение поля color которых меньше заданного
* filter_less_than_weight weight : вывести элементы, значение поля weight которых меньше заданного

<b>Формат ввода команд: </b>

* Все аргументы команды, являющиеся стандартными типами данных (примитивные типы, классы-оболочки, String, классы для хранения дат), должны вводиться в той же строке, что и имя команды.
* Все составные типы данных (объекты классов, хранящиеся в коллекции) должны вводиться по одному полю в строку.
* При вводе составных типов данных пользователю должно показываться приглашение к вводу, содержащее имя поля (например, "Введите дату рождения:")
* Если поле является enum'ом, то вводится имя одной из его констант (при этом список констант должен быть предварительно выведен).
* При некорректном пользовательском вводе (введена строка, не являющаяся именем константы в enum'е; введена строка вместо числа; введённое число не входит в указанные границы и т.п.) должно быть показано сообщение об ошибке и предложено повторить ввод поля.
* Для ввода значений null использовать пустую строку.
* Поля с комментарием "Значение этого поля должно генерироваться автоматически" не должны вводиться пользователем вручную при добавлении.

<b>Описание хранимых в коллекции классов: </b>

```
public class Dragon {
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, 
    Значение этого поля должно генерироваться автоматически <br/>
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.util.Date creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private long age; //Значение поля должно быть больше 0
    private Double wingspan; //Значение поля должно быть больше 0, Поле не может быть null
    private Long weight; //Значение поля должно быть больше 0, Поле может быть null
    private Color color; //Поле не может быть null
    private DragonHead head;
}
public class Coordinates {
    private Integer x; //Максимальное значение поля: 691, Поле не может быть null
    private long y; //Значение поля должно быть больше -211
}
public class DragonHead {
    private float size;
}
public enum Color {
    BLUE,
    YELLOW,
    ORANGE,
    WHITE,
    BROWN;
}
```
# Лабораторная работа №6

<a href = "https://github.com/ExcaliBBur/prog_labs/tree/main/lab6">Репозиторий</a>

Разделить программу из лабораторной работы №5 на клиентский и серверный модули. 
Серверный модуль должен осуществлять выполнение команд по управлению коллекцией. Клиентский модуль должен в интерактивном режиме считывать команды, передавать их для выполнения на сервер и выводить результаты выполнения.

<b>Необходимо выполнить следующие требования: </b>

* Операции обработки объектов коллекции должны быть реализованы с помощью Stream API с использованием лямбда-выражений.
* Объекты между клиентом и сервером должны передаваться в сериализованном виде.
* Объекты в коллекции, передаваемой клиенту, должны быть отсортированы по имени
* Клиент должен корректно обрабатывать временную недоступность сервера.
* Обмен данными между клиентом и сервером должен осуществляться по протоколу UDP
* Для обмена данными на сервере необходимо использовать датаграммы
* Для обмена данными на клиенте необходимо использовать сетевой канал
* Сетевые каналы должны использоваться в неблокирующем режиме.

<b>Обязанности серверного приложения:</b>

* Работа с файлом, хранящим коллекцию.
* Управление коллекцией объектов.
* Назначение автоматически генерируемых полей объектов в коллекции.
* Ожидание подключений и запросов от клиента.
* Обработка полученных запросов (команд).
* Сохранение коллекции в файл при завершении работы приложения.
* Сохранение коллекции в файл при исполнении специальной команды, доступной только серверу (клиент такую команду отправить не может).
* Серверное приложение должно состоять из следующих модулей (реализованных в виде одного или нескольких классов):
* Модуль приёма подключений.
* Модуль чтения запроса.
* Модуль обработки полученных команд.
* Модуль отправки ответов клиенту.
* Сервер должен работать в <b>однопоточном</b> режиме.

<b>Обязанности клиентского приложения: </b>

* Чтение команд из консоли.
* Валидация вводимых данных.
* Сериализация введённой команды и её аргументов.
* Отправка полученной команды и её аргументов на сервер.
* Обработка ответа от сервера (вывод результата исполнения команды в консоль).
* Команду save из клиентского приложения необходимо убрать.
* Команда exit завершает работу клиентского приложения.

Важно! Команды и их аргументы должны представлять из себя объекты классов. Недопустим обмен "простыми" строками. 
Так, для команды add или её аналога необходимо сформировать объект, содержащий тип команды и объект, который должен храниться в вашей коллекции. <br/>
<b>Дополнительное задание: </b> <br/>
Реализовать логирование различных этапов работы сервера (начало работы, получение нового подключения, получение нового запроса, отправка ответа и т.п.) с помощью <b>Java Util Logging </b>

# Лабораторная работа №7

<a href = "https://github.com/ExcaliBBur/prog_labs/tree/main/lab7">Репозиторий</a>

<b>Доработать программу из лабораторной работы №6 следующим образом:</b>

* Организовать хранение коллекции в реляционной СУБД (PostgresQL). Убрать хранение коллекции в файле.
* Для генерации поля id использовать средства базы данных (sequence).
* Обновлять состояние коллекции в памяти только при успешном добавлении объекта в БД
* Все команды получения данных должны работать с коллекцией в памяти, а не в БД
* Организовать возможность регистрации и авторизации пользователей. У пользователя есть возможность указать пароль.
* Пароли при хранении хэшировать алгоритмом SHA-512
* Запретить выполнение команд не авторизованным пользователям.
* При хранении объектов сохранять информацию о пользователе, который создал этот объект.
* Пользователи должны иметь возможность просмотра всех объектов коллекции, но модифицировать могут только принадлежащие им.
* Для идентификации пользователя отправлять логин и пароль с каждым запросом.

<b>Необходимо реализовать многопоточную обработку запросов. </b>

* Для многопоточного чтения запросов использовать Fixed thread pool
* Для многопотчной обработки полученного запроса использовать ForkJoinPool
* Для многопоточной отправки ответа использовать создание нового потока (java.lang.Thread)
* Для синхронизации доступа к коллекции использовать потокобезопасные аналоги коллекции из java.util.concurrent

<b>Порядок выполнения работы:</b> 

* В качестве базы данных использовать PostgreSQL.
* Для подключения к БД на кафедральном сервере использовать хост pg, имя базы данных - studs, имя пользователя/пароль совпадают с таковыми для подключения к серверу.

# Лабораторная работа №8
<a href = "https://github.com/ExcaliBBur/Client">Клиент</a> <br/>
<a href = "https://github.com/ExcaliBBur/Server8Lab">Сервер</a>

<b>Интерфейс должен быть реализован с помощью библиотеки JavaFX </b> <br/>
Графический интерфейс клиентской части должен поддерживать русский, нидерландский, латвийский и английский (Австралия) языки / локали. Должно обеспечиваться корректное отображение чисел, даты и времени в соответстии с локалью. Переключение языков должно происходить без перезапуска приложения. Локализованные ресурсы должны храниться в файле свойств.
<b>Доработать программу из лабораторной работы №7 следующим образом: </b> 

* Заменить консольный клиент на клиент с графическим интерфейсом пользователя(GUI). 

<b>В функционал клиента должно входить: </b>

1. Окно с авторизацией/регистрацией. <br/>
2. Отображение текущего пользователя. <br/>
3. Таблица, отображающая все объекты из коллекции <br/>
a. Каждое поле объекта - отдельная колонка таблицы. <br/>
b. Строки таблицы можно фильтровать/сортировать по значениям любой из колонок. Сортировку и фильтрацию значений столбцов реализовать с помощью Streams API. <br/>
4. Поддержка всех команд из предыдущих лабораторных работ. <br/>
5. Область, визуализирующую объекты коллекции <br/>
a. Объекты должны быть нарисованы с помощью графических примитивов с использованием Graphics, Canvas или аналогичных средств графической библиотеки. <br/>
b. При визуализации использовать данные о координатах и размерах объекта. <br/>
c. Объекты от разных пользователей должны быть нарисованы разными цветами. <br/>
d. При нажатии на объект должна выводиться информация об этом объекте. <br/>
e. При добавлении/удалении/изменении объекта, он должен автоматически появиться/исчезнуть/измениться  на области как владельца, так и всех других клиентов.  <br/>
f. При отрисовке объекта должна воспроизводиться согласованная с преподавателем анимация.<br/>
6. Возможность редактирования отдельных полей любого из объектов (принадлежащего пользователю). 
7. Переход к редактированию объекта возможен из таблицы с общим списком объектов и из области с визуализацией объекта. <br/>
8. Возможность удаления выбранного объекта (даже если команды remove ранее не было). <br/>

Перед непосредственной разработкой приложения необходимо согласовать прототип интерфейса с преподавателем. Прототип интерфейса должен быть создан с помощью средства для построения прототипов интерфейсов(mockplus, draw.io, etc.)