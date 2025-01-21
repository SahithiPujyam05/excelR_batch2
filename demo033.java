import java.util.Iterator;
import java.util.LinkedHashSet;

class HashSetDemo3 {
    void HSetMethod() {
        // We can add only int type of element here...
        LinkedHashSet<Integer> hashintset = new LinkedHashSet<>();
        hashintset.add(99);
        hashintset.add(97);
        hashintset.add(95);
        hashintset.add(98);
        hashintset.add(89);
        System.out.println(hashintset);
        hashintset.remove(89);
        System.out.println(hashintset);
        // forEach loop: It optimized for Collections and Arrays
        int sum = 0;
        for (int x : hashintset) {
            sum += x;
        }
        System.out.println("The Sum is : " + sum);
        Iterator it = hashintset.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

public class demo033 {
    public static void main(String[] args) {
        HashSetDemo3 obj = new HashSetDemo3();
        obj.HSetMethod();
    }
}
