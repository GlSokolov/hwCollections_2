import java.util.HashMap;

public class Phonebook {
    HashMap<String, String> phonebook = new HashMap<>();

    public void add(String name, String number) {
        phonebook.put(name, number);
    }

    @Override
    public String toString() {
        return "Телефонный справочник: " + phonebook;
    }
}
