package util;


import util.Input;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class ContactsManagerApplication {

    public static void main(String[] args) {
        Input input = new Input();
        String userInput;

        System.out.println("Welcome to your Contacts Manager!");
        System.out.println("Enter a number (0-4) to access the desired option!");
git
        do {
            contactOptions();
            System.out.println("What would you like to do? ");
            userInput = input.getString();

            if (userInput.equals("1")) {
                showAllContacts();
            } else if (userInput.equals("2")) {

            } else if (userInput.equals("3")) {

            } else if (userInput.equals("4")) {


            }

            System.out.println();

        } while (!userInput.equals("0"));

        System.out.println("Exiting Contact Manager Application!");
        System.out.println("Good-bye!!!");


    }


    public static void contactOptions() {
        System.out.println("0 -===- Exit");
        System.out.println("1 -===- View all contacts.");
        System.out.println("2 -===- Add a new contact.");
        System.out.println("3 -===- Search by Contact Name");
        System.out.println("4 -===- Delete an existing Contact");
    }

    public void showAllContacts() {
//        Movie[] allMovies = MoviesArray.findAll();
//        for (Movie movie : allMovies) {
//            System.out.println("**---+---+---+---+---+---+---+---+---**");
//            System.out.print("| ");
//            System.out.println(movie.getNameIs() + " -- " + movie.getCategoryOf());
//            System.out.print("| ");
//            System.out.println("**---+---+---+---+---+---+---+---+---**");
//
//        }


//        Path contactsPath = Paths.get("util", "contacts.txt");
//        List<String> contactsList = Files.readAllLines(contactsPath);
//        for (int i = 0; i < contactsList.size(); i += 1) {
//            System.out.println((i + 1) + ": " + contactsList.get(i));
//        }

        List<String> contactsClass = Files.readAllLines(Paths.get("util", "contacts.txt"));

        for (int i = 0; i < contactsClass.size(); ++i) {
            String Line = contactsClass.get(i);
            System.out.printf("%s: %s", i + 1, line);
        }
    }

    public void addContact() {
        Input input = new Input();
        String userInput;

        Files.write(
                Paths.get("util", "contacts.txt"),
                Arrays.listOf(userInput), // list with one item
                StandardOpenOption.APPEND
        );
    }

}
