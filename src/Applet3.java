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
import java.awt.event.*;
public class Applet3 extends java.applet.Applet implements ActionListener{
Label lab, lab1;
TextField tf1, tf2;
Button btnResult;

public void init(){
   
    lab = new Label("Enter a number");
    lab1 = new Label();
    tf1 = new TextField(5);
    tf2 = new TextField(5);
    btnResult = new Button("Double is");
    btnResult.addActionListener(this);
    add(lab);
    add(tf1);
    add(btnResult);
    add(tf2);
    add(lab1);
}
    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
       // if(ae.getSource()== btnResult){
            lab1.setText("");
            double num = Double.parseDouble(tf1.getText())*2;
            tf2.setText(String.valueOf(num));
       // }
        }
        catch(Exception e){
            lab1.setText("Enter wrong");
        }
    }
    
}
