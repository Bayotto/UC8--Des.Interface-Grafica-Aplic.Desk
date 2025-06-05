/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konoha;

/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public abstract class Cla {

    public Cla(String nomeDoCla, String lider) {
        this.nomeDoCla = nomeDoCla;
        this.lider = lider;
    }

    public String getNomeDoCla() {
        return nomeDoCla;
    }

    public void setNomeDoCla(String nomeDoCla) {
        this.nomeDoCla = nomeDoCla;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }
    String nomeDoCla;
    String lider;
    
    public abstract void habilidadeEspecial();
    
    public void exibirDetalhes(){
        System.out.println("Nome do Cla:" + nomeDoCla + "Lider:" + lider);
    }
}
