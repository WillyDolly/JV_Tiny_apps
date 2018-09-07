/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpeedNumber;

/**
 *
 * @author hai
 */
public class Xau_Demo extends Thread{
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("the current thread's name: "+t);
        t.setName("myJavaThread");
        System.out.println("the thread's name now: "+t);
        try{
            for(int i=0;i<3;i++){
                System.out.println(i);
                Thread.sleep(1500);
            }
        }
            catch(InterruptedException ie){
                   System.out.println("thread is interrupted"); 
                    }
        }
    }

