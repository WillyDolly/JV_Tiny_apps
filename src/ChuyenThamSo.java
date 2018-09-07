/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */import java.awt.*;
 import java.applet.*;
 /*<applet code = "ChuyenThamSo" width = 500 height = 200>
 <PARAM NAME = mybutton value = "Display Dialog">
 </applet>
 */
public class ChuyenThamSo extends Applet {
    Button bNext;
    public void init(){
        String  str = getParameter("mybutton");
        if(str == null)
            str = new String("Default");
        
        bNext = new Button(str);
        add(bNext);
    }
}
