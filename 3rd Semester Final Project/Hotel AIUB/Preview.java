import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Preview extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1, imgLabel;
    private Font f1, f2, f3;
    private ImageIcon logo;
    private JButton btn1, btn2, btn3, nBtn;
    private Cursor cursor;
    private JRadioButton place1, place2, place3, place4, place5;
    private ButtonGroup jButtonGroup;
    private int place = 0;

    Preview() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hotel AIUB");
        this.setSize(900, 900);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#16a085"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        logo = new ImageIcon(getClass().getResource("/images/Entry.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(60, 100, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        logo = new ImageIcon(getClass().getResource("/images/Garden.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(470, 100, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        logo = new ImageIcon(getClass().getResource("/images/Swimming.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(270, 440, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Semibold", Font.PLAIN, 20);
        f3 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Cursor for JButtons and Radio Buttons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        label1.setText("HOTEL PREVIEW");
        label1.setBounds(320, 25, 500, 50);
        label1.setFont(f1);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("ENTRY");
        label1.setBounds(190, 350, 500, 50);
        label1.setFont(f3);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("GARDEN");
        label1.setBounds(600, 350, 500, 50);
        label1.setFont(f3);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("SWIMMING POOL");
        label1.setBounds(340, 690, 500, 50);
        label1.setFont(f3);
        c.add(label1);


        btn2 = new JButton("Back");
        btn2.setBounds(20, 790, 215, 50);
        btn2.setFont(f3);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#34495e"));
        c.add(btn2);



        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);


        // Action Listener for JButtons

        // Back Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Home frame = new Home();
                frame.setVisible(true);
                setVisible(false);
            }
        });


    }


    

    public static void main(String[] args) {

        Preview frame = new Preview();
        frame.setVisible(true);
    }
}
