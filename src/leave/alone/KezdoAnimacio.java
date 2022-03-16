
package leave.alone;

import java.awt.AWTException;
import java.awt.Font;
import java.awt.Robot;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class KezdoAnimacio extends JPanel
{
    public static JLabel animacio;
    public static Thread th5 = new Thread()
    {
        {
        animacio = new JLabel("");
        animacio.setVerticalTextPosition(JLabel.BOTTOM);
        animacio.setVerticalTextPosition(JLabel.BOTTOM);
        animacio.setBounds(50, 25, 1000, 50);
        animacio.setFont(new Font("Verdana", Font.BOLD, 20));
        
        }
      
    @Override
    public void run()
    {
        
        try 
        {
            
            
            
            Robot bot = new Robot();
            while(true)
            {
                
                   
                    animacio.setText("Secured by: ");
                    bot.delay(Valtozok.animaciodelay);
                    
                    animacio.setText("Secured by: Leave-");
                    bot.delay(Valtozok.animaciodelay);
                    
                    animacio.setText("Secured by: Leave-Alone");
                    bot.delay(Valtozok.animaciodelay);

                   
                    
                
                
            }
            
            
            } catch (AWTException ex) {
                Logger.getLogger(KezdoAnimacio.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        } 
    
    }; 

}

