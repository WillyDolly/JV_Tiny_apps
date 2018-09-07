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

public class ColorList extends Applet implements ActionListener, ItemListener{
    List colorlist;
    TextField tf,tf1;
    private String colorName[] = {"Black","Blue","Cyan","Dark Gray","Gray","Green","Light Gray","Magenta","Orange","Pink","Red","White","Yellow"};
    private Color color[] ={Color.BLACK,Color.BLUE,Color.CYAN,Color.DARK_GRAY,Color.GRAY,Color.GREEN,Color.LIGHT_GRAY,Color.MAGENTA,Color.ORANGE,Color.PINK,Color.RED,Color.WHITE,Color.YELLOW};
    public void init(){
        colorlist = new List(4,false);
        tf = new TextField(8);
        tf1 = new TextField();
        tf1.setBackground(Color.red);
        colorlist.addActionListener(this);
        colorlist.addItemListener(this);
       for(int i=0;i<colorName.length;i++)
        colorlist.add(colorName[i]);
       add(colorlist);
       add(tf);
       add(tf1);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(colorlist.getSelectedIndex()%2 == 0){
            tf.setBackground(Color.WHITE);
            setBackground(color[colorlist.getSelectedIndex()]);
        }
        else{
            setBackground(Color.white);
            tf.setBackground(color[colorlist.getSelectedIndex()]);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        showStatus(colorlist.getSelectedItem()+ " ;Index "+colorlist.getSelectedIndex());
    }
}
