
package com.mycompany.activity3_arcos;
public class Activity3_Arcos {
    //static strings variables and values
static String lastName = "Arcos";
static String firstName = "Name: Klint ";
static String brgy = "Address: Ponso, ";
static String town = "Polangui, ";
static String province = "Albay";
    public static void main(String[] args) {
        //printing stattic strings values
        System.out.println(firstName+lastName);
        System.out.println(brgy +town+province);
        //datattypes variables and value
        byte num1 = 127;
        short num2 = 128;
        int num3 = 847483948;
        long num4 = 993372830854775L;
        float num5 = 127.45292F;
        double num6 = 355.5493023985183;
        boolean bool = true;
        char ch = 'A';
        //printing the data types and values
        System.out.println("\nThe 8 Datatypes");
        System.out.println("boolean = "+bool);
        System.out.println("short = "+num2);
        System.out.println("double = "+num6);
        System.out.println("int = "+num3);
        System.out.println("byte = "+num1);
        System.out.println("char = "+ch);
        System.out.println("float = "+num5);
        System.out.println("long = "+num4);        
    }
}
