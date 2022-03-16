
package leave.alone;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.logging.Level;
import java.util.logging.Logger;


class KurzorLoop 
{
    
    public static Thread th2 = new Thread()
    {
        
        @Override
        public void run()
        {
 
            try 
            {
                Robot bot = new Robot();
                while(true)
                {
                    bot.delay(0);
                    bot.mouseMove(500, 500);
                    Valtozok.loopsegedvaltozo++;
                }
                
                
            } catch (AWTException ex) {
                    Logger.getLogger(KurzorLoop.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
        }
        
    };
    
}
