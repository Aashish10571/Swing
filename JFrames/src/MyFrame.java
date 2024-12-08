import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    // creating a constructor
    MyFrame() {
        // giving the title to the frame
        this.setTitle("JFrame");

        // exiting the frame completely when the frame is closed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // making the frame size nonadjustable
        this.setResizable(false);

        // creating the frame size
        this.setSize(1000, 800);

        // making the frames visible
        this.setVisible(true);

        // changing the icon of the frame
        ImageIcon icon = new ImageIcon("C:\\Users\\Aashish\\Desktop\\GRAPHICS\\JFrames\\src\\logo.jpg");
        this.setIconImage(icon.getImage());

        // setting the background color
        this.getContentPane().setBackground(new Color(2, 62, 138));
    }
}
