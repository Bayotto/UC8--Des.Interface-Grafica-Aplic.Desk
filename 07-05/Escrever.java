/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;
import java.util.Scanner;
/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public class Escrever {
    public static void escrever(){
        // Cria um objeto Scanner para ler a entrada do usuario.
        Scanner sc = new Scanner(System.in);
        
        String nome;
        
        
        // Declara duas variáveis inteiras para armazenar os numeros digitados pelo usuario.
        int numero1,numero2;
        // Usar nextLine caso eu queira pedir para o usuario falar algo por exemplo um nome
        System.out.println("Digite o seu nome:");
        nome = sc.nextLine();
        
       
        
        //Solicita ao usuario que digite o primeiro numero
        //Lê o próximo inteiro digitado pelo usuaário e o armazena em numero1.
        System.out.println("Digite o primeiro numero:");
        numero1 = sc.nextInt();
        System.out.println("O usuario digitou " + numero1);
        
        // Solicita ao usuario o segundo número
        System.out.println("Digite o segundo numero:");
        numero2 = sc.nextInt();
        System.out.println("O usuario digitou " +  numero2);
        // Irá somar os dois numeros e mostrar o resultado
        int soma = numero1 + numero2;
        System.out.println("O usuario " + nome + " o resultado da soma é: " + soma);
        // Fecha o objeto Scanner para liberar os recursos utilizados
        sc.close();
    }
}
