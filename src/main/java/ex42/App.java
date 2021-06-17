/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Abdel Nabut
 */

package ex42;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class App
{
    public static void main( String[] args ) throws IOException {
        // read exercise input
        // parse input by comma
        // save each persons information separately
        // display info formatted as evenly spaced table.

        ArrayList<Person> people = new ArrayList<Person>();
        File inFile = new File("src/main/java/ex42/exercise42_input.txt");
        people = FileHandler.readPeople(inFile);
        FileHandler.printPeople(people);
    }
}
