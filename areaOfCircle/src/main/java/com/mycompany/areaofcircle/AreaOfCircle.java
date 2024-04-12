
package com.mycompany.areaofcircle;
import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        double area = 0;
        System.out.print("Enter radius: ");
        double radius = Double.parseDouble(scanner.nextLine());
        scanner.close();
        
        radius*=radius;
        area = pi*radius;
        
        System.out.println("The area is: "+area);
    }
}
