/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.applet.Applet;
import java.awt.*;
/*
<applet code = Both width = 200 height =300>
</applet>
*/
public class Both extends Applet{
    Button btn;
    public void init(){
        btn = new Button("Click");
        btn.setVisible(true);
    }
    public void paint(Graphics g){
        g.drawString("Applet", 0, 0);
    }
    /*public static void main(String[] args) {
        Both app = new Both();
        app.init();
        System.out.println("Application Main");
    }*/
}
