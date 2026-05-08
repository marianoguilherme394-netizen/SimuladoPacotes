/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemadepagamento.model;

/**
 *
 * @author Admin
 */
public class PagamentoEnum {
    
    public enum StatusPagamento{
        Pendente,
        Processando,
        Concluido,
        Falha;
    }
}
