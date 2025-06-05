/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessinggames;

import java.util.Scanner;

/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public class Player {
       private String name;
       private int plays;
       
       
       // Criar um atributo para o player
       // criar um metodo que incrementas as jogadas e outro que mostra o numero de jogadas mudar a logica do jogo,
       // para no final,mostrar quantas jogadas o player precisou fazer até acertar
       
    
    public Player(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        this.name = sc.nextLine();
    }
    public String getName(){
        return name;
    }
    public void incrementarPlays(){
        plays++;
    }
    public int getPlays(){
        return this.plays;
    }
   
}
