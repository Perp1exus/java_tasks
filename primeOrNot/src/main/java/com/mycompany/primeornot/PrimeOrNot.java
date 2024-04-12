/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeornot;
import java.util.Scanner;
/**
 *
 * @author Khay L. Arcos
 */
public class PrimeOrNot {

    public static void main(String[] args) {
        /*prime number is whose sum of digits are divisible
        by three so what we will do is %3==0
    */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(scanner.nextLine());
        // if num is divisible by only 1
        scanner.close();
        
        
        if((num%3==0)||(num%2==0)||(num==1))
        {if((num==2)||(num==3))
        System.out.println("Prime Number.");
        else if((num%3==0)||(num%2==0)||(num==1)){
        System.out.println("Not Prime Number");
        }
        }
        else{System.out.println("Prime Number.");}
    }
}
