import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() {
        button = new JButton("Pick a color");
        button.addActionListener(this);

        label = new JLabel();
        label.setText("this is some text");
        label.setFont(new Font("Mv Boli", Font.PLAIN, 100));
        label.setBackground(Color.white);
        label.setOpaque(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            // creating a JColorChooser
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "pick a color", Color.BLACK);
            // label.setForeground(color);     // sets the text color
            label.setBackground(color);
        }
    }
}
