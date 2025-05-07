/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;

/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public class Animal {
       private String name;
    private String species;
    private double weight;
    
    //o metodo constructor, em java, deve ser delcarado como public
    // NÃO DEVE IR RETORNO(nem void)
    // Deve ter o mesmo nome EXATO da classe
    // nao existe a palavra constructor em java
    public Animal(String name,String species,double weight ){   
        this.name = name;
        this.species = species;
        this.weight = weight;
    }
    
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    
}
