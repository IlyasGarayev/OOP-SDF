package Task3;

import java.util.Map;

public class Task3 {
    public <K, V> void doTask(Map<K, V> map){
        for(Map.Entry<K, V> m: map.entrySet()){
            System.out.println(m.getKey() + " - " + m.getValue());
        }
    }

}
