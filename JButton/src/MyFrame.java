import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    // publicly declaring the button
    JButton button;

    // declaring a lable
    JLabel label;

    // creating a constructor
    MyFrame() {
        // creating a label
        label = new JLabel();
        label.setText("Login successful");
        label.setFont(new Font("Mv Boli", Font.BOLD, 25));
        label.setBounds(150, 300, 200, 50);
        label.setVisible(false);

        // creating a button
        button = new JButton();
        button.setBounds(200, 200, 100, 50);
        // button.addActionListener(e -> System.out.println("done")); shortcut of the action listener
        button.addActionListener(this);
        button.setText("Press");
        button.setFocusable(false);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setForeground(Color.white);
        button.setBackground(Color.blue);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setBorder(BorderFactory.createEtchedBorder());
        // button.setEnabled(false); disables the button

        // setting up the frame
        this.setTitle("JButton");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(800, 600);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("done");
            // button.setEnabled(false);   // disable the button so the button can be pressed only once
            label.setVisible(true);
        }
    }
}
