/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.helper;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Agendamento;
import model.Cliente;
import model.Servico;
import view.Agenda;

/**
 *
 * @author leona
 */
public class AgendaHelper implements iHelper{
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();
        tableModel.setNumRows(0);
        
        //Percorrer a lista preenchendo o tableModel
        for (Agendamento agendamento : agendamentos) {
            //roda o for, e pra cada linha adiciona colunas com os campos abaixo
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
            });
        }
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
        DefaultComboBoxModel comboBoxModel =  (DefaultComboBoxModel) view.getComboBoxClientes().getModel();
        
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente);
        }
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getComboBoxServicos().getModel();
        
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
        }
    }

    public Cliente obterCliente(){
        return (Cliente) view.getComboBoxClientes().getSelectedItem();
    }
    
    public Servico obterServico() {
        return (Servico) view.getComboBoxServicos().getSelectedItem();
    }

    public void setarValor(float valor) {
        view.getTextValor().setText(valor+"");
    }

    @Override
    public Agendamento obterModelo() {
        int id = Integer.parseInt(view.getTextId().getText());
        Cliente cliente = this.obterCliente();
        Servico servico = this.obterServico();
        float valor = Float.parseFloat(view.getTextValor().getText());
        String data = view.getTextFormatedData().getText();
        String hora = view.getTextFormatedHora().getText();
        String observacao = view.getTextObservacao().getText();
        String dataHora = data + " " + hora;
        Agendamento agendamento = new Agendamento(id,cliente,servico,valor,dataHora,observacao);
        
        return agendamento;
    }

    @Override
    public void limparTela() {
        view.getTextId().setText("");
        view.getTextFormatedHora().setText("");
        view.getTextFormatedData().setText("");
        view.getTextObservacao().setText("");
    }
    
    
}
