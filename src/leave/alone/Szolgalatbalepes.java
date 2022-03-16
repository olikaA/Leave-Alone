
package leave.alone;

import java.awt.AWTException;
import java.awt.Font;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JLabel;


public class Szolgalatbalepes 
{
    public static JLabel szolgalatbalepes;
    public static Thread th7 = new Thread()
    {
        {
        szolgalatbalepes = new JLabel("");
        szolgalatbalepes.setVerticalTextPosition(JLabel.BOTTOM);
        szolgalatbalepes.setVerticalTextPosition(JLabel.BOTTOM);
        szolgalatbalepes.setBounds(90, 120, 1000, 50);
        szolgalatbalepes.setFont(new Font("Verdana", Font.BOLD, 15));
        }

        @Override
        public void run()
        {
        File szolgalatbalepeshang = new File("C:\\Leave-Alone\\Leave-Alone\\entering_service.wav");
        Robot bot;
        File beephang = new File("C:\\Leave-Alone\\Leave-Alone\\beep.wav");
            try {
                bot = new Robot();
                bot.delay(500);
                while(Valtozok.szolgalatbalepes != 0)
                    {
                        Clip clip;
                try {
                    clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(beephang));
                    clip.start();
                } catch (LineUnavailableException ex) {
                    java.util.logging.Logger.getLogger(LeaveAlone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }   catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(Szolgalatbalepes.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Szolgalatbalepes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        
                        
                        szolgalatbalepes.setText("Entering service in: "+Valtozok.szolgalatbalepes+".");
                        Valtozok.szolgalatbalepes--;
                        bot.delay(1000);

                    }
                
                Clip clip;
                try {
                    clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(szolgalatbalepeshang));
                    clip.start();
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(LeaveAlone.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(LeaveAlone.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(LeaveAlone.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                szolgalatbalepes.setText("");
                bot.mouseMove(500, 500);
                Detected.th6.start();
            } catch (AWTException ex) {
                Logger.getLogger(Szolgalatbalepes.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
    };
    
}

    

