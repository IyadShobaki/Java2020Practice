package com.shobaki;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;

    private ArrayList<Contact> contacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<>();
    }
    public boolean addContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        contacts.add(contact);
        return true;
    }
    private int findContact(Contact contact){
        return contacts.indexOf(contact);
    }
    private int findContact(String contactName){
        for(int i=0; i< contacts.size(); i++){
            Contact contact = contacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public void printContactsList(){
        System.out.println("You have " + contacts.size() + " contact in your list.");
        for(int i =0; i<contacts.size(); i++){
            System.out.println((i+1) + ". " + contacts.get(i).getName() + ", phone number: " +
                    contacts.get(i).getPhoneNumber());
        }
    }


    public void modifyContact(String currentContact, Contact newContact){
        int position = findContact(currentContact);
        if(position >= 0){
            modifyContact(position, newContact);
        }
    }
    public void modifyContact(int position, Contact newContact){
        contacts.set(position, newContact);
        System.out.println("Contact " + (position +1) + " has been modified");

    }
}
