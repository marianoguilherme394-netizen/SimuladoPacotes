/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemadeusuario.teste;

import br.edu.etec.sistemadeusuario.model.NivelDeAcessoEnum;
import br.edu.etec.sistemadeusuario.model.Usuario;

/**
 *
 * @author Admin
 */
public class teste {
    public static void main (String [] args){
        Usuario u1 = new Usuario("Guilherme", "12345", NivelDeAcessoEnum.NivelAcesso.Admin, true );
        u1.autenticar("12345");
        u1.mostrarNivel();
    }
}
