public class Demo005 {
    public static void main(String[] args) {
        String username = "User001";
        String password = "User_001";
        while ((username == "User001") && (password == "User_001")) {
            System.out.println("Hello User");
            break;
        }
    }
}