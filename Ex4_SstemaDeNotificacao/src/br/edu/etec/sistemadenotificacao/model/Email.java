/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemadenotificacao.model;

/**
 *
 * @author Admin
 */
public class Email extends Notificacao{

    public Email(String destinatario, String mensagem, NotificacaoEnum.TipoNotificacao tipo) {
        super(destinatario, mensagem, tipo);
    }

    @Override
    public void enviar() {
        System.out.println("A mensagem foi enviada para o destinatario!");
        System.out.println("Mensagem: " + getMensagem());
    }

    @Override
    public void preparar() {
        System.out.println("----- Email -----");
        System.out.println("Um " + getTipo() + " está sendo preparado para o destinatario: " + getDestinatario());
    }
    
    
    
    
}
