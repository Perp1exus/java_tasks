
package com.mycompany.activity9_arcos;
import java.util.Scanner;
public class MyTask {
    Scanner palin = new Scanner(System.in);
    Scanner bodyMass = new Scanner(System.in);
    double height = 0;
    double weight = 0;
 
   
    
    public void checkPalindrome(){
    System.out.print("\nCheck if Palindrome");
    System.out.print("\nEnter a string: ");
    String input = palin.next();
    /*i did the lowering because for it to compare the same values
    even if one is uppercase or not
    */
    String lowering = input.toLowerCase();
    
        
        if(isPalindrome(lowering)){
            System.out.println(input+" is a Palindrome\n");
        }
        else{
            System.out.println(input+" is not a Palidrome\n");
        }
        
    }   
        public boolean isPalindrome(String text){
        int starting = 0;
        int ending = text.length()-1;

        while(starting<ending){

            if(text.charAt(starting)!=text.charAt(ending))
            {
                return false;
            }
            starting++;
            ending--;
            }
            return true;   
        }
        public void checkBMI(){
            System.out.print("Checking and Calculating BMI\n");
            System.out.print("Enter your Height in meters: ");
            height = bodyMass.nextDouble();
            System.out.print("Enter your Weight in kg: ");
            weight = bodyMass.nextDouble();
            
            height=height*height;
            
            double bmi=weight/height;
            System.out.print("Your BMI: "+bmi);
            
            if(bmi<18.5){
            System.out.print("\nStatus: Underweight");
            }
            else if(bmi>18.6||bmi<24.9){
            System.out.print("\nStatus: Normal");
            }
            else if(bmi<25.0||bmi>40){
            System.out.print("\nStatus: Obese");
            }
                   
        }
}

