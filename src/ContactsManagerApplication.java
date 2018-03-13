
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ContactsManagerApplication {

    public static void main(String[] args) throws IOException {
//        Input input = new Input();
        Scanner sc = new Scanner(System.in);


        String userInput;

        System.out.println("Welcome to your Contacts Manager!");
        System.out.println("Enter a number (0-4) to access the desired option!");

        do {
            contactOptions();
            System.out.println("What would you like to do? ");
            userInput = sc.next();

            if (userInput.equals("1")) {
                System.out.println("\nHere is your Contacts table!");
                System.out.println("\n       Name       |   Phone Number   |");
                System.out.println("-------------------| ---------------- |");
                showAllContacts();
            } else if (userInput.equals("2")) {
                addContact();
            } else if (userInput.equals("3")) {
                searchByName();
            } else if (userInput.equals("4")) {

            }

            System.out.println();

        } while (!userInput.equals("0"));

        System.out.println("Exiting Contact Manager Application!");
        System.out.println("Good-bye!!!");


    }


    //displays all application options
    public static void contactOptions () {
        System.out.println("0 -===- Exit");
        System.out.println("1 -===- View all contacts.");
        System.out.println("2 -===- Add a new contact.");
        System.out.println("3 -===- Search by Contact Name");
        System.out.println("4 -===- Delete an existing Contact");
    }


    //displays all the contacts from contacts.txt
    public static void showAllContacts() throws IOException {
        Path contactsListPath = Paths.get("src", "contacts.txt");
        List<String> contactsList = Files.readAllLines(contactsListPath);
        for (int i = 0; i < contactsList.size(); ++i) {
//            String line = contactsList.get(i);

            System.out.println((i + 1) + ": " + contactsList.get(i));
//            String output = "";
//            output += String.format("%-7d", i);
//            output += String.format("|%-9d", i * i);
//            output += String.format("|%d", i * i * i);
//            System.out.println(output);

//            System.out.printf("%s: %s", i + 1, line);


        }

    }



    //allows user to add contacts
    public static void addContact() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter First and Last Name, followed by the 10-digit phone number. ");
        String userInput = sc.nextLine();


         Files.write(
                Paths.get("src", "contacts.txt"),
                Arrays.asList(userInput), // list with one item
                StandardOpenOption.APPEND
        );
    }

    public static void searchByName() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("To search for a contact, please enter either their Last or First name. Or even by their 10-digit phone number. ");
        String userInput = sc.nextLine();

        List<String> lines = Files.readAllLines(Paths.get("src", "contacts.txt"));
//                List<String> newList = new ArrayList<>();
            for (String line : lines) {
                if (line.contains(userInput)) {
                    System.out.println(userInput + " was found!");
                    System.out.println(line);
//                    continue;
                    } else {
                    System.out.println("Your input does not match any contacts, Please try again ");
                    }
//
                    }
//
            }







    }




