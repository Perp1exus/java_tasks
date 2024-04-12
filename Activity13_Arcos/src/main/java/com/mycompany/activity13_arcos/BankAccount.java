package com.mycompany.activity13_arcos;

public class BankAccount extends PersonalInfo{
    
   private int  accountNum = 6996,  bankBalance = 1000;
   private String bankId = "AK2023";
   public int amountdep,amountwith;
    
         public void PersonalDetails(){
            personInfo();
         }
         
         public void deposit(int amountdep){        
         bankBalance += amountdep;
         System.out.println("\nBalance: "+bankBalance);
         System.out.println("Amount Deposit: "+amountdep);                 
         }  

         public void withdraw(int amountwith ){
            
         if(amountwith<=bankBalance){
            bankBalance-=amountwith;  
         System.out.println("\nBalance: "+bankBalance);
         System.out.println("Amount Withdraw: "+amountwith);
         
         }
         
         else{
            System.out.println("\nInsufficient Funds.");
            SavingsAccount save = new SavingsAccount();
            save.withdraw(amountwith);
         }
         } 
 
         public void BankAccount(){
         System.out.println("Account Number: "+accountNum);
         System.out.println("Bank Balance: "+bankBalance);
         System.out.println("Bank Id: "+bankId);     
         }            
}
