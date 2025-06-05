/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interface2705;

/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public class Guitarra implements InstrumentoMusical{

    @Override
    public void tocar() {
        System.out.println("BLEIMBLEIM");
    }

    @Override
    public void afinar() {
        System.out.println("A Guitarra foi afinada");
    }
   
}
