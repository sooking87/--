package Week5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2 {
    public static void main(String[] args) {
        Map<String, String> favoriteFruits = new HashMap<String, String>();
        favoriteFruits.put("Apple", "high");
        favoriteFruits.put("Orage", "Medium");
        favoriteFruits.put("Grape", "high");
        favoriteFruits.put("Banna", "Low");

        Set<String> keySet = favoriteFruits.keySet();
        System.out.println("key  " + " : " + "value");
        for (String key : keySet) {
            String value = favoriteFruits.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
