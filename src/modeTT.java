import javax.naming.spi.DirStateFactory.Result;
import javax.swing.*;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class modeTT  extends JFrame implements ActionListener{
    App app = new App();
    JButton btnCheck;
    int count;
    
    //400x290
    modeTT(int num){
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

        //Label title
        JLabel title = new JLabel("Times Table");
        title.setFont(new Font("Ariel",Font.PLAIN,20));
        title.setBounds(0, 0, 400, 50);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.TOP);

        //**All question Labels*/
        //Question 0
        JLabel q0 = new JLabel();
        q0.setText(num + " x  0 = ");
        q0.setFont(new Font("Ariel",Font.PLAIN,20));
        q0.setBounds(20, 30, 80, 30);

        //Question 1
        JLabel q1 = new JLabel();
        q1.setText(num + " x  1 = ");
        q1.setFont(new Font("Ariel",Font.PLAIN,20));
        q1.setBounds(20, 60, 80, 30);

        //Question 2
        JLabel q2 = new JLabel();
        q2.setText(num + " x  2 = ");
        q2.setFont(new Font("Ariel",Font.PLAIN,20));
        q2.setBounds(20, 90, 80, 30);

        //Question 3
        JLabel q3 = new JLabel();
        q3.setText(num + " x  3 = ");
        q3.setFont(new Font("Ariel",Font.PLAIN,20));
        q3.setBounds(20, 120, 80, 30);

        //Question 4
        JLabel q4 = new JLabel();
        q4.setText(num + " x  4 = ");
        q4.setFont(new Font("Ariel",Font.PLAIN,20));
        q4.setBounds(20, 150, 80, 30);

        //Question 5
        JLabel q5 = new JLabel();
        q5.setText(num + " x  5 = ");
        q5.setFont(new Font("Ariel",Font.PLAIN,20));
        q5.setBounds(20, 180, 80, 30);

        //Question 6
        JLabel q6 = new JLabel();
        q6.setText(num + " x  6 = ");
        q6.setFont(new Font("Ariel",Font.PLAIN,20));
        q6.setBounds(20, 210, 80, 30);

        // **Row 2**
        //Question 7
        JLabel q7 = new JLabel();
        q7.setText(num + " x  7 = ");
        q7.setFont(new Font("Ariel",Font.PLAIN,20));
        q7.setBounds(200, 30, 80, 30);
        
        //Question 8
        JLabel q8 = new JLabel();
        q8.setText(num + " x  8 = ");
        q8.setFont(new Font("Ariel",Font.PLAIN,20));
        q8.setBounds(200, 60, 80, 30);

        //Question 9
        JLabel q9 = new JLabel();
        q9.setText(num + " x  9 = ");
        q9.setFont(new Font("Ariel",Font.PLAIN,20));
        q9.setBounds(200, 90, 80, 30);

        //Question 10
        JLabel q10 = new JLabel();
        q10.setText(num + " x  10 = ");
        q10.setFont(new Font("Ariel",Font.PLAIN,17));
        q10.setBounds(200, 120, 80, 30);

        //Question 11
        JLabel q11 = new JLabel();
        q11.setText(num + " x  11 = ");
        q11.setFont(new Font("Ariel",Font.PLAIN,17));
        q11.setBounds(200, 150, 80, 30);

        //Question 12
        JLabel q12 = new JLabel();
        q12.setText(num + " x  12 = ");
        q12.setFont(new Font("Ariel",Font.PLAIN,17));
        q12.setBounds(200, 180, 80, 25);


        //**Text Object */
        //Q0 AnswerBox
        JTextField txtq0 = new JTextField();
        txtq0.setBounds(100,30, 80, 30);

        //Q1 AnswerBox
        JTextField txtq1 = new JTextField();
        txtq1.setBounds(100,60, 80, 30);

        //Q2 AnswerBox
        JTextField txtq2 = new JTextField();
        txtq2.setBounds(100,90, 80, 30);

        //Q3 AnswerBox
        JTextField txtq3 = new JTextField();
        txtq3.setBounds(100,120, 80, 30);

        //Q4 AnswerBox
        JTextField txtq4 = new JTextField();
        txtq4.setBounds(100,150, 80, 30);

        //Q5 AnswerBox
        JTextField txtq5 = new JTextField();
        txtq5.setBounds(100,180, 80, 30);

        //Q6 AnswerBox
        JTextField txtq6 = new JTextField();
        txtq6.setBounds(100,210, 80, 30);

        //** Row 2 */
        //Q7 AnswerBox
        JTextField txtq7 = new JTextField();
        txtq7.setBounds(280,30, 80, 30);

        //Q8 AnswerBox
        JTextField txtq8 = new JTextField();
        txtq8.setBounds(280,60, 80, 30);

        //Q9 AnswerBox
        JTextField txtq9 = new JTextField();
        txtq9.setBounds(280,90, 80, 30);

        //Q1 AnswerBox
        JTextField txtq10 = new JTextField();
        txtq10.setBounds(280,120, 80, 30);

        //Q1 AnswerBox
        JTextField txtq11 = new JTextField();
        txtq11.setBounds(280,150, 80, 30);

        //Q1 AnswerBox
        JTextField txtq12 = new JTextField();
        txtq12.setBounds(280,180, 80, 30);

        
        //Check Button 
        btnCheck = new JButton("Check");
        btnCheck.setSize(100,30);
        btnCheck.setLocation(210,210);
        btnCheck.addActionListener(e -> {
            /* 
            int[] userAnswers = {Integer.valueOf(txtq0.getText()), Integer.valueOf(txtq2.getText()), Integer.valueOf(txtq3.getText()), Integer.valueOf(txtq3.getText()), Integer.valueOf(txtq5.getText()), Integer.valueOf(txtq6.getText()), Integer.valueOf(txtq7.getText()), Integer.valueOf(txtq8.getText()), Integer.valueOf(txtq9.getText()), Integer.valueOf(txtq10.getText()), Integer.valueOf(txtq11.getText()), Integer.valueOf(txtq12.getText())};
            int[] answers = new int[12];
            for(int i = 0; i <= 11; i++){
                if (i == 11){
                    answers[i] = num * i;
                    answers[i+1] = num * i+1;
                }else{
                    answers[i] = num * i;
                }
                if(userAnswers[i] == answers[i]){
                    count += 1;
                }
            }
            System.out.println(userAnswers[1] + answers[1]);
            JOptionPane.showMessageDialog(null, count + "/12 Correct", "Result",1);*/
        });

        this.add(back);this.add(title);
        this.add(btnCheck);
        this.add(q1);this.add(q0);this.add(q2);this.add(q3);this.add(q4);this.add(q5);this.add(q6);
        this.add(q7);this.add(q8);this.add(q9);this.add(q10);this.add(q11); this.add(q12);

        this.add(txtq0);this.add(txtq1);this.add(txtq2); this.add(txtq3);this.add(txtq4);this.add(txtq5); this.add(txtq6);
        this.add(txtq7);this.add(txtq8);this.add(txtq9); this.add(txtq10);this.add(txtq11);this.add(txtq12);
    }

    @Override
    public void actionPerformed(ActionEvent e) {}
    
}
