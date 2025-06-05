/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha;

/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public class ClaAkimichi extends Cla {

    public ClaAkimichi(String nomeDoCla, String lider) {
        super("Akimichi", "Chouji Akimichi");
    }

   

    @Override
    public void habilidadeEspecial() {
        System.out.println("A ampliação corporal é a habilidadeEspecial do clã Akimichi.");
    }
     public void exibirDetalhes(){
        System.out.println("Nome do Cla:" + nomeDoCla);
        System.out.println("Lider:" + lider);
    }
}
