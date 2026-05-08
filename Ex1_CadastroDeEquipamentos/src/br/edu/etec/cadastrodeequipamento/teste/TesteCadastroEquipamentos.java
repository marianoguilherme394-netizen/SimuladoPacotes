/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.cadastrodeequipamento.teste;

import br.edu.etec.cadastrodeequipamento.model.Computador;

/**
 *
 * @author Admin
 */
public class TesteCadastroEquipamentos {
    public static void main (String [] args){
        Computador c1 = new Computador("Computador", "Sansung Galaxy Book 4", "Intel® Inside U300");
        c1.exibirDados();
    }
}
