/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leave.alone;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author 36202
 */
class Jelszobeallitas {
    
    public static Thread th8 = new Thread()
    {
        
        
        
        
      
    @Override
    public void run()
    {
        UIManager.put("OptionPane.informationIcon", Valtozok.jelszobeallitas);
        Valtozok.jelszo = JOptionPane.showInputDialog(null,"Password: ", "Set up a password.", JOptionPane.INFORMATION_MESSAGE);
      
        
        } 
    
    }; 
    
}
