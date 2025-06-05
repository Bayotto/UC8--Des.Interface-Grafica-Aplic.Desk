/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interface2705;

/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public class Bateria implements InstrumentoMusical {
// Ao implementar um metodo usando implements voce deve usar Override exp abaixo.
    @Override
    public void tocar() {
        System.out.println("TUTUTUMMTUTUTUMM");
    }

    @Override
    public void afinar() {
        System.out.println("Tem como afinar uma bateria só nao sei como 👍 ");
    }
    
}
