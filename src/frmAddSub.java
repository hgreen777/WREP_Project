import javax.swing.*;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmAddSub extends JFrame implements ActionListener{
    App app = new App();
    
    // 500 x 150
    frmAddSub(){
        //Sets General window Components
        this.setLayout(null);
        this.setTitle("Addition & Subtraction");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(app.clrAddSub);

        //Title
        JLabel label = new JLabel();
        label.setText("Numbers are <= " + app.intMaxNum);
        label.setFont(new Font("Ariel",Font.BOLD,30));
        label.setBounds(0, 0, 550, 50);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);

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

        this.add(label); this.add(btnToggle);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
