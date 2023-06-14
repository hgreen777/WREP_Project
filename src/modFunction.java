import javax.naming.spi.DirStateFactory.Result;
import javax.swing.*;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class modFunction {
    
    
    public String RandInt(int upper){
        Random rand = new Random();
        int x = rand.nextInt((upper+1));
        String y = String.valueOf(x);
        return y;
    } 

    public Boolean Compare(int int1, int int2){
        Boolean result;

        if(int1 == int2){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    public Integer isBigger(int num1, int num2, boolean isbigger){
        int result;
        if (isbigger == true){
            if (num1 > num2){
                result = 1;
            } else if(num2> num1){
                result = 2;
            } else{
                result = 3;
            }
        }else{
            if (num1 < num2){
                result = 1;
            } else if(num2 < num1){
                result = 2;
            } else{
                result = 3;
            }
        }

        return result;
    }
}
