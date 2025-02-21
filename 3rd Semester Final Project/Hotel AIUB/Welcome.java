import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Welcome extends JFrame 
{

    private Container c;
    private ImageIcon  logo, icon, welcome;
    private JLabel label1,imgLabel;
    private Font f1,f2;
    private JButton btn1, btn2, nBtn;
    private Cursor cursor;

    Welcome() 
    {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hotel AIUB");
        this.setSize(900, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#16a085"));


        // Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());


        // Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 25);
        f2 = new Font("Tahoma", Font.BOLD, 48);

        // Title
        label1 = new JLabel();
        label1.setText("WELCOME TO");
        label1.setBounds(290, 55, 500, 65);
        label1.setFont(f2);
        c.add(label1);
        
        label1 = new JLabel();
        label1.setText("HOTEL AIUB");
        label1.setBounds(300, 120, 500, 65);
        label1.setFont(f2);
        c.add(label1);
        

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton("Next");
        btn1.setBounds(325, 250, 245, 50);
        btn1.setFont(f1);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#34495e"));
        c.add(btn1);        
        
        btn2 = new JButton("Contribution");
        btn2.setBounds(325, 325, 245, 50);
        btn2.setFont(f1);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#34495e"));
        c.add(btn2);
        
        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        // Contribution Button
        btn2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                Contribution frame = new Contribution();
                frame.setVisible(true);
            }
        });

        // Next Button
        btn1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                setVisible(false);
                Login frame = new Login();
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) 
    {
        Welcome frame = new Welcome();
        frame.setVisible(true);
    }
}
