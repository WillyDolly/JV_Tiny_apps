/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notepad;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class ClassFile {
    public static void main(String[] args) throws IOException {
        //3 cách tạo file
        File f1 = new File("D:\\demo\\mustbescientist.txt");
        f1.createNewFile();
        
        File f2 = new File("D:\\demo","gotta be the best.txt") ;
        f2.createNewFile();
        
        File dir = new File("D:\\demo");
        File f3 = new File(dir,"bossofknowing.txt");
        f3.createNewFile();
        //cách tạo thư mục
        File dir1 = new File("D:\\demo\\demo4");
        dir1.mkdir();
        //liệt kê file và thư mục con thành mảng
        File fl = new File("D:\\demo");
        File listFile[] =  fl.listFiles();
        
        for(int i =0;i<listFile.length;i++){
            if(listFile[i].isFile())
                System.out.println(listFile[i].getName());
        }
        
        for(int i =0;i<listFile.length;i++){
            if(listFile[i].isDirectory())
                System.out.println(listFile[i].getName());
        }
    }
}
