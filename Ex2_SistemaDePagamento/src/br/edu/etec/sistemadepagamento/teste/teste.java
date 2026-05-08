/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemadepagamento.teste;

import br.edu.etec.sistemadepagamento.model.PagamentoCartao;
import br.edu.etec.sistemadepagamento.model.PagamentoEnum;

/**
 *
 * @author Admin
 */
public class teste {
    public static void main(String [] args){
        PagamentoCartao p1 = new PagamentoCartao(1500.00, "00000000000");
        
         PagamentoEnum.StatusPagamento status;
         status =  PagamentoEnum.StatusPagamento.Concluido;
        
        
    
    }
}
