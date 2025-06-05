/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaceloja;

/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public class InterfaceLoja {

    public static void main(String[] args) {
       CartaCredito cartaCredito = new CartaCredito("99828019",2007);
       cartaCredito.processarPagamento(1999.99);
        System.out.println(cartaCredito.obterDetalhes());
       PayPal paypal = new PayPal("jao123@gmail.com");
       paypal.processarPagamento(2000);
        System.out.println(paypal.obterDetalhes());
        
        
    }
}
