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
 import java.awt.event.*;
public class ColorWord extends Applet implements ActionListener, ItemListener{
List lst;
TextField tf;
private String colorName[]={"Black","Blue","Cyan","Dark Gray","Gray","Green","Light Gray","Magenta","Orange","Pink","Red","White","Yellow"};
private Color color[]= {Color.black,Color.blue,Color.cyan,Color.darkGray,Color.gray,Color.green,Color.lightGray,Color.magenta,Color.orange,Color.pink,Color.red,Color.white,Color.yellow};

public void init(){
    lst = new List(5,false);
    tf = new TextField(8);
    lst.addActionListener(this);
    lst.addItemListener(this);
    for(int i=0;i<colorName.length;i++)
      lst.add(colorName[i]);
    add(lst);
    add(tf);
        }

    @Override
    public void actionPerformed(ActionEvent ae) {
        setBackground(color[lst.getSelectedIndex()]);
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        tf.setForeground(color[lst.getSelectedIndex()]);
        showStatus(lst.getSelectedItem()+" ;Index "+lst.getSelectedIndex());
    }

    
}
