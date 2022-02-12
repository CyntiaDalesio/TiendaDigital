
package ProductShop.Mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    @Autowired(required=true)
 JavaMailSender javaMailSender;

@Async
public void enviarMail(String destinatario, String asunto, String contenido){

SimpleMailMessage simpleMailMessage= new SimpleMailMessage();

simpleMailMessage.setTo(destinatario);
simpleMailMessage.setSubject(asunto);
simpleMailMessage.setText(contenido);
javaMailSender.send(simpleMailMessage);
}


public void contactar(String cuerpo,String mail){

SimpleMailMessage mensaje = new SimpleMailMessage();

mensaje.setTo("");
 mensaje.setFrom(mail);
mensaje.setSubject("CONTACT US");
mensaje.setText("Destinatarios: "+mail+"            "+cuerpo);






}




}
