package com.mycompany.sortascending;
import java.util.Scanner;
public class SortAscending {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size,sort;
        int temp = 0;
        System.out.print("Enter size: ");
        size = Integer.parseInt(scanner.next());       
        int[] arr =new int [size];
        
        System.out.print("Enter elements: ");
        for(int i=0;i<size;i++){arr[i]=Integer.parseInt(scanner.next());}
    
    scanner.close();
    
    for(int i=0;i<size;i++){
    for(int j=i+1;j<size;j++){       
    if(arr[i]>arr[j]){
    temp = arr[i];
    arr[i]=arr[j];
    arr[j]=temp;}
    }}
    System.out.print    ("This is the sorted: ");
    for(int i=0; i<size; i++){
    System.out.print(arr[i]+" ");}
    }
}
