
package com.mycompany.activity13_arcos;

public class SavingsAccount extends BankAccount {
   
  @Override
 
    public void withdraw(int amountwith){  
    if(!(amountwith>=100)){
    System.out.println("\nWithdrawal Succesful");
    System.out.println("Withdraw Amount: "+amountwith);
    
        } else {
          System.out.println("\nWithdrawal Override");
          super.withdraw(amountwith);
        }
    
    }   
    
}
