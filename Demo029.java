package ps002;

public class Demo029 {
    public static void main(String[] args) {
        int i = 10;
        String arr[] = new String[i];
        arr[0] = "Sahithi";
        arr[1] = "Ashu";
        arr[2] = "Nikhitha";
        arr[3] = "Charan";
        arr[4] = "Rishi";
        arr[5] = "Lavanya";
        arr[6] = "Ramya";
        arr[7] = "Yaswanth";
        arr[8] = "Nikhil";
        arr[9] = "Santosh";
        System.out.println("Array elements are:");
        for (int j = 0; j < arr.length; j++) {
            System.out.println("arr[" + j + "] = " + arr[j]);
        }
    }
}
