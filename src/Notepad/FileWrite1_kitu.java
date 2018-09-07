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


/**
 *
 * @author Admin
 */
public class FileWrite1_kitu {
    public static void main(String[] args) throws IOException {
        String str;
      FileWriter fw; //tạo biến chung
      //đọc dữ liệu từ màn hình Console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //ghi dữ liệu xuống file theo link(phải tạo trước folder)
        try {
          fw = new FileWriter("D:\\demo\\cho.txt");
        } catch (IOException ex) {
            System.out.println("có lỗi xảy ra");
            return;//xác nhận fw đã dc tạo
        }
        //hướng dẫn cách đọc-ghi dữ liệu cho máy
         System.out.println("Nhập tên:");
         do{
             str = br.readLine();//đọc từng dòng
             if(str.compareTo("stop")==0)
                 break;
             str = str +"\n";
             fw.write(str);//lưu từng dòng
         }while(str.compareTo("stop")!=0);//có thể viết (str != 0)
         fw.close();
         System.out.println("mở file");
    }
}
