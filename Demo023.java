class Demo23 {
    private double basePay;
    private int hoursWorked;

    public Demo23() {
    }

    public Demo23(double basePay, int hoursWorked) {
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }

    public void computeSalary() {

        if (basePay < 8.00) {
            System.out.println("Error: Base pay must be at least $8.00 per hour.");
            return;
        }
        if (hoursWorked > 60) {
            System.out.println("Error: Hours worked must not exceed 60 hours.");
            return;
        }

        double totalPay = 0.0;
        if (hoursWorked <= 40) {
            totalPay = hoursWorked * basePay;
        } else {
            int overtimeHours = hoursWorked - 40;
            totalPay = (40 * basePay) + (overtimeHours * basePay * 1.5);
        }
        System.out.printf("Total pay: $%.2f%n", totalPay);
    }

    public static void main(String[] args) {
        Demo23 employee1 = new Demo23(7.50, 35);
        employee1.computeSalary();

        Demo23 employee2 = new Demo23(8.20, 47);
        employee2.computeSalary();

        Demo23 employee3 = new Demo23(10.00, 3);
        employee3.computeSalary();
    }
}