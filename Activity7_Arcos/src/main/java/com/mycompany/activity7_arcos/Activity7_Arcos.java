package com.mycompany.activity7_arcos;

public class Activity7_Arcos {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        //variable to store sum and product
        int sumOdd = 0;
        int sumEven = 0;
        int countOdd = 0,countEven = 0;
        //initializing new variable for even and odd
        int[] odd = new int [numbers.length];
        int[] even = new int [numbers.length];
        //odd loop
        System.out.print(" Odd Numbers: ");
        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0||numbers[i]==0){               
            continue;
            }
            else{ 
            sumOdd+=numbers[i];
            odd[countOdd++]=numbers[i];}
        }      
        for(int i=0;i<numbers.length-countOdd;i++){
            System.out.print(odd[i]+" ");
        }                     
        //even loop
        System.out.print("\n Even Numbers: ");
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==1||numbers[i]==0){
                continue;
            }
            else{
            sumEven+=numbers[i];
            even[countEven++]=numbers[i];
            }
        }
         for(int i=0;i<numbers.length-countEven;i++){
            System.out.print(even[i]+" ");
        }      
        
//        for(int oe: odd)
//        {System.out.print(oe);}
        
        //sum odd and even print
        System.out.print("\n Sum of Odd Array Elements : "+sumOdd);
        System.out.print("\n Sum of Even Array Elements : "+sumEven);
        
    }
}
