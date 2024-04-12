
package com.mycompany.activity12_arcos;

    public class ConstructorClass {
                 
        ConstructorClass(){
            System.out.println("Programming Java NCIII");
        }
        ConstructorClass(String name){
           System.out.println("\nONE PARAMETER");
           System.out.println("Name: "+ name);
        }
        ConstructorClass(String name, String idNum){
           System.out.println("\nTWO PARAMETERS");
           System.out.println("Name: "+ name);
           System.out.println("NRG ID: "+ idNum);
        }
        ConstructorClass(String name, String idNum,int age){
           System.out.println("\nTHREE PARAMETERS");
           System.out.println("Name: "+ name);
           System.out.println("NRG ID: "+ idNum);
           System.out.println("Age: "+ age);          
        }
        ConstructorClass(String name, String idNum,int age, String address){
           System.out.println("\nFOUR PARAMETERS");
           System.out.println("Name: "+ name);
           System.out.println("NRG ID: "+ idNum);
           System.out.println("Age: "+ age);
           System.out.println("Address: "+ address); 
        }
        ConstructorClass(String name, String idNum,int age, String address, String petName){
           System.out.println("\nFIVE PARAMETERS");
           System.out.println("Name: "+ name);
           System.out.println("NRG ID: "+ idNum);
           System.out.println("Age: "+ age);
           System.out.println("Address: "+ address); 
           System.out.println("Pet Name: "+ petName); 
        }
        ConstructorClass(String name, String idNum,int age, String address, String petName, int petAge){
           System.out.println("\nSIX PARAMETERS");
           System.out.println("Name: "+ name);
           System.out.println("NRG ID: "+ idNum);
           System.out.println("Age: "+ age);
           System.out.println("Address: "+ address); 
           System.out.println("Pet Name: "+ petName);
           System.out.println("Pet Age: "+ petAge+" Year Old");
        }
        ConstructorClass(String name, String idNum,int age, String address, String petName, int petAge, String petBreed){
           System.out.println("\nSEVEN PARAMETERS");
           System.out.println("Name: "+ name);
           System.out.println("NRG ID: "+ idNum);
           System.out.println("Age: "+ age);
           System.out.println("Address: "+ address); 
           System.out.println("Pet Name: "+ petName);
           System.out.println("Pet Age: "+ petAge+" Year Old");
           System.out.println("Pet Breed: "+ petBreed);
        }
}
