package com.digicontact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AddressBookService {

    private ArrayList<Contact> contacts = new ArrayList<>();

    // Add Contact with Duplicate Validation
    public void addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(contact.getFullName())) {
                System.out.println("Duplicate contact found. Cannot add.");
                return;
            }
        }
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    // Edit Contact by Name
    public void editContact(String firstName, String lastName,
                            String phone, String email, Address address) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(firstName)
                    && c.getLastName().equalsIgnoreCase(lastName)) {
                c.setPhoneNumber(phone);
                c.setEmail(email);
                c.setAddress(address);
                System.out.println("Contact updated successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Delete Contact by Name
    public void deleteContact(String firstName, String lastName) {
        boolean removed = contacts.removeIf(
                c -> c.getFirstName().equalsIgnoreCase(firstName)
                  && c.getLastName().equalsIgnoreCase(lastName)
        );

        if (removed) {
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Search by City
    public void searchByCity(String city) {
        System.out.println("\nContacts in city: " + city);
        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(city)) {
                System.out.println(c);
            }
        }
    }

    // Search by State
    public void searchByState(String state) {
        System.out.println("\nContacts in state: " + state);
        for (Contact c : contacts) {
            if (c.getAddress().getState().equalsIgnoreCase(state)) {
                System.out.println(c);
            }
        }
    }

    // Display All Contacts Sorted Alphabetically
    public void displayAllContacts() {
        Collections.sort(contacts,
                Comparator.comparing(Contact::getFullName));

        System.out.println("\n--- Address Book Contacts ---");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
