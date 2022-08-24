package Section_8_Arrays_Lists_Autoboxing_Unboxing.MobilePhone;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        // Contacts are equal if they have the same name;
        int contactId = findContact(contact.getName());
        if (contactId == -1) {
            return myContacts.add(contact);
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (myContacts.contains(oldContact)) {
            myContacts.remove(oldContact);
            myContacts.add(newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        return myContacts.remove(contact);
    }

    private int findContact(Contact contact) {
        if (myContacts.contains(contact)) {
            return myContacts.indexOf(contact);
        }
        // contact doesn't exist.
        return -1;
    }

    private int findContact(String contactName) {
        for (int i = 0; i<myContacts.size(); i++) {
            Contact currentContact = myContacts.get(i);
            if (currentContact.getName().equals(contactName)) {
                return i;
            }
        }
        // contact doesn't exist.
        return -1;
    }

    public Contact queryContact(String contactName) {
        int contactId = findContact(contactName);
        if (contactId == -1) {
            return null;
        }
        return myContacts.get(contactId);
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i<myContacts.size(); i++) {
            Contact currentContact = myContacts.get(i);
            System.out.println(i+1 + ". " + currentContact.getName() + " -> " + currentContact.getPhoneNumber());
        }
    }
}
