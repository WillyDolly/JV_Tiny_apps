/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpeedNumber;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author hai
 */
public class JTableDemo {
    JFrame f;
    public JTableDemo(){
    f = new JFrame();
    String data[][] ={ {"01","kita","6000000",""},{"02","mako","4500000","clerk"},{"03","xeko","1200000","manager"}};
    String columns [] ={"ID","name","salary","position"};
    JTable jt = new JTable(data,columns);
   JScrollPane sp = new JScrollPane(jt);
    f.add(sp);
    f.setSize(300,200);
    f.setVisible(true);
    }
    public static void main(String[] args) {
        new JTableDemo();
    }
}
