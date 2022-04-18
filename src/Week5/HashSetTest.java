package Week5;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int size = 0; // To show Set interface's Features
        hs.add(1);
        size++;
        hs.add(2);
        size++;
        hs.add(2);
        size++;
        hs.add(2);
        size++;
        hs.add(3);
        size++;
        hs.add(10);
        size++;
        hs.add(6);
        size++;

        System.out.println("Added: " + size);
        System.out.println("hs.size(): " + hs.size());
        System.out.println(hs.toString());

    }
}
