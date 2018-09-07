/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpeedNumber;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class SoNgauNhien {
    public static void main(String[] args) {
        int rand = rand(4,6);
        System.out.println("result: "+rand);
    }
    public static int rand(int min, int max){
        try{
        Random r = new Random();
        int range = max - min +1;
        int rn = min + r.nextInt(range);
        return rn;
        }
        catch(Exception e){
            e.printStackTrace();
            return -1;
        }
    }
}
