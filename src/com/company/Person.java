package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.trim();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.trim();
    }

    public void setAge(int age) {
        if ((age < 0) || (age > 100))
            this.age = 0;
        else
            this.age = age;
    }

    public boolean isTeen() {
        return ((12 < age) && (age < 20));
    }

    public String getFullName() {

        if ((firstName == null) && (lastName == null))
            return "";
        else if (firstName == null)
            return lastName;
        else if (lastName == null)
            return firstName.trim();
        else
            return firstName + " " + lastName;

    }


}
