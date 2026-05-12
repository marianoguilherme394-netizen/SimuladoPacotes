/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemasimpleszoologico.model;

import br.edu.etec.sistemasimpleszoologico.model.ZoologicoEnum.TipoHabitat;

/**
 *
 * @author Admin
 */
public abstract class Animal {
    
    private String nome;
    private int idade;
    private TipoHabitat habitat;

    public Animal(String nome, int idade, TipoHabitat habitat) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public TipoHabitat getHabitat() {
        return habitat;
    }

    public void setHabitat(TipoHabitat habitat) {
        this.habitat = habitat;
    }
    
    public abstract void emitirSom();
    
    public void exibirInfo(){
        System.out.println("----- Informações -----");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Idade: " + getHabitat());
    }
}
