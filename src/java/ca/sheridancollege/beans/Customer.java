/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.beans;

public class Customer {
    private String cardNumber;
    private String firstName;
    private String lastName;
    private String motherName;
    private String password;
    private String phnNumber;
    private String dob;

    public Customer() {
    }

    public Customer(String cardNumber, String firstName, String lastName, String motherName, String password, String phnNumber, String dob) {
        this.cardNumber = cardNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.motherName = motherName;
        this.password = password;
        this.phnNumber = phnNumber;
        this.dob = dob;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhnNumber(String phnNumber) {
        this.phnNumber = phnNumber;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getPassword() {
        return password;
    }

    public String getPhnNumber() {
        return phnNumber;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Customer{" + "cardNumber=" + cardNumber + ", firstName=" + firstName + ", lastName=" + lastName + ", motherName=" + motherName + ", password=" + password + ", phnNumber=" + phnNumber + ", dob=" + dob + '}';
    }
    
    
}
