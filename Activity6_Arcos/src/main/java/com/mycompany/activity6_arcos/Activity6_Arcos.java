package com.mycompany.activity6_arcos;
import java.util.Scanner;
public class Activity6_Arcos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        long sum = 0, product = 1;
        //inputing value and initializing int    
    System.out.print("Initial Number: ");
        //starting number
    int startNumber = Integer.parseInt(scanner.next());
    System.out.print("Number of Iterations: ");
        //iteration or index
    int iteration = Integer.parseInt(scanner.next());
    System.out.print("Common Difference: ");
        //common difference or lapses between operation
    int commonDifference = Integer.parseInt(scanner.next());
    
    //letting sum = startNumber 
    sum = startNumber;
   
    System.out.print("Sum: "+sum);
        //printing sum string outside of loop to not be repeated  
        //for looping sum string first depending on inputted interation or index
        for(int i = 1; i<iteration;i++)
        {
        //multiply index/iteration to commmonDiff rather than altering startNum   
        sum += startNumber + (i * commonDifference);
        //printing numbers to add
        System.out.print("+"+ (startNumber + (i * commonDifference)));
        }
    //printing total sum
        System.out.print("="+sum+"\n");
    
    //letting productt = startNumber     
    product = startNumber;
       
    System.out.print("Product: "+product);
        //printing product string outside of loop to not be repeated  
        //for looping sum string first depending on inputted interation or index
      
        for(int i = 1; i<iteration;i++)
        {
        //multiply index/iteration to commmonDiff rather than altering startNum  
        product *= startNumber + (i * commonDifference);
        //printing numbers to multiply
        System.out.print("*"+ (startNumber + (i * commonDifference)));
        }
        //printing total product
        System.out.print("="+product);
        
    }
}
