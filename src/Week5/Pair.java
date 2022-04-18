package Week5;

public class Pair<T1, T2> {
    T1 object1;
    T2 object2;

    public Pair(T1 one, T2 two) {
        object1 = one;
        object2 = two;
    }

    public T1 getFirst() {
        return object1;
    }

    public T2 getSecond() {
        return object2;
    }

}
