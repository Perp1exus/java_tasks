
package com.mycompany.activity11_arcos;
public class BasicInfo {
   
    private String name,address,email,empStatus;
    private int age,empId;    
       
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmpStatus(){
        return empStatus;
    }
    public void setEmpStatus(String empStatus){
        this.empStatus=empStatus;
    }
    public int age(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int setEmpId(){
        return empId;
    }
    public void setEmpId(int empId){
        this.empId=empId;
    }
        public void printing(){
            name = "Klint L. Arcos";
            address = "Ponso, Polangui, Albay";
            email = "jb1.karcos2023@nrgitii.edu.ph";
            empStatus = "Tesda Scholar";
            empId = 9969;
            age = 23;
            
            System.out.println("Name: "+name);
            System.out.println("Address: "+address);
            System.out.println("Email: "+email);
            System.out.println("Employment Status: "+empStatus);
            System.out.println("Employment ID: "+empId);
            System.out.println("Age: "+age);
        }
    
    
            
}










