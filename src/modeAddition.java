import javax.swing.*;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;

public class modeAddition extends JFrame implements ActionListener{
    App app = new App();
    modFunction funct = new modFunction();
    int answer;
    String num1;
    String num2;
    
    //500x200
    modeAddition(int max){
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

        //Title Label
        JLabel title = new JLabel("Add these 2 numbers.");
        title.setFont(new Font("Ariel",Font.PLAIN,20));
        title.setBounds(0, 0, 500, 30);
        title.setHorizontalAlignment(JLabel.CENTER);

        //Question Label
        JLabel lblQuestion = new JLabel();
        lblQuestion.setFont(new Font("Ariel",Font.BOLD,50));
        lblQuestion.setHorizontalAlignment(JLabel.RIGHT);
        lblQuestion.setVerticalAlignment(JLabel.CENTER);
        lblQuestion.setBounds(15,30,300,100);
        num1 = funct.RandInt(max);
        num2 = funct.RandInt(max);
        lblQuestion.setText(num1 + " + " + num2 + " = ");
        
        //TextField Answer
        JTextField txtAns = new JTextField();
        txtAns.setFont(new Font("Ariel",Font.PLAIN,50));
        txtAns.setBounds(320, 57, 100, 50);

        //Check Button
        JButton check = new JButton("Check");
        check.setSize(100,30);
        check.setLocation(200,120);
        check.addActionListener(e-> {
            Boolean passedValidation = funct.dataValidation(txtAns.getText());
            
            if (passedValidation == true){
                answer = Integer.valueOf(num1) + Integer.valueOf(num2);
                if (answer == Integer.valueOf(txtAns.getText())){
                    this.getContentPane().setBackground(Color.green);
                    JOptionPane.showMessageDialog(null, "Correct!", "Result",1);
                    this.dispose();
                    modeAddition modeAddition = new modeAddition(max);
                    modeAddition.setSize(500,200);
                    modeAddition.setVisible(true);
                }else{
                    this.getContentPane().setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Incorrect!", "Result",1);
                    this.dispose();
                    modeAddition modeAddition = new modeAddition(max);
                    modeAddition.setSize(500,200);
                    modeAddition.setVisible(true);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Input is either not a number or has not been filled in", "Error",1);
            }
        });


        this.add(back);this.add(title);
        this.add(lblQuestion);this.add(check); this.add(txtAns);

        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
