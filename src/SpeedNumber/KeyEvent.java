/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpeedNumber;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author hai
 */
public class KeyEvent extends Frame implements KeyListener{
   private String line1 = "", line2 ="";
   private TextArea ta;
   public KeyEvent(){
       super("demonstrating Key Events");
       ta = new TextArea(10,15);
       ta.setText("press any keys");
       ta.setEnabled(false);
       this.add(ta);
       addKeyListener(this);
       setSize(400,200);
       setVisible(true);
       
   }

    @Override
    public void keyTyped(java.awt.event.KeyEvent ke) {
       line1 = "key typed: " + ke.getKeyChar();
       setLine2and3(ke);
    }

    @Override
    public void keyPressed(java.awt.event.KeyEvent ke) {
        line1 = "key pressed: "+ ke.getKeyCode();
             setLine2and3(ke);
    }

    @Override
    public void keyReleased(java.awt.event.KeyEvent ke) {
        line1 = "key released: "+ke.getKeyCode();
             setLine2and3(ke);
    }
    private void setLine2and3(java.awt.event.KeyEvent ke){
        line2 = "it's "+(ke.isActionKey()?"":"not")+" an action key";
        ta.setText(line1+"\n"+line2);
    }
    public static void main(String[] args) {
        KeyEvent application = new KeyEvent();
    }
}
