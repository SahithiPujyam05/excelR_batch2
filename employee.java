public class employee {
    private int id;
    private String firstName;
    private String lastName;
    private String address;

    // Default constructor
    public employee() {
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.address = "";
    }

    // Parameterized constructor
    public employee(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Method to get full name
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Main method for demonstration
    public static void main(String[] args) {
        // Default constructor
        employee emp1 = new employee();
        emp1.setId(102);
        emp1.setFirstName("Alice");
        emp1.setLastName("Smith");
        emp1.setAddress("456 Avenue, Town");
        System.out.println("Employee 1 Full Name: " + emp1.getFullName());
        System.out.println("Employee 1 Address: " + emp1.getAddress());

        // Parameterized constructor
        employee emp2 = new employee(101, "John", "Doe", "123 Street, City");
        System.out.println("Employee 2 Full Name: " + emp2.getFullName());
        System.out.println("Employee 2 Address: " + emp2.getAddress());
    }
}