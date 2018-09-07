/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpeedNumber;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author hai
 */
public class Object_IOStream implements Serializable{//phai ke thua interface nay
    String name = "beo";
    int time = 2;
    transient int position = 34;
    
    public static void main(String[] args) {
        Object_IOStream o = new Object_IOStream();
        //ghi theo Object 
        try{
        //tao doi tuong cho lop
        FileOutputStream fileOut = new FileOutputStream("student.dat");// tao file tro den student.dat "" 
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(o);// ghi doi tuong theo Object
        out.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        //doc theo Object
        Object_IOStream IO = null;
        try{
            FileInputStream fileIn = new FileInputStream("student.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            IO = (Object_IOStream)in.readObject();//ep kieu tra ve Object_IOStream
            in.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        //xuat ket qua doc file
        System.out.println("name: "+IO.name);
        System.out.println("time: "+IO.time);
        System.out.println("position: "+IO.position);
    }
    /*static class MyStudent implements Serializable{
        String name = "sdfsf";
        int age = 56;
    }*/
}
