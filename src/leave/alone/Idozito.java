
package leave.alone;

import java.util.logging.Level;
import java.util.logging.Logger;


class Idozito 
{
    public static Thread th4 = new Thread()
    {
        @Override
        public void run()
        {
            
            try 
            {
                Thread.sleep(Valtozok.timer*1000);
                if (Valtozok.helyesjelszo == true) {
                    Thread.sleep(100000);
                }
                else
                {
                    Failed.th3.start();
                }
                
            } catch (InterruptedException ex) 
            {
                Logger.getLogger(Idozito.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    };
    
}

    

