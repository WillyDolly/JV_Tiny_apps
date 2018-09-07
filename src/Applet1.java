/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.awt.*;
import java.applet.*;
/*
<applet code = Applet1 width = 600 height = 300>
</applet>
*/
public class Applet1 extends Applet{
    int num;
    public void init(){
        num = 11;
    }
    public void paint(Graphics g){
        g.drawString("Hey guys, have fun "+num, 120, 200);
        showStatus(getAppletInfo());
    }

    public String getAppletInfo() {
        return "let's rock and roll";
     } 
    
}
