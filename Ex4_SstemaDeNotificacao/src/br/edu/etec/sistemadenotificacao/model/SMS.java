/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemadenotificacao.model;

/**
 *
 * @author Admin
 */
public class SMS extends Notificacao{

    public SMS(String destinatario, String mensagem, NotificacaoEnum.TipoNotificacao tipo) {
        super(destinatario, mensagem, tipo);
    }

    @Override
    public void enviar() {
        System.out.println("A mensagem foi enviada para o destinatario!");
        System.out.println("Mensagem: " + getMensagem());
    }

    @Override
    public void preparar() {
        System.out.println("----- SMS -----");
        System.out.println("Um " + getTipo() + " está sendo preparado para o destinatario: " + getDestinatario());
    }
    
}
