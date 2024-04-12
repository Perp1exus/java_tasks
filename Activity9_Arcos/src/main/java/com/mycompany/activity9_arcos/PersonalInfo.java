package com.mycompany.activity9_arcos;

public class PersonalInfo {
    StringBuilder perso = new StringBuilder();
    StringBuilder fav = new StringBuilder();
    String fullName = "Klint L. Arcos";
    int age = 23;
    String address = "Ponso, Polangui, Albay";
    String nrgEmail = "jb1.karcos2023@nrgitii.edu.ph";
    String pet = "Dog and cat";
    String favPlace = "My home";
    String favColor = "Gray";

    public void basicInfo(){
        perso.append("My Personal Information\n");
        perso.append("Name: "+fullName);
        perso.append("\nAge: "+age);
        perso.append("\nNRG Email Address: "+nrgEmail+"\n");
        System.out.print(perso);
    }
    public void favInfo(){
        fav.append("\nMy Favorites");
        fav.append("\nPet/s: "+pet);
        fav.append("\nPlace: "+favPlace);
        fav.append("\nColor: "+favColor+"\n");
        System.out.print(fav);
    }    
   }

