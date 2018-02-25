public class Main {
    public static void main(String args[]) {
        Employee employee1 = new Employee("Jane Doe", PositionTitle.ADMINISTRATION, true, 27.00, 1, "1/1/2017");
        Employee employee2 = new Employee("John Smith", PositionTitle.MAINTENANCE, false, 21.00, 3, "4/23/2014");
        Employee employee3 = new Employee("Larry Jackson", PositionTitle.PRODUCTION, false, 22.00, 2, "6/12/2006");

        employee1.displayInfo();
        employee1.calculate(45);

        employee2.displayInfo();
        employee2.calculate(35);

        employee3.displayInfo();
        employee3.calculate(50);

    }
}
