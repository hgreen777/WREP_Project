import javax.naming.spi.DirStateFactory.Result;
import javax.swing.*;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class modeTT  extends JFrame implements ActionListener{
    App app = new App();
    
    //700x500 maybe
    modeTT(){
        //Sets General window Components
        this.setLayout(null);
        this.setTitle("Times Table");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(app.clrTT);

        //Back Button
        JButton back = new JButton("Back");
        back.setBounds(0,0,70,25);
        back.setLocation(0, 0);
        back.addActionListener(e->{
            this.dispose(); 
            frmTimesTableMenu frmTTM = new frmTimesTableMenu();
            frmTTM.setSize(500,150);
            frmTTM.setVisible(true);
        });


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
