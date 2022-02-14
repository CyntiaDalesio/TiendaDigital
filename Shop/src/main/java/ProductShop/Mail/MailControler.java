/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProductShop.Mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/mail")
public class MailControler {
 
@Autowired
private MailService mailService;

//@GetMapping("")
//public String index(){
//return "mail";
//}

//@PostMapping("/enviarmail/")
//public String enviarMail(@RequestParam String destinatario,@RequestParam String asunto,@RequestParam String contenido,@RequestParam String comentario ){
//  
//
//mailService.contactar(asunto, comentario);
//
////mailService.enviarMail(destinatario, asunto, contenido); // LA EMPRESA ENVIA UN MAIL A UNA PERSONA
//
//
//return "mail";
//}   
//




}
