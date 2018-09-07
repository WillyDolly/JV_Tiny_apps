/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notepad;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class FileWrite_kitu {
    public static void main(String[] args) throws IOException {
            String str;
            FileWriter fw;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
            try {
            fw = new FileWriter("D:\\blacklist.txt");
        } catch (IOException ex) {
            System.out.println("lỗi ghi dữ liệu xuống file");
            return;
        }
        
            System.out.println("Nhập tên('stop'để dừng chương trình)");
            do{
                str = br.readLine();
                if(str.compareTo("stop") == 0)
                    break;
                str = str +"\n";
                fw.write(str);
            }while(str != "stop");
            fw.close();
            System.out.println("mở file ra");
}
}