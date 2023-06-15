import javax.naming.spi.DirStateFactory.Result;
import javax.swing.*;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class modeTT  extends JFrame implements ActionListener{
    App app = new App();
    modFunction funct = new modFunction();
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
        
        JLabel[] questions = new JLabel[13];
        JTextField[] txtAns = new JTextField[13];
        int[] answers = new int[13];

        for (int i = 0; i <= 12; i ++){
            questions[i] = new JLabel();
            txtAns[i] = new JTextField();
            answers[i] = num * i;
            
            questions[i].setText(num + " x " + i + " = ");
            questions[i].setFont(new  Font("Ariel",Font.PLAIN,17));
            
            if(i == 0){
                questions[i].setBounds(20,30,80,30);
                txtAns[i].setBounds(100,30,80,30);
            } else if(i> 0 && i< 8){
                questions[i].setBounds(20,(i*30)+30,80,30);
                txtAns[i].setBounds(100,(i*30)+30,80,30);
            }else{
                switch(i){
                    case 8:
                        questions[i].setBounds(200,30,80,30);
                        txtAns[i].setBounds(280,30,80,30);
                        break;
                    case 9:
                        questions[i].setBounds(200,60,80,30);
                        txtAns[i].setBounds(280,60,80,30);
                        break;
                    case 10:
                        questions[i].setBounds(200,90,80,30);
                        txtAns[i].setBounds(280,90,80,30);
                        break;
                    case 11:
                        questions[i].setBounds(200,120,80,30);
                        txtAns[i].setBounds(280,120,80,30);
                        break;
                    case 12:
                        questions[i].setBounds(200,150,80,30);
                        txtAns[i].setBounds(280,150,80,30);
                        break;
                    case 13:
                        questions[i].setBounds(200,180,80,30);
                        txtAns[i].setBounds(280,180,80,30);
                        break;
                }
            }
            this.add(questions[i]);
            this.add(txtAns[i]);
        }

        
        //Check Button 
        btnCheck = new JButton("Check");
        btnCheck.setSize(100,30);
        btnCheck.setLocation(210,210);
        btnCheck.addActionListener(e -> {
            boolean passedValidation = false;
            int failedValidation = 0;
            int counter = 0;
            int[] userAnswers = new int[13];
            
            for(int i = 0; i <=12; i++){
                passedValidation = funct.dataValidation(txtAns[i].getText());
                if (passedValidation == true){
                    userAnswers[i] = Integer.valueOf(txtAns[i].getText());
                    
                    if(answers[i] == userAnswers[i]){
                        counter += 1;
                        txtAns[i].setBackground(Color.green);
                    }else{
                        txtAns[i].setBackground(Color.red);
                    }
                }else{
                    failedValidation += 1;
                }

            }
            if (failedValidation > 0){
                JOptionPane.showMessageDialog(null, failedValidation + "/13 Have either not been completed or are not numbers. So cannot be checked. Please rectify this.", "Result",1);
            }else{
                JOptionPane.showMessageDialog(null, counter + "/13 Correct.", "Result",1);
            }
        });

        this.add(back);this.add(title);
        this.add(btnCheck);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {}
    
}
