/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumofnumbers;
import java.util.Scanner;
/**
 *
 * @author Khay L. Arcos
 */
public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Num: ");
        int firstNum = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Second Num: ");
        int secondNum = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.printf("%d + %d = %d", firstNum, secondNum, firstNum + secondNum);
        
        
    }
}
