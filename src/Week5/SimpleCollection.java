package Week5;

import java.util.*;
import java.util.Collection;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection c; // object declaration
        c = new ArrayList(); // object creation
        System.out.println(c.getClass().getName());
        for (int i = 0; i <= 10; i++) {
            c.add(i + " * " + i + " = " + i * i);
        }
        Iterator iter = c.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }
}
