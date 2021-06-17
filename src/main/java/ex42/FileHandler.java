package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    public static ArrayList<Person> readPeople(File file) throws FileNotFoundException {
        ArrayList<Person> people = new ArrayList<>();
        Scanner fileReader = new Scanner(file);
        String line;
        while(fileReader.hasNextLine()) {
            line = fileReader.nextLine();
            Scanner lineReader = new Scanner(line).useDelimiter(",");
            String lastName = lineReader.next();
            String firstName = lineReader.next();
            int salary = Integer.parseInt(lineReader.next());
            Person person = new Person(lastName, firstName, salary);
            people.add(person);
            lineReader.close();
        }
        fileReader.close();
        return people;
    }

    public static void printPeople(ArrayList<Person> people) {
        System.out.printf("%-15s %-15s %-15s%n", "Last", "First", "Salary");
        System.out.println("--------------------------------------");
        for(Person person : people) {
            System.out.printf("%-15s %-15s %-15d%n", person.getLastName(), person.getFirstName(), person.getSalary());
        }


    }
}
