/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha;

/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public class ClaNara extends Cla {

    public ClaNara(String nomeDoCla, String lider) {
        super("Nara", "Shikamaru Nara");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("A manipulação de sombras é a habilidadeEspecial do clã Nara.");
    }
     public void exibirDetalhes(){
        System.out.println("Nome do Cla:" + nomeDoCla);
        System.out.println("Lider:" + lider);
    }
}
