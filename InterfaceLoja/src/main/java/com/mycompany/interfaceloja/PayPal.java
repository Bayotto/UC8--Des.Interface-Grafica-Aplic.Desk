/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaceloja;

/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public class PayPal implements Pagamento{

    String email;
    
    public PayPal(String email) {
        this.email = email;
    }
    
    

    @Override
    public void processarPagamento(double valor) {
        System.out.println("O fatura do seu produto está no seu email e o valor dela é " + valor + "." );  
    }

    @Override
    public String obterDetalhes() {
        return email;
       
       
        
    }
    
    
}
