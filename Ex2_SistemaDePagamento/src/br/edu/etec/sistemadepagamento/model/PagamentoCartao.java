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
public class PagamentoCartao extends Pagamento{
    
    private String numeroCartao;

    public PagamentoCartao(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    
    
    @Override
    public void processarPagamento() {
        System.out.println("O pagamaneto de R$ " + getValor() + " com o cartão de numero " + getNumeroCartao() + "foi realizada com sucesso!");
        
    }
    
    @Override
    public void exibirPagamento(){
       setStatus(StatusPagamento.Concluido);
        System.out.println("Status: " + getStatus());
}
    
}
