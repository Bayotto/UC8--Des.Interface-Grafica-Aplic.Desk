/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaceloja;

/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public class CartaCredito implements Pagamento {
    
    private String numeroCartao;
    private int codigoSegurança;

    public CartaCredito(String numeroCartao, int codigoSegurança) {
        this.numeroCartao = numeroCartao;
        this.codigoSegurança = codigoSegurança;
    }
    

    @Override
    public void processarPagamento(double valor) {
        System.out.println(" Pagamento de R$ " + valor + " o valor processado via Cartão de Crédito.");
    }

    @Override
    public String obterDetalhes() {
       return numeroCartao.substring(numeroCartao.length() - 4);
    }
}
