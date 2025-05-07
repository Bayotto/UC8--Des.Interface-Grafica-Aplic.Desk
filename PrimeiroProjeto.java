/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeiroprojeto;

/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public class PrimeiroProjeto {
    // SEMPRE USAR PONTO E FIGURA EM QUALQUER COISA

    public static void main(String[] args) {
       //Frase minhaFrase = new Frase();
        //minhaFrase.mensagem(); // caso queira rodar o codigo aperta alt f6
        
        Tipos tipo = new Tipos();
        tipo.verificarIdade(18); // se voce segurar ctrl em cima do metodo ele mostra informações e caso clique ele irá ate esse metodo.
        
        Tipos nacionalidade =  new Tipos();
        tipo.nacionalidade("Brasil");
        
        
    }
}
