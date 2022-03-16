package leave.alone;

/*
Készítette: Jankó Olivér (mérnökinformatikus hallgató).
Referencia munka - Java - 2022.
Verzió: v1.0
*/

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
import java.awt.AWTException;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;

import java.awt.Robot;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.EventListener;
import java.util.Locale;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class osztalyok
{
    
    KurzorLoop thread2 = new KurzorLoop();
    Failed failed = new Failed();
    Idozito idozito = new Idozito();
    Valtozok valtozok = new Valtozok();
    Szolgalatbalepes szolgalatbalepes = new Szolgalatbalepes(); 
    Jelszobeallitas jelszobeallitas = new Jelszobeallitas();
    Emailkuldes emailkuldes = new Emailkuldes();
    
    
}

public class LeaveAlone 
{
    public static void main(String[] args)throws AWTException, InterruptedException, IOException
    {
        File click = new File("C:\\Leave-Alone\\Leave-Alone\\click.wav");
        File open = new File("C:\\Leave-Alone\\Leave-Alone\\open.wav");
        
        Icon elsoicon = new ImageIcon("C:\\Leave-Alone\\Leave-Alone\\1.png");
        Icon masodikicon = new ImageIcon("C:\\Leave-Alone\\Leave-Alone\\2.png");
        Icon harmadikicon = new ImageIcon("C:\\Leave-Alone\\Leave-Alone\\3.png");
       
        Email email = new Email();
        Detected detected = new Detected();
        KezdoAnimacio kezdoanimacio = new KezdoAnimacio();
        
        
        JFrame frame = new JFrame("Leave-Alone");
        
        frame.setSize(800,600);    
        frame.setLayout(null);    
        frame.setVisible(true);    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLocation(20, 40);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Leave-Alone\\Leave-Alone\\lock.png"));
        frame.setResizable(false);
        
        JLabel referenciafelirat = new JLabel("Reference Work - Oliver Janko - 2022 - Java - v1.0");
        referenciafelirat.setBounds(490, 525, 1000, 50);
        referenciafelirat.setVerticalTextPosition(JLabel.BOTTOM);
        referenciafelirat.setVerticalTextPosition(JLabel.BOTTOM);
        referenciafelirat.setForeground(Valtozok.referenceszin);
        
        
        JLabel figyelmeztetes = new JLabel("Make sure, that you have saved and closed every unsaved projects,");
        figyelmeztetes.setBounds(380, 340, 1000, 50);
        figyelmeztetes.setVerticalTextPosition(JLabel.BOTTOM);
        figyelmeztetes.setVerticalTextPosition(JLabel.BOTTOM);
        figyelmeztetes.setForeground(Valtozok.figyelmeztetesszin);
        
        
        JLabel figyelmeztetes2 = new JLabel("because those can abort the powering off process!");
        figyelmeztetes2.setBounds(380, 357, 1000, 50);
        figyelmeztetes2.setVerticalTextPosition(JLabel.BOTTOM);
        figyelmeztetes2.setVerticalTextPosition(JLabel.BOTTOM);
        figyelmeztetes2.setForeground(Valtozok.figyelmeztetesszin);
   
        
        
       JPanel hatter = new JPanel();
       hatter.setBounds(0, 0, 800, 600);
       hatter.setBackground(Valtozok.hatter);

       JPanel panel1 = new JPanel();
       panel1.setBounds(0, 0, 799, 100);
       panel1.setBackground(Valtozok.design1);
       panel1.setBorder(Valtozok.blackline);
       
       JPanel panel2 = new JPanel();
       panel2.setBounds(0, 99, 365, 464);
       panel2.setBackground(Valtozok.design2);
       panel2.setBorder(Valtozok.blackline);
       panel2.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(3.0f)));
        
        JLabel console = new JLabel(Valtozok.consolestring);
        console.setVerticalTextPosition(JLabel.BOTTOM);
        console.setVerticalTextPosition(JLabel.BOTTOM);
        console.setBounds(50, 100, 1000, 50);
        console.setFont(new Font("Verdana", Font.BOLD, 12));
        
       JButton elso = new JButton(elsoicon);
       JButton masodik = new JButton(masodikicon);
       JButton harmadik = new JButton(harmadikicon);
       
       
       
        elso.setLayout(null);
        elso.setFocusPainted(false);
        elso.setBounds(320, 120, 200, 50);
        elso.setBorderPainted(false);
        elso.setContentAreaFilled(false);
        
        masodik.setLayout(null);
        masodik.setFocusPainted(false);
        masodik.setBounds(320, 250, 200, 50);
        masodik.setBorderPainted(false);
        masodik.setContentAreaFilled(false);
        
        harmadik.setLayout(null);
        harmadik.setFocusPainted(false);
        harmadik.setBounds(320, 470, 200, 50);
        harmadik.setBorderPainted(false);
        harmadik.setContentAreaFilled(false);
        frame.add(referenciafelirat);
        
        frame.add(elso);
        frame.add(masodik);
        frame.add(harmadik);
        
        frame.add(figyelmeztetes);
        frame.add(figyelmeztetes2);
        frame.add(Detected.console);
        frame.add(KezdoAnimacio.animacio);  
        frame.add(Detected.belepes);
        frame.add(Detected.emailaddress);
        frame.add(Detected.password);
        frame.add(Szolgalatbalepes.szolgalatbalepes);
        frame.add(Detected.console2);
        
        frame.add(Email.emaillabel);
        frame.add(Detected.console3);
        frame.add(Detected.correctpassword);
        
        frame.add(panel1);
        frame.add(panel2);
        frame.add(hatter);
        
       
        
Clip clip;
                try {
                    clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(open));
                    clip.start();
                } catch (LineUnavailableException | UnsupportedAudioFileException | IOException ex) {
                    Logger.getLogger(LeaveAlone.class.getName()).log(Level.SEVERE, null, ex);
                }
       
        
        Robot bot = new Robot();
        Scanner scanner = new Scanner(System.in);
        KezdoAnimacio.th5.start();
       
        
        Detected.password.addActionListener( new ActionListener() 
        {
            @Override
            
            public void actionPerformed(ActionEvent e) 
            {
                
                
        Clip clip;
                try {
                    clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(click));
                    clip.start();
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(LeaveAlone.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(LeaveAlone.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(LeaveAlone.class.getName()).log(Level.SEVERE, null, ex);
                }
        
            
                
                Jelszobeallitas.th8.start();
                

                
   
                
            }
        }); 
        
        
        Detected.emailaddress.addActionListener( new ActionListener() 
        {
            @Override
            
            public void actionPerformed(ActionEvent e) 
            {
                
                Clip clip;
                try {
                    clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(click));
                    clip.start();
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(LeaveAlone.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(LeaveAlone.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(LeaveAlone.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Email.th9.start();
                

                
   
                
            }
        }); 
        
        
        Detected.belepes.addActionListener( new ActionListener() 
        {
            @Override
            
            public void actionPerformed(ActionEvent e) 
            {
                
                Clip clip;
                try {
                    clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(click));
                    clip.start();
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(LeaveAlone.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(LeaveAlone.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(LeaveAlone.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                
                Szolgalatbalepes.th7.start();
                
                
                

                frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
   
                
            }
        }); 
    }
}  
    

        
        

    

