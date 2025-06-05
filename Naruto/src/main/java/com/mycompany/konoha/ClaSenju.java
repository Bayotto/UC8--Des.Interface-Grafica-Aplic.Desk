/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha;

/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public class ClaSenju extends Cla{

    public ClaSenju(String nomeDoCla, String lider) {
        super("Senju", "Hashirama Senju");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("A Liberação de Madeira é a habilidadeEspecial do clã Senju.");
    }
    public void exibirDetalhes(){
        System.out.println("Nome do Cla:" + nomeDoCla);
        System.out.println("Lider:" + lider);
    }
}
