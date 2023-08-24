/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.helper.AgendaHelper;
import java.util.ArrayList;
import model.Agendamento;
import model.Cliente;
import model.Servico;
import model.dao.AgendamentoDAO;
import model.dao.ClienteDAO;
import model.dao.ServicoDAO;
import view.Agenda;

/**
 *
 * @author leona
 */
public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = null;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
        //Buscar uma lista com os agendamentos do banco de dados
        AgendamentoDAO agendamentoDao = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDao.selectAll();
        //Exibir essa lista na view
            helper.preencherTabela(agendamentos);
    }
    
    public void atualizaCliente(){
        //Buscar clientes do banco de dados
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        //Exibir os clientes no combobox cliente
        helper.preencherClientes(clientes);
    }
    
    
    public void atualizaServico(){
        //Buscar os servicos no banco
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        //Exibir os servicos no combobox servico
        helper.preencherServicos(servicos);
    }
    
    public void atualizaValor(){
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValue());
    }
    
    public void agendar(){
        //Buscar objeto agendamento da tela
        //Salvar objeto no banco de dados
    }
}
