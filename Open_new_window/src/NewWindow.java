import javax.swing.*;
import java.awt.*;

public class NewWindow {
    // initializing a frame
    JFrame frame = new JFrame();

    // initializing a label
    JLabel label = new JLabel("Hello!");

    // creating a constructor
    NewWindow() {
        // working on label
        label.setBounds(0,0,100,50);
        label.setFont(new Font(null,Font.BOLD,25));

        // creating a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);
    }
}
