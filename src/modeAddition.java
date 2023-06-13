import javax.swing.*;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class modeAddition extends JFrame implements ActionListener{
    App app = new App();
    modFunction funct = new modFunction();
    
    //500x400
    modeAddition(){
        //Sets General window Components
        this.setLayout(null);
        this.setTitle("Addition");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(app.clrbtnAdd);

        JButton back = new JButton("Back");
        back.setBounds(0,0,70,25);
        back.setLocation(0, 0);
        back.addActionListener(e->{
            this.dispose(); 
            frmAddSub addSub = new frmAddSub();
            addSub.setSize(500,150);
            addSub.setVisible(true);
        });


        this.add(back);


        JLabel test = new JLabel();
        test.setText(funct.RandInt(10));
        test.setLocation(0, 0);
        test.setSize(100,100);
        this.add(test);

        JButton test2 = new JButton();
        test2.setSize(50,50);
        test2.setLocation(100, 100);
        test2.addActionListener(e-> {test.setText(funct.RandInt(10));});
        this.add(test2);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
