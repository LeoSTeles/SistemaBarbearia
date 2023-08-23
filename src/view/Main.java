/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Agendamento;
import model.Cliente;
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

        Cliente cliente = new Cliente("Rua A2", "490000", 1, "Leonardo");
        Agendamento agendamento = new Agendamento(1, cliente, barba, 36, "23/08/2023 18:45");
        System.out.println(agendamento.getCliente().getNome());
    }
}
