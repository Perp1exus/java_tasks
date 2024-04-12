package com.mycompany.activity9_arcos;

    public class MyTaskArrays {
    int[] arr1 = {5, 10, 30, 35, 50, 2};
    int[] arr2 = {8, 12, 3, 15, 19, 20};   
    int sum = 0;
    
    public void sumArrays(){
    
        for(int i=0;i<6;i++){
        sum+=arr1[i];
        sum+=arr2[i];
        }
        System.out.print("\nThe Two Arrays\n");
        System.out.println("Sum of two Arrays = "+sum);
        System.out.println("Product of two Arrays = "+sum*2);
    }   
    }


