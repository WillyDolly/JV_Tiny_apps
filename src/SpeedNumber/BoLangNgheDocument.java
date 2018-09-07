/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpeedNumber;

import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;



/**
 *
 * @author hai
 */
public class BoLangNgheDocument extends JPanel{
 JTextField t;
 JButton b;
 public BoLangNgheDocument(){
     t = new JTextField(30);
     t.getDocument().addDocumentListener(new MyDocumentListener());
     b = new JButton("login");
     b.setEnabled(false);
     add(t);
     add(b);
 }
 class MyDocumentListener implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent de) {
               change();
        }

        @Override
        public void removeUpdate(DocumentEvent de) {
     
               change();
        }

        @Override
        public void changedUpdate(DocumentEvent de) {
               change();
        }
    public void change(){
        if(t.getText().equals(""))
            b.setEnabled(false);
        else
            b.setEnabled(true);
    }
 }
 
 private static void create_showGUI(){
     JFrame f = new JFrame();
     f.setDefaultCloseOperation(EXIT_ON_CLOSE);
     JComponent newContent = new BoLangNgheDocument();
     newContent.setOpaque(true); 
     f.setContentPane(newContent);// tạo nội dung cho JFrame
     f.pack(); // kích thước vừa với JFrame's subComponents
     f.setVisible(true);
 }
 
 public static void main(String args[]){
     //lên lịch cho xâu event-dispatching(for thread safety)
     javax.swing.SwingUtilities.invokeLater(new Runnable(){
         @Override
         public void run() {
                create_showGUI();
         }
         
     });
 }
}
   