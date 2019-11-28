import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Phonebook {
    //Создание коллекци
    Map<String, HashSet<String>> pb;

    public Phonebook(){
        pb = new HashMap<>();
    }

    //Метод добавления новых абонентов
    public void add(String name, String number) {
        HashSet<String> phones = pb.getOrDefault(name, new HashSet<>());
        phones.add(number);
        pb.put(name, phones);
    }

    //Метод для получения информации об абоненте (имя / номер)
    public void get(String name) {
        System.out.println( "телефон:" + pb.get(name));
    }

}

