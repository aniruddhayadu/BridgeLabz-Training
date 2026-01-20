package com.digicontact;

public class AddressBookApp {

    public static void main(String[] args) {

        AddressBookService service = new AddressBookService();

        service.addContact(new Contact(
                "Anni", "Yadav",
                "9876543210",
                "anni@gmail.com",
                new Address("Bhopal", "MP", "462001")
        ));

        service.addContact(new Contact(
                "Arif", "Raja",
                "9123456780",
                "arif@gmail.com",
                new Address("Rewa", "MP", "486001")
        ));

        service.addContact(new Contact(
                "Neha", "Verma",
                "9988776655",
                "neha@gmail.com",
                new Address("Indore", "MP", "452001")
        ));

        // Duplicate Check
        service.addContact(new Contact(
                "Anni", "Yadav",
                "0000000000",
                "duplicate@gmail.com",
                new Address("Delhi", "DL", "110001")
        ));

        // Edit Contact
        service.editContact(
                "Neha", "Verma",
                "9999999999",
                "neha_updated@gmail.com",
                new Address("Indore", "MP", "452010")
        );

        // Search
        service.searchByCity("Bhopal");
        service.searchByState("MP");

        // Display All Contacts
        service.displayAllContacts();

        // Delete Contact
        service.deleteContact("Arif", "Raja");

        // Final Display
        service.displayAllContacts();
    }
}
