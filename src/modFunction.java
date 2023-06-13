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
}
