/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Servico;

/**
 *
 * @author leona
 */
public class Main {
    public static void main(String[] args) {
        String nome = "Leonardo";
        
        Servico barba = new Servico(1, "barba", 20);
        
        System.out.println(barba.getDescricao());
    }
}
