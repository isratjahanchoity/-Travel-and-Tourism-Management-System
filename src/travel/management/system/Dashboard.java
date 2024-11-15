package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

public class Dashboard extends JFrame implements ActionListener {

    String username;
    JPanel p2;
    JLabel heading, text;
    JLabel icon, image;
//    JButton addPersonalDetails, viewPersonalDetails, updatePersonalDetails, checkpackages, bookpackage, viewpackage;
//    JButton viewhotels, destinations, bookhotel, viewbookedhotel, payments, calculators, notepad, about, deleteCustomer;

    Dashboard(String username) {
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        setupTopPanel();
        setupSidebar();

        // Background Image
        ImageIcon bgIcon = new ImageIcon(ClassLoader.getSystemResource("icons/home8.jpg"));
        Image bgImage = bgIcon.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        image = new JLabel(new ImageIcon(bgImage));
        image.setBounds(0, 0, 1650, 1000);
        add(image);

        text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400, 70, 1200, 70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.PLAIN, 55));
        image.add(text);

        setVisible(true);
    }

    private void setupTopPanel() {
        JPanel topPanel = new JPanel();
        topPanel.setLayout(null);
        topPanel.setBackground(new Color(0, 0, 102));
        topPanel.setBounds(0, 0, 1600, 65);
        add(topPanel);

        ImageIcon iconImage = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image img = iconImage.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        icon = new JLabel(new ImageIcon(img));
        icon.setBounds(5, 0, 70, 70);
        topPanel.add(icon);

        heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        topPanel.add(heading);
    }

    private void setupSidebar() {
        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);

        addButtonToSidebar("Add Personal Details", "ADD_DETAILS", 0);
        addButtonToSidebar("Update Personal Details", "UPDATE_DETAILS", 50);
        addButtonToSidebar("View Details", "VIEW_DETAILS", 100);
        addButtonToSidebar("Delete Customer", "DELETE_CUSTOMER", 150);
        addButtonToSidebar("Check Package", "CHECK_PACKAGE", 200);
        addButtonToSidebar("Book Package", "BOOK_PACKAGE", 250);
        addButtonToSidebar("View Package", "VIEW_PACKAGE", 300);
        addButtonToSidebar("View Hotels", "VIEW_HOTELS", 350);
        addButtonToSidebar("Book Hotel", "BOOK_HOTEL", 400);
        addButtonToSidebar("View Booked Hotel", "VIEW_BOOKED_HOTEL", 450);
        addButtonToSidebar("Destinations", "DESTINATIONS", 500);
        addButtonToSidebar("Payments", "PAYMENTS", 550);
        addButtonToSidebar("Calculators", "CALCULATORS", 600);
        addButtonToSidebar("Diary", "DIARY", 650);
        addButtonToSidebar("About", "ABOUT", 700);
    }

    private void addButtonToSidebar(String text, String actionCommand, int yPosition) {
        JButton button = new JButton(text);
        button.setBounds(0, yPosition, 300, 50);
        button.setBackground(new Color(0, 0, 102));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button.setFocusPainted(false);
        button.setActionCommand(actionCommand);
        button.addActionListener(this);
        p2.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand();
        try {
            switch (action) {
                case "ADD_DETAILS":
                    new AddCustomer(username);
                    break;
                case "UPDATE_DETAILS":
                    new UpdateCustomer(username);
                    break;
                case "VIEW_DETAILS":
                    new ViewCustomer(username);
                    break;
                case "DELETE_CUSTOMER":
                    new DeleteCustomer();
                    break;
                case "CHECK_PACKAGE":
                    new CheckPackage();
                    break;
                case "BOOK_PACKAGE":
                    new BookPackage(username);
                    break;
                case "VIEW_PACKAGE":
                    new ViewPackage(username);
                    break;
                case "VIEW_HOTELS":
                    new CheckHotels();
                    break;
                case "BOOK_HOTEL":
                    new BookHotel(username);
                    break;
                case "VIEW_BOOKED_HOTEL":
                    new ViewBookedHotel(username);
                    break;
                case "DESTINATIONS":
                    new Destinations();
                    break;
                case "PAYMENTS":
                    new Payment("");
                    break;
                case "CALCULATORS":
                    Runtime.getRuntime().exec("calc.exe");
                    break;
                case "DIARY":
                    Runtime.getRuntime().exec("notepad.exe");
                    break;
                case "ABOUT":
                    new About();
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
