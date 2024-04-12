package com.mycompany.anagram;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {  
    
    public static boolean isSame(String str1, String str2){
        
        str1=str1.replaceAll("\\s", "").toLowerCase();
        str2=str2.replaceAll("\\s", "").toLowerCase();
        
        if(str1.length()!=str2.length()){
                     return false;}
                   
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
     
                     return Arrays.equals(array1, array2);
            
             
    }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter String: ");
       String string1 = scanner.next();
       System.out.print("Enter String to Check: ");
       String string2 = scanner.next();
       
      boolean result = isSame(string1,string2);
      
      if(result==true){
            System.out.print(string1+" is an anagram of "+ string2);
      }
     else{
            System.out.print(string1+" is not an anagram of "+ string2);
      }
    }
}
