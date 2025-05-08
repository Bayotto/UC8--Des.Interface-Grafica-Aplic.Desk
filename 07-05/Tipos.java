/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;

/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public class Tipos {
    String meuNome = "João";
    char minhaInicial = 'J';
    int minhaIdade = 30;
    double minhaAltura = 1.84;
    boolean estudante = true;
    
    public void verificarIdade(int idade){
        if(idade >= 18){
          System.out.println("Você é maior de idade,pois tem " + idade + " anos.");
        }else{
            System.out.println("Você é menor de idade,pois tem " + idade + " anos.");
    }
    }
    // PRIMEIRO, dizemos se o metodo é public,private ou protected
    //SEGUNDO, devemos especificar o ti´po retorn do metodo
    //depois, colocamos o nome do metodo
    // e depois,os parametros(se houverem)
    public int calcularSoma(int num1,int num2){
    return num1 + num2;
    }
    
    public void nacionalidade(String pais){
        switch(pais){
         case "Brasil":
        System.out.println("Você é brasileiro.");
        break;
        case "Argentina":
        System.out.println("Você é argentino.");
        break;
        default:
        System.out.println("Nacionalidade não encontrada.");
        break;
    }
    }
}
    

