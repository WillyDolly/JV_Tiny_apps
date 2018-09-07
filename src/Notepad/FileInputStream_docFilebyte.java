/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notepad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class FileInputStream_docFilebyte {
    public static void main(String[] args) throws IOException {
        FileInputStream fis;
        try {
            fis = new FileInputStream("D:\\myclass.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("không có file");
            return;
        }
        
         int c;
         do{
             c = fis.read();
             if(c != -1)
                 System.out.println(c);
         }while(c!= -1);
         fis.close();
    }
}
