/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemadepagamento.teste;

import br.edu.etec.sistemadepagamento.model.Pagamento;
import br.edu.etec.sistemadepagamento.model.PagamentoCartao;

/**
 *
 * @author Admin
 */
public class teste {
    public static void main(String [] args){
        Pagamento pagamentocartao = new PagamentoCartao(1500.00, "00000000000");
        pagamentocartao.processarPagamento();
        pagamentocartao.exibirPagamento();
        
        
        
        
        
    
    }
}
