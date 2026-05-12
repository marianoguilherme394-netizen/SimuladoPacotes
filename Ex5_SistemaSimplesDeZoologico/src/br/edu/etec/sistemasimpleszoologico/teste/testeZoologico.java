/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemasimpleszoologico.teste;

import br.edu.etec.sistemasimpleszoologico.model.Animal;
import br.edu.etec.sistemasimpleszoologico.model.Arara;
import br.edu.etec.sistemasimpleszoologico.model.Golfinho;
import br.edu.etec.sistemasimpleszoologico.model.Leao;
import br.edu.etec.sistemasimpleszoologico.model.ZoologicoEnum.TipoHabitat;

/**
 *
 * @author Admin
 */
public class testeZoologico {
    public static void main(String [] args){
        Animal leao = new Leao("Simba", 8, TipoHabitat.Terrestre);
        leao.exibirInfo();
        leao.emitirSom();
        
        Animal golfinho = new Golfinho("barnabé", 10, TipoHabitat.Aquatico);
        golfinho.exibirInfo();
        golfinho.emitirSom();
        
        Animal arara = new Arara("Neymar", 11, TipoHabitat.Aereo);
        arara.exibirInfo();
        arara.emitirSom();
    }
}
