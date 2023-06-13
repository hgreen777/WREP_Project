import javax.swing.*;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class frmMainMenu extends JFrame implements ActionListener{
    App app = new App();
    frmTimesTableMenu timesTableMenu = new frmTimesTableMenu();
    frmHighLowMenu highLowMenu = new frmHighLowMenu();
    frmAddSub addSub = new frmAddSub();

    frmMainMenu(){
        //Sets General window Components
        this.setLayout(null);
        this.setTitle("Main Menu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(app.bg);

        //Setting title component for the window
        JLabel title = new JLabel("Pick a mode");
        title.setFont(new Font("Ariel",Font.BOLD,30));
        title.setBounds(0, 0, 550, 50);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.TOP);
        
        //Button to take to the additiona dn subtraction menu
        JButton btnAddSub = new JButton("Addition & Subtraction");
        btnAddSub.setBackground(app.clrAddSub);
        btnAddSub.addActionListener(e-> {this.dispose(); addSub.setSize(500,150); addSub.setVisible(true);});
        btnAddSub.setSize(250, 50);
        btnAddSub.setLocation(150,50);

        //Button to take user to the Higher & Lower menu
        JButton btnHighLow = new JButton("Higher & Lower");
        btnHighLow.setBackground(app.clrHL);
        btnHighLow.addActionListener(e -> {this.dispose(); highLowMenu.setSize(500,150); highLowMenu.setVisible(true);});
        btnHighLow.setSize(250, 50);
        btnHighLow.setLocation(150, 150);

        //Button to take user to timestable menu
        JButton btnTimesTable = new JButton("Times Tables");
        btnTimesTable.setBackground(app.clrTT);
        btnTimesTable.addActionListener(e -> {this.dispose(); timesTableMenu.setSize(500, 150); timesTableMenu.setVisible(true);});
        btnTimesTable.setSize(250, 50);
        btnTimesTable.setLocation(150, 250);


        ////Adding components to the window
        this.add(title);
        this.add(btnAddSub);this.add(btnHighLow);this.add(btnTimesTable);
    }


    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}