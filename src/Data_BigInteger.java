/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
public class Data_BigInteger {
  
  public static void main(String[] args) {
      BigInteger b1, b2, b3, b4, b5;
      b1 = new BigInteger("11");//String converted to BigInteger
      b2 = new BigInteger("111",2);//(String,int radix)
      b3 = b1.multiply(b2);//add, subtract, divide, mod
      System.out.println("result: "+b3);
      Random r = new Random();
      b4 = new BigInteger(100,r);//(numBit,Random) random number from 0 to 2 ^numBit
      b5 = new BigInteger(8,0,r);//(bitLength,int certainty,Random) -> probably prime
      System.out.println("b4: "+b5);
      
      int n = 2;
      byte[] b = new byte[n];
      r.nextBytes(b);
      BigInteger b6 = new BigInteger(b);
      System.out.println("Rnd Byte[]: "+b6);
  }
}

