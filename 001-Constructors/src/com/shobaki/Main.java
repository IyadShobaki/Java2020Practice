package com.shobaki;

public class Main {

    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount();
//        bankAccount.deposit(200);
//        bankAccount.withdraw(300);
//        bankAccount.withdraw(200);
//        BankAccount iyadAccount = new BankAccount( "12345",
//                1000000.00,
//                "Iyad",
//                "email@gmail.com",
//                124356);
//        System.out.println(iyadAccount.toString());
//
//        BankAccount anotherAccount = new BankAccount("Bob", "bob@email.com",325432534);
//        System.out.println(anotherAccount.toString());
//
//        System.out.println("************************************");
//
//        VipCustomer vipCustomer = new VipCustomer();
//        System.out.println("Name " + vipCustomer.getName() +" Credit limit " +
//                vipCustomer.getCreditLimit() + " Email "+vipCustomer.getEmailAddress() );
//
//        VipCustomer vipCustomer1 = new VipCustomer("Bob" , 25000.00);
//        System.out.println("Name " + vipCustomer1.getName() +" Credit limit " +
//                vipCustomer1.getCreditLimit() + " Email "+vipCustomer1.getEmailAddress() );
//        VipCustomer vipCustomer2 = new VipCustomer("Jack", 5000.00, "jack@email.com");
//        System.out.println("Name " + vipCustomer2.getName() +" Credit limit " +
//                vipCustomer2.getCreditLimit() + " Email "+vipCustomer2.getEmailAddress() );


        System.out.println("*****************************");

        Wall wall = new Wall(5,4);
        System.out.println("area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("Height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());

        System.out.println("*****************************");

        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2,2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
