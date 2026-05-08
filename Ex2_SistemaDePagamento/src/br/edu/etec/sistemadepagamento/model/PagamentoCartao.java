/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemadepagamento.model;

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

    
    @Override
    public void processarPagamento() {
        System.out.println("O pagamaneto com o cartão de numero " + this.numeroCartao + " foi realizada com sucesso!");
        
    }
    
    @Override
    public void exibirPagamento(){
       
        System.out.println("O status do pagamento: " + getPagamentoenum());
         System.out.println("Status: " + status);
}
    
}
