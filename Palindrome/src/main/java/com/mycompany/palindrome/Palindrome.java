package com.mycompany.palindrome;
import java.util.Scanner;

public class Palindrome {
    
    
    public static void main(String[] args){
        
    Scanner palin = new Scanner(System.in);
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
        public static boolean isPalindrome(String text){
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
}

/*
for(int i = 0; i<text.length;i++)
{for(int j = text.length-1;j>0;j--)
{

if(text.charAt(i)==text.charAt(j-1))
System.out.println(text+" is a palindrome");
return 1;

else 
System.out.println(text+" is not a palindrome");
return 0; 
}
}

 int size = text.length();   
 if(text.charAt(0)==text.charAt(size-1))   
 return 1;   
 else
 return 0;
*/
