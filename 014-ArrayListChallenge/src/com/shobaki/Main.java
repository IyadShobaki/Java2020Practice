package com.shobaki;

public class Main {

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("Iyad", "3303330300");
        Contact contact1 = new Contact("Fred" , "45780022", "fred@gmail.com");
        mobilePhone.addContact(contact1);
        mobilePhone.printContactsList();
        Contact contact2 = new Contact("Fred Jackson" , "45780022", "fred@gmail.com");
//        mobilePhone.modifyContact(0, contact2);
//        mobilePhone.printContactsList();
        mobilePhone.modifyContact("Fred", contact2);
        mobilePhone.printContactsList();
    }
}
