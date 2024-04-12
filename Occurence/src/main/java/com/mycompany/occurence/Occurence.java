/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.occurence;
import java.util.Scanner;
/**
 *
 * @author Khay L. Arcos
 */
public class Occurence {
    
  
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
     System.out.println("Enter string:");
     String text = scanner.nextLine();
     System.out.println("Enter a character:");
     char input = scanner.next().charAt(0);
     int index = 0;
     char[] charArray = text.toCharArray();
     
     System.out.println("Here is the number of occurences:");
     for(char c : charArray)
     {if(c==input){
     index++;}
     }
     System.out.println(index);
      scanner.close();
      
    }
}
