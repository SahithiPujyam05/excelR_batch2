public class Demo013 {
    public static void main(String[] args) {
        int a = 10;
        int b = -a;
        int c = +a;
        int d = ++a;
        int e = a++;
        int f = --a;
        int g = a--;

        System.out.println("Original value of a: " + a);
        System.out.println("Unary minus (-a): " + b);
        System.out.println("Unary plus (+a): " + c);
        System.out.println("Pre-increment (++a): " + d);
        System.out.println("Post-increment (a++): " + e);
        System.out.println("Pre-decrement (--a): " + f);
        System.out.println("Post-decrement (a--): " + g);
    }
}