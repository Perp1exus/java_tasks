package exceptionhandling;
import java.util.Scanner;

public class Activity16_Arcos {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
       System.out.print("Enter a number: ");
       int num = scanner.nextInt();
       
       CheckNumbers check = new CheckNumbers();
       check.numbers(num);
       
       scanner.close();
    }
}
