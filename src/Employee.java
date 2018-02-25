import java.text.NumberFormat;

public class Employee {
    private String name;
    private PositionTitle position;
    private boolean salary;
    private double payRate;
    private int shift;
    private String startDate;

    // Create the constructor to allow for all the employee date to be entered when the object is created
    Employee(String name, PositionTitle position, boolean salary, double payRate, int shift, String startDate) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.payRate = payRate;
        this.shift = shift;
        this.startDate = startDate;
    }

    // Return the employee name
    public String getName() {
        return name;
    }

    // Set the employee name
    public void setName(String name) {
        this.name = name;
    }

    // Return the employees position
    public PositionTitle getPosition() {
        return position;
    }

    // Set the employees position
    public void setPosition(PositionTitle position) {
        this.position = position;
    }

    // Return whether or not the employee is salary or not
    public boolean getSalary() {
        return salary;
    }

    // Set whether or not the employee is salary
    public void setSalary(boolean salary) {
        this.salary = salary;
    }

    // Returns the payrate of the employee, or the salary if the user is salary
    public double getPayRate() {
        return payRate;
    }

    // Set the payrate for the employee
    public void setPayRate(double pay) {
        this.payRate = pay;
    }

    // Return the employee shift
    public int getShift() {
        return shift;
    }

    // Set the employee shift
    public void setShift(int shift) {
        this.shift = shift;
    }

    // Return the start date of the employee
    public String getStartDate() {
        return startDate;
    }

    // Set the start date of the employee
    public void setStartDate(String start) {
        this.startDate = start;
    }

    public void calculate(double hoursIn) {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        double totalPay;
        totalPay = payRate * hoursIn;

        // Account for shift differentials
        if (shift == 2) {
            totalPay = totalPay + (totalPay * 0.05);
        } else if (shift == 3) {
            totalPay = totalPay + (totalPay * 0.1);
        }

        // Account for overtime
        if (salary == false) {
            if (hoursIn > 40) {
                totalPay = totalPay + ((hoursIn - 40) * (1.5 * payRate));
            }
        }

        // Display all the info accordingly
        System.out.printf("%-15s %15s %n", "Pay this week: ", format.format(totalPay));
        System.out.println("");
    }

    // Display all the user data in a formatted chart
    public void displayInfo() {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        System.out.printf("%-15s %15s %n", "Name:", name);
        System.out.printf("%-15s %15s %n", "Department: ", position.toString());
        System.out.printf("%-15s %15s %n", "Salaried?: ", salary);
        System.out.printf("%-15s %15s %n", "Pay Rate: ", format.format(payRate));
        System.out.printf("%-15s %15s %n", "Shift: ", shift);
        System.out.printf("%-15s %15s %n", "Start Date: ", startDate);
    }
}
