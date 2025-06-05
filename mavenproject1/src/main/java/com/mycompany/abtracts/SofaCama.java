/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abtracts;

/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public class SofaCama extends Mobilia{

    public SofaCama(String cor, String material) {
        super(cor, material);
    }

    @Override
    public void montar() {
        System.out.println("O sofá cama está sendo montadO!");
    }
    
}
