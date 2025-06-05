/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessinggames;

/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public class GuessValidator {
    public boolean validateGuess(int guess, int numberToGuess){
        if (guess > numberToGuess){
            System.out.print("seu palpite e muito alto!");
            return false;
        }else if (guess < numberToGuess){
            System.out.print("seu palpite e muito baixo!");
            return false; // palpite falso
        }else {
            return true; //palpite correto
        }
    }
}
