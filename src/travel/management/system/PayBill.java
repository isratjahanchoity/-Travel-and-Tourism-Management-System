package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PayBill extends JFrame implements ActionListener {

    PayBill() {
        setBounds(500, 200, 900, 600);

        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);

        try {

            pane.setPage("https://linkmix.co/30657920 ");

        } catch (Exception e) {
            pane.setContentType("text/html");
            pane.setText("<html>Could not load, Error 404</html>");
            // e.printStackTrace();
        }

        JScrollPane sp = new JScrollPane(pane);
        getContentPane().add(sp);

        JButton back = new JButton("Back");
        //back.setForeground(Color.WHITE);
        back.setBounds(610, 20, 80, 40);
        back.addActionListener(this);
        pane.add(back);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Payment("");

    }

    public static void main(String[] args) {
        new PayBill();

    }

}
