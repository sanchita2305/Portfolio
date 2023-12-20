package AddressBookSystem;
import java.util.ArrayList;
import java.util.List;
public class AddressBook {
    private List<Contact>contacts;
    public AddressBook(){
        this.contacts=new ArrayList<>();

    }
    public void addContact(Contact contact){
        contacts.add(contact);
    }
    public Contact findContactByName(String firstName,String lastName)
    {
       for(Contact contact:contacts){
           if(contact.getFirstName().equals(firstName)&&contact.getLastName().equals(lastName)){
               return contact;
           }
       }
       return null;
    }
    public boolean deleteContact(String firstName,String lastName){
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

}




