/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notepad;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 *
 * @author Admin
 */
public class FileOutputStream_ghiFilebyte {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos;
        try {
            fos = new FileOutputStream("D:\\sinhhoc.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("lỗi mở file");
            return;
        }
        
        int i = 'a';
        int j = 'z';
        for(i = 'a';i <= j; i++)
            fos.write(i);
        fos.close();
    }
}
