/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.konoha;

/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public class Konoha {

    public static void main(String[] args) {
        ClaUchiha clauchiha = new ClaUchiha("Uchiha", "Sasuke Uchiha");
        clauchiha.habilidadeEspecial();
        clauchiha.exibirDetalhes();
        System.out.println("\n------------------------------\n");
        
        ClaHyuuga clahyuuga = new ClaHyuuga("Hyuuga","Hiashi Hyuuga");
        clahyuuga.habilidadeEspecial();
        clahyuuga.exibirDetalhes();
        System.out.println("\n------------------------------\n");
        
        ClaNara clanara = new ClaNara("Nara", "Shikamaru Nara");
        clanara.habilidadeEspecial();
        clanara.exibirDetalhes();
        System.out.println("\n------------------------------\n");
        
        ClaAkimichi claakimichi = new ClaAkimichi("Akimichi", "Chouji Akimichi");
        claakimichi.habilidadeEspecial();
        claakimichi.exibirDetalhes();
        System.out.println("\n------------------------------\n");
        
        ClaSenju clasenju = new ClaSenju("Senju", "Hashirama Senju");
        clasenju.habilidadeEspecial();
        clasenju.exibirDetalhes();
        System.out.println("\n------------------------------\n");
    }
    
}
