package AddressBookSystem;
import java.util.*;
import java.util.Scanner;
public class AddressBookMain {
    private static void addNewContact(AddressBook addressBook){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter details for new contact");
        System.out.println("First Name: ");
        String firstName=sc.nextLine();
        System.out.println("Last Name: ");
        String lastName=sc.nextLine();
        System.out.println("Address: ");
        String address=sc.nextLine();
        System.out.println("City: ");
        String city=sc.nextLine();
        System.out.println("State: ");
        String state=sc.nextLine();
        System.out.println("ZIP: ");
        String zip=sc.nextLine();
        System.out.println("Phone Number: ");
        String phoneNumber=sc.nextLine();
        System.out.println("Email: ");
        String email=sc.nextLine();
        Contact newContact=new Contact();
        addressBook.addContact(newContact);
        System.out.println("New contact added successfully..");
    }
    private static void editExistingContact(AddressBook addressBook)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the contact to edit:");
        System.out.println("First Name: ");
        String firstName=sc.nextLine();
        System.out.println("Last name: ");
        String lastName=sc.nextLine();
        Contact existingContact = addressBook.findContactByName(firstName, lastName);

        if (existingContact != null) {
            // Prompt user for new details
            System.out.println("Enter new details for the contact:");
            System.out.print("Address: ");
            String address = sc.nextLine();
            System.out.print("City: ");
            String city = sc.nextLine();
            System.out.print("State: ");
            String state = sc.nextLine();
            System.out.print("ZIP: ");
            String zip = sc.nextLine();
            System.out.print("Phone Number: ");
            String phoneNumber = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();

            existingContact.updateContact(address, city, state, zip, phoneNumber, email);
            System.out.println("Contact updated successfully!");
        } else {
            System.out.println("Contact not found.");
        }
    }
    private static void deletePerson(AddressBook addressBook) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the person to delete:");
        System.out.print("First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Last Name: ");
        String lastName = sc.nextLine();

        boolean deleted = addressBook.deleteContact(firstName, lastName);

        if (deleted) {
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Contact not found.");
        }
    }
    public static void main(String args[]){
        System.out.println("Welcome to Address Book Program in AddressBookMain class on Master Branch");
        AddressBook addressBook = new AddressBook();

        addNewContact(addressBook);

        editExistingContact(addressBook);

        deletePerson(addressBook);
    }
}
