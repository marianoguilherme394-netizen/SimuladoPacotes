/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemadeusuario.model;

import br.edu.etec.sistemadeusuario.model.NivelDeAcessoEnum.NivelAcesso;

/**
 *
 * @author Admin
 */
public class Usuario {
    private String login;
    private String senha;
    private NivelAcesso nivel;
    private boolean ativo;

    public Usuario(String login, String senha, NivelAcesso nivel, boolean ativo) {
        this.login = login;
        this.senha = senha;
        this.nivel = nivel;
        this.ativo = ativo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public NivelAcesso getNivel() {
        return nivel;
    }

    public void setNivel(NivelAcesso nivel) {
        this.nivel = nivel;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public void autenticar(String senha2){
        if(this.senha.equals(senha2) && isAtivo()== true){
            System.out.println("Autentificação: " + isAtivo());
        }
        else{
            setAtivo(ativo = false);
            System.out.println(isAtivo());
        }
    }
    
    public void mostrarNivel(){
        System.out.println("Usuario: " + getNivel());
    }
    
}
