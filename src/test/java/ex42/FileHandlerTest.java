package ex42;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FileHandlerTest {

    @Test
    void readPeople() throws FileNotFoundException {
        File file = new File("src/main/java/ex42/exercise42_input.txt");
        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Person> testPeople = new ArrayList<>();
        Person personOne = new Person("Ling","Mai",55900);
        Person personTwo = new Person("Johnson","Jim",56500);
        Person personThree = new Person("Jones","Aaron",46000);
        Person personFour = new Person("Jones","Chris",34500);
        Person personFive = new Person("Swift","Geoffrey",14200);
        Person personSix = new Person("Xiong","Fong",65000);
        Person personSeven = new Person("Zarnecki","Sabrina",51500);
        testPeople.add(personOne);
        testPeople.add(personTwo);
        testPeople.add(personThree);
        testPeople.add(personFour);
        testPeople.add(personFive);
        testPeople.add(personSix);
        testPeople.add(personSeven);
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
        for(int i = 0; i < testPeople.size(); i++) {
            assertEquals(testPeople.get(i).getLastName(), people.get(i).getLastName());
            assertEquals(testPeople.get(i).getFirstName(), people.get(i).getFirstName());
            assertEquals(testPeople.get(i).getSalary(), people.get(i).getSalary());
        }

    }
    
}