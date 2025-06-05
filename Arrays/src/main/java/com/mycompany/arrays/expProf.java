/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

/**
 *
 * @author JOAOPEDRODESBESELAPP
 */
public class expProf {
    public static String[] info(Usuario usuario){
        return new String[]{usuario.getEmail(),usuario.getName(),usuario.getSenha()};
    }
    
    public static void main (String[] args){
        String[] info = info(new Usuario("joao","joao@gmail.com","12345"));
        System.out.println(info[0] + " " + info[1]);
    }
}
