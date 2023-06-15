import javax.swing.*;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmTimesTableMenu extends JFrame implements ActionListener{
    App app = new App();
    modFunction funct = new modFunction();
    
    frmTimesTableMenu(){
        //Sets General window Components
        this.setLayout(null);
        this.setTitle("Times Table");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(app.clrTT);

        //Label title
        JLabel title = new JLabel("Enter a Timetable you want to Practice:");
        title.setFont(new Font("Ariel",Font.PLAIN,20));
        title.setBounds(0, 0, 500, 50);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.TOP);

        //Textfield
        JTextField txtTTNum = new JTextField();
        txtTTNum.setBounds(75, 50, 200, 30);

        //Back Button
        JButton back = new JButton("Back");
        back.setBounds(0,0,80,25);
        back.setLocation(210, 85);
        back.addActionListener(e->{
            this.dispose(); 
            frmMainMenu mainMenu = new frmMainMenu();
            mainMenu.setSize(550,350);
            mainMenu.setVisible(true);
        });

        //go button
        JButton launch = new JButton("Launch");
        launch.setBackground(app.clrTTMenu);
        launch.addActionListener(e->{
            boolean passedValidation;
            passedValidation = funct.dataValidation(txtTTNum.getText());
            if (passedValidation == true){
                this.dispose();
                modeTT modTT = new modeTT(Integer.valueOf(txtTTNum.getText()));
                modTT.setSize(400,320);
                modTT.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Input is either not a number or has not been filled in", "Error",1);
            }
            
        });
        launch.setSize(100, 30);
        launch.setLocation(300, 48);


        this.add(title); this.add(back);
        this.add(txtTTNum);this.add(launch);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
