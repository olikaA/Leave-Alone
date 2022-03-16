/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leave.alone;

import java.awt.Font;
import java.util.Properties;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author 36202
 */
public class Email extends JPanel 
{
    public static JLabel emaillabel;
    public static Thread th9 = new Thread()
    {
          
        {
        emaillabel = new JLabel("Email: ");
        emaillabel.setVerticalTextPosition(JLabel.BOTTOM);
        emaillabel.setVerticalTextPosition(JLabel.BOTTOM);
        emaillabel.setBounds(480, 175, 200, 50);
        emaillabel.setFont(new Font("Verdana", Font.BOLD, 12));
        }
        
        
        
      
    @Override
    public void run()
    {
        UIManager.put("OptionPane.informationIcon", Valtozok.email);
        Valtozok.emailinput = JOptionPane.showInputDialog(null,"Email: ", "Enter a valid email address.", JOptionPane.INFORMATION_MESSAGE);
        emaillabel.setText("Email: "+Valtozok.emailinput);
       
        
            
            
            
            
        } 
    
    }; 
    
}
