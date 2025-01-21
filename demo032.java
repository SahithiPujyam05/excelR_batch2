import java.util.HashSet;

class HashSetDemo2 {
    void HashSetMethod() {
        // We can add any type of element here...
        HashSet hashSet = new HashSet();
        hashSet.add("MRUH");
        hashSet.add("SAHITHI");
        hashSet.add("GROUP4");
        System.out.println(hashSet);

        // we can use Object class to read any type of elements
        for (Object x : hashSet) {
            System.out.println(x);
        }
    }
}

public class demo032 {
    public static void main(String[] args) {
        HashSetDemo2 obj = new HashSetDemo2();
        obj.HashSetMethod();
    }
}
