
package leave.alone;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.border.Border;


class Valtozok {
    public static int ido = 0;
    public static String jelszo = "";
    public static String jelszobe;
    public static int timer = 10;
    public static int hibaszamlalo = 3;
    public static int loopsegedvaltozo;
    public static int riasztasaktivalas = 5;
    public static boolean erzekelo = false;
    public static int animaciodelay = 500;
    public static String consolestring= "";
    public static Color hatter = new Color(222,255,255);
    public static Color design1 = new Color(204,255,255);
    public static Color design2 = new Color(222,255,255);
    public static Color referenceszin = new Color(146,146,146);
    public static int szolgalatbalepes = 3;
    public static Border blackline = BorderFactory.createLineBorder(Color.black);
    public static final ImageIcon dialogkep = new ImageIcon("C:\\Leave-Alone\\Leave-Alone\\lock.png"); 
    public static final ImageIcon jelszobeallitas = new ImageIcon("C:\\Leave-Alone\\Leave-Alone\\kulcs.png"); 
    public static final ImageIcon email = new ImageIcon("C:\\Leave-Alone\\Leave-Alone\\kukac.png"); 
    public static String emailinput = "";
    public static boolean helyesjelszo = false;
    public static Color figyelmeztetesszin = new Color(206,192,0);
    
    
}
