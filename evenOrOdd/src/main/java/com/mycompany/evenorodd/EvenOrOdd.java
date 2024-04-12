/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evenorodd;
import java.util.Scanner;
/**
 *
 * @author Khay L. Arcos
 */
public class EvenOrOdd {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter an Integer: ");
       int num = Integer.parseInt(scanner.nextLine());
        scanner.close();
       if(num%2==0){
       System.out.println("The number is even.");
       }
       else{System.out.println("The number is odd.");}
    }
}
