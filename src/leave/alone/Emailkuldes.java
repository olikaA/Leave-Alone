
package leave.alone;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

 

 
public class Emailkuldes {
    public static Thread th10 = new Thread()
            
    {
    
        @Override
        public void run(){
            System.out.println("belep");
        String to = Valtozok.emailinput;
        String from = "leavealonealert@gmail.com";
        String password = ""; //Érhető okokból elrejtve
        String host = "smtp.gmail.com";
        String port = "587";
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.starttls.enable", "true");
        properties.setProperty("mail.smtp.port", port);
        
        Session session = Session.getDefaultInstance(properties,new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from,password);
            }
        });
        
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(RecipientType.TO, new InternetAddress(to));
            message.setSubject("Leave-Alone Alert");
            message.setText("Dear User!\n\nYou got this message, because we have detected cursor movement on your computer. Don't worry, your computer is going to be turned off in case of unknowned password or timeout.\n\nBye.");
            
            Transport.send(message);
            System.out.println("Message sent successfully!");
            
        } catch (MessagingException mex) {
        }
 
        }
    };
}


            
    
            
 
