
package com.mycompany.fibonacci;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int fib = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int num1 = 0;
        int num2 = 1;
        scanner.close();
        
        for(int indexadd = 0;indexadd<=fib;indexadd++)
        { 
           System.out.print(" "+sum);//this will print the
           //first number which is zero sum = 0
           num1=num2;//this states let num1=num2 which will be 
           //num1 = 1 since value of num2 is 1
           num2=sum;//this will be undefined yet no sum yet
           sum=num1+num2;//this simply add in the first loop
           //like sum = 1+0
        } 
        /*
        the next loop will display 1 then num1 will be equal to 1 
        still because that is the sum
        second since the sum 
        */
    }
}
