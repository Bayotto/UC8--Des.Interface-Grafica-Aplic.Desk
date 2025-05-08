/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;

/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public class Dog extends Animal {
    public String Breed;
    public Dog(String name, String species, double weight,String breed) {
        super(name, species, weight);
        this.Breed = breed;
    }
    
    // sobrescrever
    @Override
public void emiteSom(){
        System.out.println("o cachorro latiu");
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String Breed) {
        this.Breed = Breed;
    }
    
    
    
}
