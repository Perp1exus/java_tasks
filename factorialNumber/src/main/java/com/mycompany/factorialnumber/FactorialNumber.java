
package com.mycompany.factorialnumber;
import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(scanner.nextLine());
        int fact = 1;
        
        scanner.close();
        System.out.println("\n");
        
        for(int indexmul = 1;indexmul <= num; indexmul++)
        {
       fact *= indexmul;
       System.out.print(fact+"*");
        }
        System.out.println("\n");
        System.out.println(num+"!"+"="+fact);
         
    }
}
