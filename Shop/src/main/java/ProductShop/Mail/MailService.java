package ProductShop.Mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired(required = true)
    JavaMailSender javaMailSender;

    @Async
    public void enviarMail(String destinatario, String asunto, String contenido) {
        
// envio de mail desde la empresa al usuario es especifico
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("egameggrrhh@gmail.com");
        simpleMailMessage.setTo(destinatario);
        simpleMailMessage.setSubject(asunto);
        simpleMailMessage.setText(contenido);
        javaMailSender.send(simpleMailMessage);
    }


   @Async
    public void enviarMailRegister(String destinatario, String username) {
        
// envio de mail desde la empresa al usuario es especifico
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("egameggrrhh@gmail.com");
        simpleMailMessage.setTo(destinatario);
        simpleMailMessage.setSubject("Bienvenido a E-gamEgg");
          simpleMailMessage.setText("Sr/a: " + username+"\n"+" Usted se ha registrado exitosamente!!");

        javaMailSender.send(simpleMailMessage);
    }










    public void contactar(String cuerpo, String mail) {
//Mail a la empresa
        SimpleMailMessage mensaje = new SimpleMailMessage();

        mensaje.setTo("egameggrrhh@gmail.com");
        mensaje.setFrom("egameggrrhh@gmail.com");
        mensaje.setSubject("CONTACT US");
        mensaje.setText("Destinatarios: " + mail+"\n"+

"Asunto: " + cuerpo+"\n"+

"Comentario: " + mail+"\n"


);
        javaMailSender.send(mensaje);

    }

}
