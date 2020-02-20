package com.java.hw.addressbook;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;

/**
 *
 * Class to represent an AddressBook that is a collection of addressEntry objects.
 *
 * Provides methods to manipulate the AddressBook Collection.
 */
public class AddressBook {

    // Collection of addresses
    LinkedList<AddressEntry>contacts;

    /**
     * Constructor to setup empty AddressBook.
     */
    public AddressBook(){
        contacts = new LinkedList<AddressEntry>();
    }

    /**
     * Remove all the reocrds for a given Last Name.
     *
     * @param lastName
     */
    public void remove(String lastName) {

        AddressEntry entry = null;
        int counter = 0;
        while((entry = findAddress(lastName)) != null) {
            contacts.remove(entry);
            counter++;
        }

        if(counter == 0 ) {
            System.out.println("No Address has been removed from AddressBook");
        } else {
            System.out.printf("%n%d addressed has been removed from AddressBook%n", counter);
        }
    }

    /**
     * Function to load AddressBook from a given File.
     *
     * @param fileName
     */
    public void readFromFile(String fileName) {
        try {

            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            int counter = 0;

            while(reader.hasNextLine()) {

                String firstName = reader.nextLine();
                String lastName = reader.nextLine();
                String street = reader.nextLine();
                String city = reader.nextLine();
                String state = reader.nextLine();
                int zip = Integer.parseInt(reader.nextLine());
                String email = reader.nextLine();
                String telephone = reader.nextLine();

                AddressEntry entry = new AddressEntry(firstName, lastName, street,
                        city, state, zip, email, telephone);

                this.contacts.add(entry);
                counter++;
            }

            // close file
            reader.close();

            System.out.printf("%nRead in %d new Addresses, successfully loaded, currently %d addressed%n",
                    counter, contacts.size());

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Helper method to find Address Entry for a given last name.
     *
     * @param lastName
     * @return address entry
     */
    private AddressEntry findAddress(String lastName) {
        for(AddressEntry entry: contacts) {
            if(entry.getLastName().equalsIgnoreCase(lastName)) {
                return entry;
            }
        }

        return null;
    }

    /**
     * Function to add new AddressEntry
     *
     * @param entry
     */
    public void add(AddressEntry entry) {
        contacts.addLast(entry);
    }

    /**
     * List all the Addressed in the AddressBook.
     */
    public void list() {

        // Sort with respect to Last name
        contacts.sort((a, b)-> a.getLastName().compareTo(b.getLastName()));

        Iterator it = contacts.iterator();
        int counter = 1;
        while(it.hasNext()){
            System.out.println(counter + ": " + it.next());
            counter++;
        }
    }

    /**
     * Function to Get the list of all the addresses that has last name starts with
     * given prefix.
     *
     * @param startOf_lastName
     * @return list of addresses
     */
    public LinkedList<AddressEntry> find(String startOf_lastName) {
        LinkedList<AddressEntry> list = new LinkedList<>();

        for(AddressEntry address: contacts) {
            if(address.getLastName().startsWith(startOf_lastName)) {
                list.add(address);
            }
        }

        return list;
    }
}
