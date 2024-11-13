package travel.management.system;

//import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener {

    JButton pay, back;

    Payment(String meter) {
        super("Payment Link");

        setBounds(500, 200, 900, 600);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/payment.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(890, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 890, 550);
        add(image);

        pay = new JButton("Pay");
        pay.setBounds(620, 0, 80, 40);
        pay.addActionListener(this);
        image.add(pay);

        back = new JButton("Back");
        back.setBounds(720, 0, 80, 40);
        back.addActionListener(this);
        image.add(back);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == pay) {

            setVisible(false);
            new PayBill();

        } else {

            setVisible(false);

        }

    }

    public static void main(String[] args) {
        new Payment("");
        // new Payment();
    }
}
