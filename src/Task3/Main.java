package Task3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Tast", 1);
        Task3 task = new Task3();
        task.doTask(map);
    }
}
