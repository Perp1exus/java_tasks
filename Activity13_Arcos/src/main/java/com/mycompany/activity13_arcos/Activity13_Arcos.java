package com.mycompany.activity13_arcos;


public class Activity13_Arcos {

    public static void main(String[] args) {
        BankAccount kek = new BankAccount();
        kek.PersonalDetails();
        kek.BankAccount();
        // total balance 1120
        kek.deposit(120);
        kek.withdraw(1110);   
     
        SavingsAccount kel = new SavingsAccount();
        kel.withdraw(800);
        
        
}
}