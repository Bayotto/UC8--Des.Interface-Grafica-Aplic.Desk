/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedrapapeltesoura;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public class GamePedraPapelTesoura {

    int playerVitorias = 0;
    int pcVitorias = 0;

    public void Jogaço(){
    while(true){
       
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //manda o jogador escolher umas das opcoes
        System.out.print("Escolha: pedra, papel ou tesoura: ");
        String jogador = scanner.nextLine();

        // faz o computar escolher aleatoriamente umas das tres(que no quaso e entre 0 a 2) opcoes
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String computador = opcoes[random.nextInt(3)];

        //mostra a escolha do computador
        System.out.println("Computador escolheu: " + computador);

        //compara a resposta minha e do computador se for igual vai dar empate
        if (jogador.equals(computador)) {

            System.out.println("Empate!");

        } else if ((jogador.equals("pedra") && computador.equals("tesoura"))
                || (jogador.equals("papel") && computador.equals("pedra"))
                || (jogador.equals("tesoura") && computador.equals("papel"))) {
            System.out.println("Você venceu!");
            playerVitorias++;
        } else {
            System.out.println("Você perdeu!");
            pcVitorias++;
        }

        if (playerVitorias == 2 || pcVitorias == 2) {
            System.out.println("ACABOU O JOGO");
          return;
        }

    }
    }
}
