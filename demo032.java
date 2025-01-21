import java.util.HashSet;

class HashSetDemo2 {
    void HashSetMethod() {
        // We can add String type of element here...
        HashSet<String> hashstringset = new HashSet<String>();
        hashstringset.add("MRUH");
        hashstringset.add("SAHITHI");
        hashstringset.add("GROUP4");
        System.out.println(hashstringset);

        // we can use Object class to read any type of elements
        for (Object x : hashstringset) {
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
