package ex42;

public class Person {
    private final String lastName;
    private final String firstName;
    private final int salary;

    public Person(String lastName, String firstName, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public String getLastName() {
        return this.lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public int getSalary() {
        return this.salary;
    }
}
