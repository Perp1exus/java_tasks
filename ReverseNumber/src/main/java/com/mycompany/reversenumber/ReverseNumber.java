
package com.mycompany.reversenumber;
import java.util.Scanner;
public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int size = Integer.parseInt(scanner.nextLine());
        
        int[]array = new int [size];
        
        System.out.println("Enter elements: ");
        for(int i = 0; i<size; i ++)
        {
        array[i] = Integer.parseInt(scanner.nextLine());
        }       
        System.out.println("Here is the reversed list: ");
        for(int j = array.length-1; j>=0; j--)
        {
            System.out.println(array[j]);
        }
           
    }
}
