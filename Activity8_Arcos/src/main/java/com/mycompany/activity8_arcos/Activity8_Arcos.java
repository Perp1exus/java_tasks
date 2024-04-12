package com.mycompany.activity8_arcos;
import java.util.Arrays;

public class Activity8_Arcos {

    public static void main(String[] args) {
        
        
        String word = "PneumonouLtraMicrosCopicSilicovolcanoconiosiS";
        //String wordLower = word.toLowerCase();
        char[] wordArray = word.toCharArray();
        int conso = 0;
        System.out.print(" Consonants: " );
        for(char consonants : wordArray){
        if(!(consonants=='a'||consonants=='e'||consonants=='i'||consonants=='o'||
           consonants=='u'))
        {
           conso++;
           System.out.print(consonants+" ");
        }          
        }
        System.out.print("\n Total Number of Consonants: "+conso);
    }
}
