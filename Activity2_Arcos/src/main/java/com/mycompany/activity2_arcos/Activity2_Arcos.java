package com.mycompany.activity2_arcos;

public class Activity2_Arcos {
    //static variables with data types and values
static String firstName = "Klint ";
static String lastName = "Arcos";
    //instance variables with data types and values
    String barangay = "Barangay: Ponso";         
    String municipality = "Municipality: Polangui"; 
    String province = "Province: Albay";     
    public static void main(String[] args) {
        //calling instances variables to be recognize in methods
        Activity2_Arcos stringNew = new Activity2_Arcos();
        //integer value
        int age = 23;
        //printing values
        System.out.println("Full Name: "+firstName+lastName);
        System.out.println(stringNew.barangay);
        System.out.println(stringNew.municipality);
        System.out.println(stringNew.province);
        System.out.println("Age: "+30);            
    }
}
