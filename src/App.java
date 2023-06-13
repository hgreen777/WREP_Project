import javax.swing.*;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    Color bg = new Color(226, 240, 217); //Light Green
    Color clrTT = new Color(217, 217, 217); //Color for timestable menu
    Color clrHL = new Color(248,203,173); //Color for Higher & Lower menu
    Color clrAddSub = new Color(222,235,247); //Color for addition adn subtraction menu
    Color clrbtnAdd = new Color(255, 242, 204); //Colour for addition and subtraction buttons and menus
    Color clrTTMenu = new Color(240,252, 129);//Color for TT menu
    Color clrLightRed = new Color(242,124,124);
    Color clrLightGreen = new Color(197,224, 180);

    public int intMaxNum = 10;

    public static void main(String[] args) throws Exception {
        frmMainMenu mainMenu = new frmMainMenu();
        mainMenu.setSize(550,350);
        mainMenu.setVisible(true);
    }

}
