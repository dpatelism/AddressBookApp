import com.java.hw.addressbook.*;

import java.util.List;

/**
 * Client Code to run the application in Interactive mode.
 */
public class AddressBookApplication {

    /**
     * Function to Run the application in interactive mode.
     * Starting point of the program.
     *
     * @param args command line arguments
     */
    public static void main(String [] args) {

        AddressBook book = new AddressBook();
        AddressEntry entry = new AddressEntry();
        String choice, input;
        List<AddressEntry> list = null;

        // Main Loop
        do {
            choice = Menu.prompt_menu();

            if(choice.equalsIgnoreCase("a")) {
                input = Menu.prompt_file();
                book.readFromFile(input);
            } else if(choice.equalsIgnoreCase("b")) {
                entry = Menu.prompt_addition();
                book.add(entry);
                System.out.println("Address has been added to the AddressBook.");
            } else if(choice.equalsIgnoreCase("c")) {
                input = Menu.prompt_Removal();
                book.remove(input);
            } else if(choice.equalsIgnoreCase("d")) {
                input = Menu.prompt_Find();
                list = book.find(input);
                int counter = 1;
                for(AddressEntry e: list) {
                    System.out.println(counter + ": " + e.toString());
                    counter++;
                }
            } else if(choice.equalsIgnoreCase("e")) {
                book.list();
            } else if(choice.equalsIgnoreCase("f")) {
                System.out.println("GoodBy!");
            }
            System.out.println();
        }while(!choice.equals("f"));
    }
 }
