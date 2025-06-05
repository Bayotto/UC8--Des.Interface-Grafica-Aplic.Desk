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
public class Game {
     private int numberToGuess;// Número Aléatorio
     
     private Player player;
     private GuessValidator guessValidator;
     private Scanner scanner;
     
    public Game(){
        this.numberToGuess = (int)(Math.random() * 100) + 1;
        this.player = new Player();
        this.guessValidator = new GuessValidator();
        this.scanner = new Scanner(System.in);
    }
    public void start(){
        // Logica do jogo será adicionada aqui
        System.out.println("Bem vindo ao jogo de adivinhação," + player.getName() + "!");
        boolean hasWon = false;
        
        while(!hasWon){
            System.out.println(" Digite seu palpite: ");
            int guess =  scanner.nextInt();
            player.incrementarPlays();
            hasWon = guessValidator.validateGuess((guess), numberToGuess);
        }
        System.out.println("Parabéns," + player.getName()  + "! você adivinhou o número em " + player.getPlays() + " jogadas!");
    }
}
    

