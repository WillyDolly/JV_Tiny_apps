
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class MajorSystem {
    public static void main(String[] args) {
        String[] Letters = {"S/X","T","N","M","R/Q","L","G","C/K","V/D/Đ","B/P"};
        String[][] system = new String[11][10];
        
        for(int r=0;r<11;r++){
            for(int c=0;c<10;c++){
                if(r==0)
                    system[r][c] = c+"."+Letters[c];
                else
                    system[r][c] = String.valueOf(r-1)+c+"."+Letters[r-1]+"..."+Letters[c]+"...";
            }
        }
        
        //xuat System
        for(int i=0;i<11;i++){
            for(int j=0;j<10;j++){
                System.out.print(system[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println("");
        ArrayList<String> MajorBoard = new ArrayList<>(110);
        //transfer system to MajorBoard
        for(int i=0;i<11;i++){
            for(int j=0;j<10;j++){
                MajorBoard.add(system[i][j]);
            }
        }
        //show MajorBoard
        for(int i=0;i<110;i++){
            System.out.println(i+". "+MajorBoard.get(i));
            if(i!=0 & (i+1)%10 == 0)
                System.out.println("");
        }
    }
}
