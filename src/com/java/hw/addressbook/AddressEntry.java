package com.java.hw.addressbook;

public class AddressEntry {

    /** Instance fields **/
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private Integer zip;
    private String telephone;
    private String email;

    /**
     * Default constructor to create AddressEntry object with default values.
     */
    public AddressEntry() {
        this.firstName = "";
        this.lastName = "";
        this.street = "";
        this.city = "";
        this.state = "";
        this.zip = 0;
        this.telephone = "";
        this.email = "";
    }

    /**
     * Parameter constructor to setup and instantiate AddressEntry Object with given
     * parameter vlaues.
     *
     * @param firstName of the AddressEntry
     * @param lastName of the AddressEntry
     * @param street of the AddressEntry
     * @param city of the AddressEntry
     * @param state of the AddressEntry
     * @param zip of the AddressEntry
     * @param telephone of the AddressEntry
     * @param email of the AddressEntry
     */
    public AddressEntry(String firstName, String lastName, String street, String city, String state,
                        Integer zip, String telephone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.telephone = telephone;
        this.email = email;
    }

    /**
     * Function to get the First Name in the AddressEntry Object.
     *
     * @return first name of AddressEntry
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Function to get the Last Name in the AddressEntry Object.
     *
     * @return last name in the AddressEntry
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Function to get the Street address in the AddressEntry Object.
     *
     * @return street address in the AddressEntry
     */
    public String getStreet() {
        return street;
    }

    /**
     * Function to get the City in the AddressEntry Object.
     *
     * @return city in the AddressEntry
     */
    public String getCity() {
        return city;
    }

    /**
     * Function to get the State in the AddressEntry Object.
     *
     * @return state in the AddressEntry
     */
    public String getState() {
        return state;
    }

    /**
     * Function to get the ZipCode in the AddressEntry Object.
     *
     * @return zip code in the AddressEntry
     */
    public Integer getZip() {
        return zip;
    }

    /**
     * FUnction to get teh Telephone in the AddressEntry Object.
     *
     * @return telephone in the AddressEntry
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Function to get the Email in the AddressEntry Object.
     *
     * @return email in the AddressEntry
     */
    public String getEmail() {
        return email;
    }

    @Override
    /**
     * String representation of the AddressEntry
     *
     * @return String representation.
     */
    public String toString() {
        return String.format("%s %s%n", firstName, lastName) +
                String.format("  %s%n", street) +
                String.format("  %s, %s %d%n", city, state, zip) +
                String.format("  %s%n", email) +
                String.format("  %s%n", telephone);
    }

}
