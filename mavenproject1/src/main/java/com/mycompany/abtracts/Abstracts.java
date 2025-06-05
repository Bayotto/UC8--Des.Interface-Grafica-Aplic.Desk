/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abtracts;

/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public class Abstracts {

    public static void main(String[] args) {
        SofaCama sofacama = new SofaCama("Marrom","madeira");
        Cama cama = new Cama("Bege","Madeira vermelha");
        sofacama.montar();
        cama.montar();
        sofacama.desmontar();
        cama.desmontar();
    }
}
