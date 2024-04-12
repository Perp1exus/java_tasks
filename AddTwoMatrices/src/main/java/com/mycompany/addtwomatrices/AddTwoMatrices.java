package com.mycompany.addtwomatrices;
import java.util.Scanner;


public class AddTwoMatrices {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = input.nextInt();
        System.out.print("Enter columns: ");
        int cols = input.nextInt();
        
        int data[][] = new int [rows][cols];

        
        System.out.println("Enter elements: ");
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){               
                data[i][j] = input.nextInt();
            } 
        }
       
        
    }
}
