import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Creating a Person object
        LocalDate dobPerson = LocalDate.of(2004, 12, 03);
        Person person = new Person("Dhruva", dobPerson);

        // Displaying person details
        person.displayName();
        person.displayAge();

        // Creating an Employee object
        LocalDate dobEmployee = LocalDate.of(2004, 07, 07);
        Employee employee = new Employee("Piyush", dobEmployee, 1001, 50000.0);

        // Displaying employee details
        employee.displayEmployeeDetails();
    }
}