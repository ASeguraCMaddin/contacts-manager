
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

        System.out.println("Initializing Contacts Manager Application................");
        System.out.println("1010101 10100101 101 0001 010101 1010100010 101001010101111101");
        System.out.println("Hello and Welcome to your Contacts Manager!");
        System.out.println("  _\n" +
                "  | |\n" +
                "  |_|\n" +
                "  /_\\    \\ | /\n" +
                ".-\"\"\"------.----.\n" +
                "|          U    |\n" +
                "|               |\n" +
                "| ====o======== |\n" +
                "| ============= |\n" +
                "|               |\n" +
                "|_______________|\n" +
                "| ________GF337 |\n" +
                "||   Welcome   ||\n" +
                "||             ||\n" +
                "||_____________||\n" +
                "|__.---\"\"\"---.__|\n" +
                "|---------------|\n" +
                "|[Yes][(|)][ No]|\n" +
                "| ___  ___  ___ |\n" +
                "|[<-'][CLR][.->]|\n" +
                "| ___  ___  ___ |\n" +
                "|[1__][2__][3__]|\n" +
                "| ___  ___  ___ |\n" +
                "|[4__][5__][6__]|\n" +
                "| ___  ___  ___ |\n" +
                "|[7__][8__][9__]|\n" +
                "| ___  ___  ___ |\n" +
                "|[*__][0__][#__]|\n" +
                "`--------------'\n" +
                "{__|\"\"|_______'-\n" +
                "`---------------'");
        System.out.println("Enter a number (0,1,2,3,4) to access the desired option!");

        do {
            contactOptions();
            System.out.println("What would you like to do? ");
            userInput = sc.next();

            if (userInput.equals("1")) {
                System.out.println("Displaying registered Contacts.................");
                System.out.println("\n Contacts Manager table base Initialized!");
                System.out.println("\n        Name       |   Phone Number   |");
                System.out.println("-------------------| ---------------- |");
                showAllContacts();
            } else if (userInput.equals("2")) {
                System.out.println("addContact method initialized!");
                addContact();
            } else if (userInput.equals("3")) {
                System.out.println("searchByName method initialized!");
                searchByName();
            } else if (userInput.equals("4")) {
                System.out.println("deleteContact method initialized!");
                deleteContact();
            }

            System.out.println();

        } while (!userInput.equals("0"));

        System.out.println("Exiting Contact Manager Application!");
        System.out.println("Good-bye!!!");
        System.out.println("                  ___________\n" +
                "                   /.---------.\\`-._\n" +
                "                  //          ||    `-._\n" +
                "                  || `-._     ||        `-._\n" +
                "                  ||     `-._ ||            `-._\n" +
                "                  ||    _____ ||`-._            \\\n" +
                "            _..._ ||   | __ ! ||    `-._        |\n" +
                "          _/     \\||   .'  |~~||        `-._    |\n" +
                "      .-``     _.`||  /   _|~~||    .----.  `-._|\n" +
                "     |      _.`  _||  |  |23| ||   / :::: \\    \\\n" +
                "     \\ _.--`  _.` ||  |  |56| ||  / ::::: |    |\n" +
                "      |   _.-`  _.||  |  |79| ||  |   _..-'   /\n" +
                "      _\\-`   _.`O ||  |  |_   ||  |::|        |\n" +
                "    .`    _.`O `._||  \\    |  ||  |::|        |\n" +
                " .-`   _.` `._.'  ||   '.__|--||  |::|        \\\n" +
                "`-._.-` \\`-._     ||   | \":  !||  |  '-.._    |\n" +
                "         \\   `--._||   |_:\"___||  | ::::: |   |\n" +
                "          \\  /\\   ||     \":\":\"||   \\ :::: |   |\n" +
                "           \\(  `-.||       .- ||    `.___/    /\n" +
                "           |    | ||   _.-    ||              |\n" +
                "           |    / \\\\.-________\\\\____.....-----'\n" +
                "           \\    -.      \\ |         |\n" +
                "            \\     `.     \\ \\        | \n" +
                " __________  `.    .'\\    \\|        |\\  _________\n" +
                "LGB            `..'   \\    |        | \\          \n" +
                "                \\\\   .'    |       /  .`.\n" +
                "                | \\.'      |       |.'   `-._\n" +
                "                 \\     _ . /       \\_\\-._____)\n" +
                "                  \\_.-`  .`'._____.'`.\n" +
                "                    \\_\\-|             |\n" +
                "                         `._________.'");


    }


    //displays all application options
    public static void contactOptions () {
        System.out.println("0 -==+==- Exit");
        System.out.println("1 -==+==- View all contacts.");
        System.out.println("2 -==+==- Add a new contact.");
        System.out.println("3 -==+==- Search by Contact Name");
        System.out.println("4 -==+==- Delete an existing Contact");
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
        System.out.println(userInput + " has been added!");
        System.out.println("addContact successful!");
        System.out.println("   _______\n" +
                "     /` _____ `\\;,\n" +
                "    /__(^===^)__\\';,\n" +
                "      /  :::  \\   ,;\n" +
                "     |   :::   | ,;'\n" +
                "jgs  '._______.'`");
    }


    // enables user to search by first name, last name, or 10-digit phone#
    public static void searchByName() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("To search for a contact, please enter either their Last or First name. Or even by their 10-digit phone number. ");
        String userInput = sc.nextLine();

        System.out.println("Please wait.........");
        System.out.println("**-+=+-****-+=+-****-+=+-****-+=+-****-+=+-****-+=+-****-+=+-****-+=+-**");
        System.out.println("Search for user input successful!");

        List<String> lines = Files.readAllLines(Paths.get("src", "contacts.txt"));
            for (String line : lines) {
                if (line.contains(userInput)) {
                    System.out.println(userInput + " was found!");
                    System.out.println("Displaying search contact...................");
                    System.out.println(line);
                    } else {
                    System.out.println("Your input does not match any contacts, Please try again ");
                    }

                    }

            }


        //get delete function to work
    public static void deleteContact() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("To delete a contact, please enter either their Last or First name. Or even by their 10-digit phone number. ");
        String userInput = sc.nextLine();

        List<String> lines = Files.readAllLines(Paths.get("src", "contacts.txt"));
        List<String> newList = new ArrayList<>();
        for (String line : lines) {
            if (line.contains(userInput)) {
                newList.remove(userInput);
                continue;
            }
            newList.add(line);
        }      //FIXED IT
        Files.write(Paths.get("src", "contacts.txt"), newList);
        System.out.println(userInput + " has been deleted!");
        System.out.println("   _______\n" +
                "     /` _____ `\\;,\n" +
                "    /__(^===^)__\\';,\n" +
                "      /  :::  \\   ,;\n" +
                "     |   :::   | ,;'\n" +
                "jgs  '._______.'`");
        System.out.println("deleteContact successful!");
        }


}











