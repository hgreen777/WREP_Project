import javax.swing.*;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;

public class modeLower extends JFrame implements ActionListener{
    App app = new App();
    modFunction funct = new modFunction();

    String num1;
    String num2;
    
    //500 x 200
    modeLower(){
        //Sets General window Components
        this.setLayout(null);
        this.setTitle("Smaller Number");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(app.clrHL);

        JButton back = new JButton("Back");
        back.setBounds(0,0,70,25);
        back.setLocation(0, 0);
        back.addActionListener(e->{
            this.dispose(); 
            frmHighLowMenu HLMenu = new frmHighLowMenu();
            HLMenu.setSize(500,150);
            HLMenu.setVisible(true);
        });

        //Title Label
        JLabel title = new JLabel("Pick the lower Number");
        title.setFont(new Font("Ariel",Font.PLAIN,20));
        title.setBounds(0, 0, 500, 30);
        title.setHorizontalAlignment(JLabel.CENTER);

        //Info Label
        JLabel info = new JLabel("Click on either number if they are the same");
        info.setFont(new Font("Ariel",Font.PLAIN,15));
        info.setBounds(0, 0, 500, 160);
        info.setHorizontalAlignment(JLabel.CENTER);
        info.setVerticalAlignment(JLabel.BOTTOM);
        JLabel info2 = new JLabel("Click on the smaller number");
        info2.setFont(new Font("Ariel",Font.PLAIN,15));
        info2.setBounds(0, 0, 500, 140);
        info2.setHorizontalAlignment(JLabel.CENTER);
        info2.setVerticalAlignment(JLabel.BOTTOM);



        //Question Label
        JLabel lblQuestion = new JLabel();
        lblQuestion.setFont(new Font("Ariel",Font.BOLD,50));
        lblQuestion.setHorizontalAlignment(JLabel.CENTER);
        lblQuestion.setVerticalAlignment(JLabel.CENTER);
        lblQuestion.setBounds(0,30,500,100);
        lblQuestion.setText("&");

        // Option 1 Button
        JButton btnNum1 = new JButton();
        num1 = funct.RandInt(100);
        btnNum1.setText(num1);
        btnNum1.setSize(80, 50);
        btnNum1.setLocation(110,57);
        btnNum1.addActionListener(e-> {
            int result =funct.isBigger(Integer.valueOf(num1), Integer.valueOf(num2), false);
            modeLower modLow = new modeLower();
            switch(result){
                case 1:
                    this.getContentPane().setBackground(Color.green);
                    JOptionPane.showMessageDialog(null, "Correct!", "Result",1);
                    this.dispose();
                    modLow.setSize(500,200);
                    modLow.setVisible(true);
                    break;
                case 2:
                    this.getContentPane().setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "InCorrect!", "Result",1);
                    this.dispose();
                    modLow.setSize(500,200);
                    modLow.setVisible(true);
                    break;
                case 3:
                    this.getContentPane().setBackground(Color.green);
                    JOptionPane.showMessageDialog(null, "Correct!", "Result",1);
                    this.dispose();
                    modLow.setSize(500,200);
                    modLow.setVisible(true);
                    break;
                }
        });

        //Option 2 Button
        JButton btnNum2 = new JButton();
        num2 = funct.RandInt(100);
        btnNum2.setText(num2);
        btnNum2.setSize(80, 50);
        btnNum2.setLocation(310,57);
        btnNum2.addActionListener(e->{
            int result =funct.isBigger(Integer.valueOf(num1), Integer.valueOf(num2), false);
            modeLower modLow = new modeLower();
            switch(result){
                case 1:
                    this.getContentPane().setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "InCorrect!", "Result",1);
                    this.dispose();
                    modLow.setSize(500,200);
                    modLow.setVisible(true);
                    break;
                case 2:
                    this.getContentPane().setBackground(Color.green);
                    JOptionPane.showMessageDialog(null, "Correct!", "Result",1);
                    this.dispose();
                    modLow.setSize(500,200);
                    modLow.setVisible(true);;
                    break;
                case 3:
                    this.getContentPane().setBackground(Color.green);
                    JOptionPane.showMessageDialog(null, "Correct!", "Result",1);
                    this.dispose();
                    modLow.setSize(500,200);
                    modLow.setVisible(true);
                    break;
                }
        });

        this.add(back);this.add(title); 
        this.add(info); this.add(info2);
        this.add(lblQuestion); this.add(btnNum1); this.add(btnNum2);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}