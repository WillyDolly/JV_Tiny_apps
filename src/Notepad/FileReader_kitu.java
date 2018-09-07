/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notepad;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author Admin
 */
public class FileReader_kitu {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fr = new FileReader("D:\\wirelessnetwork.txt");
            BufferedReader br = new BufferedReader(fr);
            String str;
            while((str = br.readLine())!=null)//line kết thúc khi có dấu xuống hàng
                System.out.println(str);//line chứa "\n" != null
        } catch (IOException ex) {
            System.out.println("có lỗi");
        }
        
    }
}
