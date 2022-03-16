package leave.alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
class Failed {
    public static Thread th3 = new Thread()
    {
        @Override
        public void run()
        {
        Runtime runtime = Runtime.getRuntime();
        
            try {
                    runtime.exec("shutdown -s -t 0");
                } catch (IOException ex) {
                    Logger.getLogger(Failed.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            try
            {
                //Összes alkalmazás bezárása
                
                String line;
            Process p = Runtime.getRuntime().exec("tasklist.exe");
            Runtime rt = Runtime.getRuntime();
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = input.readLine()) != null) {

                if (line.toLowerCase().contains(".exe".toLowerCase()) && line.toLowerCase().contains("Console".toLowerCase())) {
                    System.out.println(line);
                    String pocessKill = line.substring(0, line.indexOf(".exe"));
                    pocessKill = pocessKill + ".exe";

                    if (pocessKill.equalsIgnoreCase("netbeans.exe") || pocessKill.equalsIgnoreCase("java.exe") || pocessKill.equalsIgnoreCase("csrss.exe") || pocessKill.equalsIgnoreCase("winlogon.exe") || pocessKill.equalsIgnoreCase("dwm.exe") || pocessKill.equalsIgnoreCase("taskhostex.exe") || pocessKill.equalsIgnoreCase("explorer.exe") || pocessKill.equalsIgnoreCase("igfxtray.exe") || pocessKill.equalsIgnoreCase("hkcmd.exe") || pocessKill.equalsIgnoreCase("igfxpers.exe") || pocessKill.equalsIgnoreCase("jusched.exe") || pocessKill.equalsIgnoreCase("GWX.exe") || pocessKill.equalsIgnoreCase("rundll32.exe") || pocessKill.equalsIgnoreCase("conhost.exe") || pocessKill.equalsIgnoreCase("tasklist.exe") || pocessKill.equalsIgnoreCase("conhost.exe")) {
                        System.out.println(pocessKill);
                    } else {
                        rt.exec("taskkill /F /IM " + pocessKill);
                    }
                } else {
                   
                }

            }
            input.close();

            System.out.println(rt.toString());

        } catch (IOException err) {
                
                
    
               
            }
                  
        }
        
    };
    
}
