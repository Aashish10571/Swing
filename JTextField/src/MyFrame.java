import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    // creating a JTextField
    JTextField textField = new JTextField();

    // creating a button
    JButton button = new JButton("Submit");

    // creating a constructor
    MyFrame() {
        // creating a frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.addActionListener(this);

        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 25));
        textField.setBackground(Color.black);
        textField.setForeground(Color.green);
        textField.setCaretColor(Color.white);
        textField.setText("@gmail.com");

        this.add(textField);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(textField.getText());
            this.dispose();
        }
    }
}
