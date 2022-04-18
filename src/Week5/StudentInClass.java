package Week5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class StudentInClass {
    public static void main(String[] args) {
        HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();

        scoreMap.put("SohnSooKyoung", 95);
        scoreMap.put("Song", 86);
        scoreMap.put("Park", 72);
        scoreMap.put("Ann", 82);
        scoreMap.put("Kim", 92);
        scoreMap.put("Choi", 95);

        System.out.println("scoreMap.size(): " + scoreMap.size());

        Set<String> keys = scoreMap.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String name = it.next();
            int score = scoreMap.get(name);
            System.out.println(name + " : " + score);
        }

    }
}
