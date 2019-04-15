package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person bryan = new Person();
        bryan.setFirstName("Bryan");
        bryan.setLastName("Bergman");
        bryan.setAge(35);
        System.out.println("full name= "+bryan.getFullName());
        System.out.println("teen= "+bryan.isTeen());

        Person john = new Person();
        john.setFirstName("John");
        john.setAge(12);
        System.out.println("fullName= " + john.getFullName());
        System.out.println("teen= "+ john.isTeen());
        john.setLastName("Smith");
        System.out.println("fullname= "+ john.getFullName());

    }
}
