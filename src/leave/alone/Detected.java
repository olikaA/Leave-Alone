/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leave.alone;

import java.awt.AWTException;
import java.awt.Font;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
    

/**
 *
 * @author 36202
 */
public class Detected extends JPanel 
{
    public static JLabel correctpassword;
    public static JButton emailaddress;
    public static JButton password;
    public static JButton belepes;
    public static JLabel console;  
    public static JLabel console2;   
    public static JLabel console3;  
    public static Thread th6 = new Thread()

    {
        {
   
        console = new JLabel(Valtozok.consolestring);
        console.setVerticalTextPosition(JLabel.BOTTOM);
        console.setVerticalTextPosition(JLabel.BOTTOM);
        console.setBounds(50, 100, 1000, 50);
        console.setFont(new Font("Verdana", Font.BOLD, 12));
        
        console2 = new JLabel("");
        console2.setVerticalTextPosition(JLabel.BOTTOM);
        console2.setVerticalTextPosition(JLabel.BOTTOM);
        console2.setBounds(50, 400, 1000, 50);
        console2.setFont(new Font("Verdana", Font.BOLD, 12));
        
        console3 = new JLabel("");
        console3.setVerticalTextPosition(JLabel.BOTTOM);
        console3.setVerticalTextPosition(JLabel.BOTTOM);
        console3.setBounds(50, 170, 1000, 50);
        console3.setFont(new Font("Verdana", Font.BOLD, 12));
        
        correctpassword = new JLabel("");
        correctpassword.setVerticalTextPosition(JLabel.BOTTOM);
        correctpassword.setVerticalTextPosition(JLabel.BOTTOM);
        correctpassword.setBounds(10, 480, 1000, 50);
        correctpassword.setFont(new Font("Verdana", Font.BOLD, 13));
        
        
        //Itt tartottam a gomb miatt hogy ezzel inditsam a folyamatot
     
        Icon icon = new ImageIcon("C:\\Leave-Alone\\Leave-Alone\\enterservice.png");
        belepes = new JButton(icon);
        belepes.setLayout(null);
        belepes.setFocusPainted(false);
        belepes.setBounds(472, 470, 220, 50);
        belepes.setBorderPainted(false);
        belepes.setContentAreaFilled(false);
        
        
        Icon icon2 = new ImageIcon("C:\\Leave-Alone\\Leave-Alone\\email.png");
        emailaddress = new JButton(icon2);
        emailaddress.setLayout(null);
        emailaddress.setFocusPainted(false);
        emailaddress.setBounds(472, 120, 220, 50);
        emailaddress.setBorderPainted(false);
        emailaddress.setContentAreaFilled(false);
        
        
        Icon icon3 = new ImageIcon("C:\\Leave-Alone\\Leave-Alone\\password.png");
        password = new JButton(icon3);
        password.setLayout(null);
        password.setFocusPainted(false);
        password.setBounds(472, 250, 220, 50);
        password.setBorderPainted(false);
        password.setContentAreaFilled(false);
    
       
        }
    
    @Override
    public void run() 
    {
        
        Scanner scanner = new Scanner(System.in);
        
        File motiondetectedhang = new File("C:\\Leave-Alone\\Leave-Alone\\motion_detected.wav");
        File enterthepasswordhang = new File("C:\\Leave-Alone\\Leave-Alone\\enter_the_password.wav");
        File errorhang = new File("C:\\Leave-Alone\\Leave-Alone\\error.wav");
        File sikerhang = new File("C:\\Leave-Alone\\Leave-Alone\\siker.wav");
        File correctpasswordhang = new File("C:\\Leave-Alone\\Leave-Alone\\passwordcorrect.wav");
        File exithang = new File("C:\\Leave-Alone\\Leave-Alone\\close.wav");
        
        Robot bot;
        try {
            bot = new Robot();
            
            while (true)
        {
         
            PointerInfo a = MouseInfo.getPointerInfo();
            Point b = a.getLocation();
            int x = (int) b.getX();
            int y = (int) b.getY();
            
            bot.mouseMove(500, 500);
            Valtozok.ido++;
            bot.delay(1000);
            
            if (x != 500 && y != 500) 
            {
                
                KurzorLoop.th2.start();
                Clip clip;
                try {
                    clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(motiondetectedhang));
                    clip.start();
                } catch (LineUnavailableException ex) {
                    java.util.logging.Logger.getLogger(LeaveAlone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException ex) {
                    java.util.logging.Logger.getLogger(LeaveAlone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(LeaveAlone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                
                
                Emailkuldes.th10.start();
                
                Valtozok.erzekelo = true;
                Valtozok.consolestring = "\nMotion detected!";
                console.setText(Valtozok.consolestring);
                console.setFont(new Font("Verdana", Font.BOLD, 16));
                console.setBounds(100, 150, 1000, 50);
            
                    bot.delay(2000);
                
                
            
            console2.setText(Valtozok.timer + " seconds until the alarm gets activated!");
            Idozito.th4.start();
            
            
             Clip clip2;
                try {
                    clip2 = AudioSystem.getClip();
                    clip2.open(AudioSystem.getAudioInputStream(enterthepasswordhang));
                    clip2.start();
                } catch (LineUnavailableException | UnsupportedAudioFileException | IOException ex) {
                    java.util.logging.Logger.getLogger(LeaveAlone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                
               
                
            while (Valtozok.hibaszamlalo != 0)
                {
                    bot.delay(500);
                    console3.setText("You have "+Valtozok.hibaszamlalo + " try left.");
                    console3.setBounds(105, 440, 1000, 50);
                    console3.setFont(new Font("Verdana", Font.BOLD, 13));
                    
                    //Az alábbi kóddal lesz ikon a dialogboxban!!
                    UIManager.put("OptionPane.informationIcon", Valtozok.dialogkep);

                    Valtozok.jelszobe = JOptionPane.showInputDialog(null,"Password: You have "+Valtozok.hibaszamlalo +" try left.", "Enter the password.", JOptionPane.INFORMATION_MESSAGE);
                        
                    if (Valtozok.jelszobe.equals(Valtozok.jelszo)) 
                    {
                        
                        Clip clip3;
                try {
                    clip3 = AudioSystem.getClip();
                    clip3.open(AudioSystem.getAudioInputStream(sikerhang));
                    clip3.start();
                } catch (LineUnavailableException ex) {
                    java.util.logging.Logger.getLogger(LeaveAlone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }       catch (UnsupportedAudioFileException | IOException ex) {
                            java.util.logging.Logger.getLogger(Detected.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                        }
                        Valtozok.helyesjelszo = true;
                        bot.delay(500);
                        
                        correctpassword.setText("The password is correct, leaving the service...");
                        
                        
                        Clip clip4;
                try {
                    clip4 = AudioSystem.getClip();
                    clip4.open(AudioSystem.getAudioInputStream(correctpasswordhang));
                    clip4.start();
                } catch (LineUnavailableException | UnsupportedAudioFileException | IOException ex) {
                    java.util.logging.Logger.getLogger(LeaveAlone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                
                
                bot.delay(3000);
                    Clip clip5;
                try {
                    clip5 = AudioSystem.getClip();
                    clip5.open(AudioSystem.getAudioInputStream(exithang));
                    clip5.start();
                } catch (LineUnavailableException | UnsupportedAudioFileException | IOException ex) {
                    java.util.logging.Logger.getLogger(LeaveAlone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                        bot.delay(800);
                     System.exit(0);       
                    }
                    
                    
                    else
                    {
                        Clip clip3;
                try {
                    clip3 = AudioSystem.getClip();
                    clip3.open(AudioSystem.getAudioInputStream(errorhang));
                    clip3.start();
                } catch (LineUnavailableException ex) {
                    java.util.logging.Logger.getLogger(LeaveAlone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }       catch (UnsupportedAudioFileException | IOException ex) {
                            java.util.logging.Logger.getLogger(Detected.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                        }
                        
                        bot.delay(500);
                   
                        Valtozok.hibaszamlalo--;
                            
                    }
                            
                        
                    if (Valtozok.hibaszamlalo == 0) {
                      
                        Failed.th3.start();
                    }
 
                }
            
             }
            
            }

            
        } catch (AWTException ex) {
            java.util.logging.Logger.getLogger(Detected.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

            
       }

    };
}
        
        
   


   
    

    

