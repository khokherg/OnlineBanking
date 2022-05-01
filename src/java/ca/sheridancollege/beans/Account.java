/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.beans;

/**
 *
 * @author gurpreet
 */
public class Account {
   private String  cardnumber;
     private double savingamount;
     private double chequingamount;
     private double visaamount;

    public Account() {
    }

    public Account(String cardnumber, double savingamount, double chequingamount, double visaamount) {
        this.cardnumber = cardnumber;
        this.savingamount = savingamount;
        this.chequingamount = chequingamount;
        this.visaamount = visaamount;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public void setSavingamount(double savingamount) {
        this.savingamount = savingamount;
    }

    public void setChequingamount(double chequingamount) {
        this.chequingamount = chequingamount;
    }

    public void setVisaamount(double visaamount) {
        this.visaamount = visaamount;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public double getSavingamount() {
        return savingamount;
    }

    public double getChequingamount() {
        return chequingamount;
    }

    public double getVisaamount() {
        return visaamount;
    }

    @Override
    public String toString() {
        return "Account{" + "cardnumber=" + cardnumber + ", savingamount=" + savingamount + ", chequingamount=" + chequingamount + ", visaamount=" + visaamount + '}';
    }

    
   
     
}
