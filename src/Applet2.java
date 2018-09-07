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
import java.applet.Applet;
import java.awt.event.ActionListener;
public class Applet2 extends Applet {
   Frame fr;
   Panel pan;
   Button btnClose;
   TextField tf;
   public void init(){
       fr = new Frame("Hall of Fame");
       pan = new Panel();
       btnClose = new Button("Close");
       
       tf = new TextField("Enter more text");
       pan.add(tf);
       pan.add(btnClose);
       fr.add(pan);
       fr.setSize(200,200);
       fr.setVisible(true);
   }
   
}
