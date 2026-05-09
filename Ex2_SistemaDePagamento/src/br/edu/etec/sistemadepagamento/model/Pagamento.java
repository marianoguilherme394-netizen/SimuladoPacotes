/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemadepagamento.model;

import br.edu.etec.sistemadepagamento.model.PagamentoEnum.StatusPagamento;

/**
 *
 * @author Admin
 */
public abstract class Pagamento {
    
    private double valor;
    private StatusPagamento status;

    public Pagamento(double valor) {
        this.valor = valor;
        this.status = StatusPagamento.Pendente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public PagamentoEnum.StatusPagamento getStatus() {
        return status;
    }

    public void setStatus(PagamentoEnum.StatusPagamento status) {
        this.status = status;
    }
    
    
    public abstract void processarPagamento();
    
    public void exibirPagamento(){
        
    System.out.println("O status do pagamento: " + getStatus());
}
}
