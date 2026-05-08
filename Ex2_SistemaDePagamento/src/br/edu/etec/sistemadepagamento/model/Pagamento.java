/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemadepagamento.model;

/**
 *
 * @author Admin
 */
public abstract class Pagamento {
    
    private double valor;
    private PagamentoEnum pagamentoenum;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public PagamentoEnum getPagamentoenum() {
        return pagamentoenum;
    }

    public void setPagamentoenum(PagamentoEnum pagamentoenum) {
        this.pagamentoenum = pagamentoenum;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public abstract void processarPagamento();
    
    public void exibirPagamento(){
    System.out.println("O status do pagamento: " + getPagamentoenum());
}
}
