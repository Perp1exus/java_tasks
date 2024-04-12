/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniprojectguessing;
import java.util.Scanner;
/**
 *
 * @author Khay L. Arcos
 */
public class MiniProjectGuessing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guessing Game");
        
        int secretNum = 69;
        int index = 5;
        System.out.println("Enter your guesses: ");
        int guessNum = Integer.parseInt(scanner.nextLine());
        if(guessNum==secretNum){
        System.out.println("TAMA KA HAHA KISS MO AKO");
        }
        if(guessNum<secretNum){
        System.out.println("TOO LOW");
        }
        if(guessNum>secretNum){
        System.out.println("TOO HIGH");
        }        
        
        
        else{
        for(int i = 1; i<index && guessNum!=secretNum; i++)
        {               
            if(i==1){
            System.out.println("You have 3 tries left!");
            }
            if(i==2){
            System.out.println("You have 2 tries left!");
            }
            if(i==3){
            System.out.println("You have 1 tries left!");}
            if(i==4) {
            System.out.println("MALI KA HAHA KISS MO AKO");
            break;}
            
            while(guessNum!=secretNum){
            guessNum = scanner.nextInt();
            //break;
            if(guessNum==secretNum){
            System.out.println("TAMA KA HAHA KISS MO AKO");}
            if(guessNum>secretNum){
            System.out.println("Too high");}
            if(guessNum<secretNum){
            System.out.println("Too low");}
            
            break;
            }
            }
        }
        }
        }
        
        
        
          
    

