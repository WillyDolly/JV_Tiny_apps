/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */import java.awt.*;
 import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Applet_Calculator extends Applet implements ActionListener {
    TextField tf1,tf2,tf3;
    Choice ch;
    Button btn;
    Label lb;
    public void init(){
        tf1 = new TextField(3);
        tf2 = new TextField(3);
        tf3 = new TextField(3);
        ch = new Choice();
        ch.addItem("+");
        ch.addItem("-");
        ch.addItem("X");
        ch.addItem(":");
        btn = new Button("=");
        lb = new Label();
       btn.addActionListener(this);
       add(tf1);
       add(ch);
       add(tf2);
       add(btn);
       add(tf3);
       add(lb);
    }
    @Override
    public void actionPerformed(ActionEvent ae) { 
        try{
            lb.setText("");
            float num1 = Float.parseFloat(tf1.getText());
        float num2 = Float.parseFloat(tf2.getText());
        float num3 ;
           switch(ch.getSelectedItem()) {
               case "+":
                   num3 = num1 + num2;
                   tf3.setText(String.valueOf(num3));
                   break;
               case "-":
                   num3 = num1 - num2;
                   tf3.setText(String.valueOf(num3));
                   break;
               case "X":
                   num3 = num1 * num2;
                   tf3.setText(String.valueOf(num3));
                   break;
               case ":":
                   num3 = num1/num2;
                   tf3.setText(String.valueOf(num3));
                   break;
           }
            
        }
        catch(Exception e){
            lb.setText("Wrong Input");
        }
    }
}
