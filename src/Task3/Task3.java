package Task3;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    Map<String, Integer> task3 = new HashMap<>();

    public void add(String name, Integer num) {
        if (task3.containsKey(name) && task3.containsValue(num)){
            throw new RuntimeException("такие данные уже имеются");
        } else {task3.put(name, num);}
    }

    @Override
    public String toString() {
        return " "+task3;
    }
}
