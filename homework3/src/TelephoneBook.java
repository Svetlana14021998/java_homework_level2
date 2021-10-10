import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TelephoneBook {
    //Решение: класс TelephoneBook хранит данные в формате Map<String, Set<String>> : Фамилия и
    // уникальный список номеров соответсвующих ей. Метод add позволяет добавлять данные,
    //search выполняет поиск данных по фамилии, printAll выводит всю информацию: все существующие фамилии,
    // все существующие номера телефонов и весь телефонный справочник
    private Map<String, Set<String>> people;

    public TelephoneBook() {
        this.people = new HashMap<>();
    }

    public void add(String surname, String phone) {
        if (!people.containsKey(surname)) {
            if (!people.containsValue(phone)) {
                people.put(surname, new HashSet<>());
                people.get(surname).add(phone);
            }
        } else {
            people.get(surname).add(phone);
        }
    }


    public Set<String> get(String surname) {
        return people.get(surname);
    }

    public void search(String surname) {
        if (get(surname) == null) {
            System.out.println(surname + " not found");
        } else {
            System.out.println("Surname " + surname + " " + "phoneNumber(s): " + people.get(surname));
        }

    }

    public void printAll() {
        System.out.println("These surnames are in telephoneBook: " + people.keySet());// print  only key
        System.out.println("These telephoneNumber are in telephoneBook: " + people.values());// print only value
        System.out.println("-----------");
        System.out.println("TelephoneBook: ");
        for (Map.Entry<String, Set<String>> entry : people.entrySet()//print all map
        ) {
            System.out.println(entry);

        }
    }
}
