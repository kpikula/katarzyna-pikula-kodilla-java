package com.kodilla.good.patterns.challenges.Allegro;

public class User {
    String firstName;
    String lastName;
    int iD;
    String telephoneNumber;
    String eMail;

    public User(String firstName, String lastName, int iD, String telephoneNumber, String eMail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iD = iD;
        this.telephoneNumber = telephoneNumber;
        this.eMail = eMail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getiD() {
        return iD;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getEMail() {
        return eMail;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", ID " + iD + ", telephone No. " + telephoneNumber + ", email " + eMail;
    }
}
