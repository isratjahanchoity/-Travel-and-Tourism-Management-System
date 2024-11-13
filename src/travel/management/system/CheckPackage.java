package travel.management.system;

import java.awt.*;
import javax.swing.*;

public class CheckPackage extends JFrame {
    
    

    CheckPackage() {

        setBounds(450, 200, 900, 600);
        //getContentPane().setBackground(Color.WHITE);

        String[] package1 = {"GOLD PACKAGE For Saint Martin", "6 Days and 7 Nights", "Airport Assistance","Half Day City Tour", "Daily Buffet","Welcome Drinks on Arrival", "Activities", "5* Room Facility", "English Speaking Guide", "BOOK PACKAGE", "SUMMER SPECIAL", "BDT 120000/-", "package13.jpeg"};
        String[] package2 = {"SILVER PACKAGE For Saint Martin", "5 Days and 6 Nights", "AC Bus Service", "Meet and Greet at Bus Stand","Free Clubbing", "Welcome Drinks on Arrival", "Night Safari","Free Breakfast,Lanch and Buffet Diner","BBQ Option Also If You Want", "BOOK Now", "AUTUMN SPECIAL", "BDT 70,000/-", "package15.jpeg"};
        String[] package3 = {"BRONZE PACKAGE For Saint Martin", "6 Days and 5 Nights", "Enjoying VIP Train Services","Meet and Greet at Train Station", "Free Clubbing" ,"Welcome Drinks on Arrival", "Activities", "Free Breakfast,Lanch and Buffet Diner","BBQ Option Also If You Want", "BOOK Now", "WINTER SPECIAL", "BDT 50,000/-", "package16 (3).jpeg"};
        
        
        
        JTabbedPane tab = new JTabbedPane();

        JPanel p1 = createPackage(package1);
        tab.addTab("Package 1", null, p1);
        
        
        JPanel p2 = createPackage(package2);
        tab.addTab("Package 2", null, p2);
        
        
        JPanel p3 = createPackage(package3);
        tab.addTab("Package 3", null, p3);

        add(tab);

        setVisible(true);

    }

    public JPanel createPackage(String[] pack) {
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);

        JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(20, 5, 300, 30);
        l1.setForeground(Color.ORANGE);
        l1.setFont(new Font("Tahoma", Font.BOLD, 15));
        p1.add(l1);

        JLabel l2 = new JLabel(pack[1]);
        l2.setBounds(30, 60, 300, 30);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l2);

        JLabel l3 = new JLabel(pack[2]);
        l3.setBounds(30, 110, 300, 30);
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l3);

        JLabel l4 = new JLabel(pack[3]);
        l4.setBounds(30, 160, 300, 30);
        l4.setForeground(Color.GREEN);
        l4.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l4);

        JLabel l5 = new JLabel(pack[4]);
        l5.setBounds(30, 210, 300, 30);
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l5);

        JLabel l6 = new JLabel(pack[5]);
        l6.setBounds(30, 260, 300, 30);
        l6.setForeground(Color.MAGENTA);
        l6.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l6);

        JLabel l7 = new JLabel(pack[6]);
        l7.setBounds(30, 310, 300, 30);
        l7.setForeground(Color.CYAN);
        l7.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l7);

        JLabel l8 = new JLabel(pack[7]);
        l8.setBounds(30, 360, 300, 30);
        l8.setForeground(Color.DARK_GRAY);
        l8.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l8);

        JLabel l9 = new JLabel(pack[8]);
        l9.setBounds(30, 410, 300, 30);
        l9.setForeground(Color.BLUE);
        l9.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(l9);

        JLabel l10 = new JLabel(pack[9]);
        l10.setBounds(30, 450, 300, 30);
        l10.setForeground(Color.RED);
        l10.setFont(new Font("Tahoma", Font.BOLD, 25));
        p1.add(l10);

        JLabel l11 = new JLabel(pack[10]);
        l11.setBounds(100, 480, 300, 30);
        l11.setForeground(Color.MAGENTA);
        l11.setFont(new Font("Tahoma", Font.BOLD, 25));
        p1.add(l11);

        JLabel l12 = new JLabel(pack[11]);
        l12.setBounds(500, 480, 300, 30);
        l12.setForeground(Color.RED);
        l12.setFont(new Font("Tahoma", Font.BOLD, 25));
        p1.add(l12);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[12]));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l13 = new JLabel(i3);
        l13.setBounds(350, 20, 500, 300);
        p1.add(l13);
        
        return p1;
 }

    public static void main(String[] args) {
        new CheckPackage();
    }
}
