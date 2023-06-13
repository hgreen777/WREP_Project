import javax.swing.*;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmAddSub extends JFrame implements ActionListener{
    App app = new App();
    modeAddition addMenu = new modeAddition();

    
    // 500 x 150
    frmAddSub(){
        //Sets General window Components
        this.setLayout(null);
        this.setTitle("Addition & Subtraction");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(app.clrAddSub);

        //Back Button
        JButton back = new JButton("Back");
        back.setBounds(0,0,70,25);
        back.setLocation(0, 0);
        back.addActionListener(e->{
            this.dispose(); 
            frmMainMenu mainMenu = new frmMainMenu();
            mainMenu.setSize(550,350);
            mainMenu.setVisible(true);
        });

        //Title
        JLabel label = new JLabel();
        label.setText("Numbers are <= " + app.intMaxNum);
        label.setFont(new Font("Ariel",Font.PLAIN,12));
        label.setBounds(300, 5, 180, 30);
        label.setHorizontalAlignment(JLabel.CENTER);

        //User harder Numbers Button
        JButton btnToggle = new JButton();
        btnToggle.setText("Make numbers harder");
        btnToggle.addActionListener(e-> {
            if(app.intMaxNum == 10){
                app.intMaxNum = 100;
                btnToggle.setText("Make numbers easier");
            }else{
                app.intMaxNum = 10;
                btnToggle.setText("Make numbers harder");
            }
            label.setText("Numbers are <= " + app.intMaxNum);
        });
        btnToggle.setSize(175,50);
        btnToggle.setLocation(300,35);

        //Addition Button
        JButton btnAddition = new JButton("Addition (+)");
        btnAddition.setFont(new Font("Ariel", Font.BOLD, 15));
        btnAddition.setBackground(app.clrbtnAdd);
        btnAddition.addActionListener(e-> {
            addMenu.setSize(500,400);
            addMenu.setVisible(true);
        });
        btnAddition.setSize(200, 40);
        btnAddition.setLocation(80, 10);

        //Subtraction Button
        JButton btnSubtraction = new JButton("Subtraction (-)");
        btnSubtraction.setFont(new Font("Ariel", Font.BOLD, 15));
        btnSubtraction.setBackground(app.clrbtnAdd);
        btnSubtraction.addActionListener(e-> {});
        btnSubtraction.setSize(200, 40);
        btnSubtraction.setLocation(80, 60);

        this.add(back);
        this.add(label); this.add(btnToggle);
        this.add(btnAddition);this.add(btnSubtraction);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
