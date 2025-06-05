/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha;

/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public class ClaHyuuga extends Cla{

    public ClaHyuuga(String nomeDoCla, String lider) {
        super("Hyuuga","Hiashi Hyuuga");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("O Byakugan é o dojutsu/habilidadeEspecial do clã Hyuga.");
    }
     public void exibirDetalhes(){
        System.out.println("Nome do Cla:" + nomeDoCla);
        System.out.println("Lider:" + lider);
    }
}
