import javax.swing.*;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmHighLowMenu extends JFrame implements ActionListener{
    App app = new App();

    //500 x 150 window
    frmHighLowMenu(){
        //Sets General window Components
        this.setLayout(null);
        this.setTitle("Higher & Lower");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(app.clrHL);

        //Setting title for window
        JLabel title = new JLabel("<html>Pick whether you want to find the <br><center>bigger or smaller number.</center></html>");
        title.setFont(new Font("Ariel",Font.PLAIN,20));
        title.setBounds(50, 0, 400, 50);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.TOP);

        //Adding a back button
        JButton back = new JButton("Back");
        back.setBounds(0,0,70,25);
        back.setLocation(0, 0);
        back.addActionListener(e->{
            this.dispose(); 
            frmMainMenu mainMenu = new frmMainMenu();
            mainMenu.setSize(550,350);
            mainMenu.setVisible(true);
        });

        //Higher button
        JButton btnHigher = new JButton("Higher");
        btnHigher.setBackground(app.clrLightRed);
        btnHigher.addActionListener(e->{
            this.dispose();
            modeHigher modHigh = new modeHigher();
            modHigh.setSize(500,200);
            modHigh.setVisible(true);
        });
        btnHigher.setSize(100, 45);
        btnHigher.setLocation(100, 60);
        //Lower button
        JButton btnLower = new JButton("Lower");
        btnLower.setBackground(app.clrLightGreen);
        btnLower.addActionListener(e->{
            this.dispose();
            modeLower modLow = new modeLower();
            modLow.setSize(500,200);
            modLow.setVisible(true);
        });
        btnLower.setSize(100, 45);
        btnLower.setLocation(300, 60);

        this.add(title);this.add(back);
        this.add(btnHigher);this.add(btnLower);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
