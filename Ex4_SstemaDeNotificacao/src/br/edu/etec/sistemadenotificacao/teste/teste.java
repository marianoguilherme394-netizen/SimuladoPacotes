/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemadenotificacao.teste;

import br.edu.etec.sistemadenotificacao.model.Email;
import br.edu.etec.sistemadenotificacao.model.Notificacao;
import br.edu.etec.sistemadenotificacao.model.NotificacaoEnum.TipoNotificacao;
import br.edu.etec.sistemadenotificacao.model.SMS;

/**
 *
 * @author Admin
 */
public class teste {
    public static void main (String [] args){
        Notificacao email = new Email("Isabella Almeida", "Oi, como voce está?", TipoNotificacao.Email);
        email.preparar();
        email.enviar();
        
        Notificacao sms = new SMS("Guilherme Ferreira Mariano", "Oi, me envie o documento após as 14:00", TipoNotificacao.SMS);
        sms.preparar();
        sms.enviar();
    }
}
