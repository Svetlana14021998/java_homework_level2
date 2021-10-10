
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //Задание 1: Создать массив с набором слов (10-20 слов, должны встречаться
        // повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив
        // (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
        //Решение: метод countWords считает количество каждого слова в массиве, метод searchUniqueWords
        // выделяет уникальные слова из списка.  Для вывода в алфавитном порядке использована TreeMap
/*
        String[] strings = {"apple", "cow", "home", "apple", "table",
                "sunrise", "apple", "orange", "cherry", "sunrise",
                "cherry", "notebook", "lamp", "pencil", "book",
                "bookcase", "cap", "window", "cherry", "apple"};

        Map<String, Integer> map = countWords(strings);
        System.out.println(map);
        Map<String, Integer> unWords = searchUniqueWords(map);
        System.out.println(unWords.keySet());
*/

        //Задание 2: Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и
        // телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи.
        // С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией
        // может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
        // выводиться все телефоны:
       TelephoneBook telephoneBook = new TelephoneBook();
        telephoneBook.add("Ivanov","123");
        telephoneBook.add("Kozlov","234");
        telephoneBook.add("Ivanov","245");
        telephoneBook.add("Petrov","234");
        telephoneBook.add("S","234");
        telephoneBook.add("S","234");

        telephoneBook.search("Ivanov");
        telephoneBook.search("Petrov");
        telephoneBook.search("Kozlov");
        telephoneBook.search("Kzlov");

        telephoneBook.printAll();
    }


    public static Map<String, Integer> countWords(String[] str) {
        Map<String, Integer> map = new TreeMap<>();
        for (String s : str) {
            Integer counter = map.get(s);
            if (counter == null) {
                counter = 1;
            } else {
                counter++;
            }
            map.put(s, counter);
        }
        return map;
    }

    public static Map<String, Integer> searchUniqueWords(Map<String, Integer> map) {
        Map<String, Integer> searchWords = new TreeMap<>();
        for (String str : map.keySet()) {
            if (map.get(str) == 1) {
                searchWords.put(str, map.get(str));
            }

        }
        return searchWords;
    }
}
