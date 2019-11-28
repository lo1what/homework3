import java.util.*;
import java.util.HashMap;
import java.util.HashSet;

public class UniqueList {
    public static void main(String[] args) {


        String[] elements = {"Selenium", "Gold", "Ferrum", "Selenium", "Gold", "Hydrogenium", "Gold", "Helium", "Oxygen", "Selenium", "Silver"};

        // Создание коллекции из слов (химичиских элементов)
        Map<String, Integer> map = new HashMap<>();
        // Подсчет повторяющихся слов (химичиских элементов)
        for (String element : elements) {
            map.merge(element, 1, (a, b) -> a + b);
        }
        System.out.println(map);
        System.out.println("");

        // Выводим только уникальные слова
        Set<String> uniqElements = new HashSet<>(Arrays.asList(elements));
        System.out.println(uniqElements);
        System.out.println("");


    }
}

