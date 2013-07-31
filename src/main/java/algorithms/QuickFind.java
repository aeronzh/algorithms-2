package algorithms;

import java.util.HashMap;
import java.util.Map;

public class QuickFind {
    private Map<String, String> map = new HashMap<>();
    
    public void union(String a, String b) {
        if (!map.containsKey(a)) {
            map.put(a, a);
        }
        if (!map.containsKey(b)) {
            map.put(b, b);
        }
        if (!connected(a, b)) {
            String value = map.get(a);
            for (Map.Entry<String, String> e : map.entrySet()) {
                if (e.getValue().equals(value)) {
                    map.put(e.getKey(), map.get(b));
                }
            }
        }
    }
    
    private String find(String a) {
        return map.get(a);
    }
    
    public boolean connected(String a, String b) {
        return find(a).equals(find(b));
    }
}
