package Week5;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<String>();

        // friends = [KLPY]
        friends.addLast("Kim");
        friends.addLast("Sohn");
        friends.addLast("choi");
        friends.addLast("Yoon");
        System.out.println(friends);

        // []
        ListIterator<String> iterator = friends.listIterator();
        iterator.next(); // [K]
        iterator.next(); // [KS]

        iterator.add("Im"); // [KSI]
        System.out.println(friends);
        iterator.add("Dong"); // [KSID]
        System.out.println(friends);
        iterator.next(); // [KSIDC]
        iterator.next(); // [KSIDCY]
        System.out.println(friends);
        iterator.remove(); // [KSIDC]

        System.out.println(friends);

    }
}
