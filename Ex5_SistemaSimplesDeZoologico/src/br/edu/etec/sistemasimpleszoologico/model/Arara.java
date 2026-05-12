/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemasimpleszoologico.model;

/**
 *
 * @author Admin
 */
public class Arara extends Animal{

    public Arara(String nome, int idade, ZoologicoEnum.TipoHabitat habitat) {
        super(nome, idade, habitat);
    }

    @Override
    public void emitirSom() {
        System.out.println("Emite o som: a-raa-ra" );
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("----- Arara -----");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Idade: " + getHabitat());
    }
    
}
