import java.util.HashMap;
import java.util.Map;

public class CodingBat {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "stuff");
        map.put("b", " ");
        mapBully(map);
        System.out.println(map.toString());
    }

    public static void mapBully(Map<String, String> hashMap) {
        if (hashMap.get("a") != null) {
            hashMap.put("b", hashMap.get("a"));
            hashMap.put("a", " ");

        }
    }
}
