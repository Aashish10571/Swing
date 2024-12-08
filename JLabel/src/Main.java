// importing some files

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // image to be added to the frame
        ImageIcon icon = new ImageIcon("C:\\Users\\Aashish\\Desktop\\GRAPHICS\\JLabel\\src\\logo.jpg");
        // border for the label
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        // creating a JLabel
        JLabel label = new JLabel();
        // setting the text to the frame
        label.setText("Hello World!!!");
        // adding the image to the frame
        label.setIcon(icon);
        // positioning the text on the frame horizontally
        label.setHorizontalTextPosition(JLabel.CENTER);
        // positioning the text on the frame vertically
        label.setVerticalTextPosition(JLabel.TOP);
        // changing the text color
        label.setForeground(new Color(255, 0, 0));
        // changing the font and size of the text on the screen
        label.setFont(new Font("Mv Boli", Font.BOLD, 25));
        // changing the gap between the text and the image
        label.setIconTextGap(10);
        // setting the background color of the label
        label.setBackground(Color.black);
        // setting the opacity of the label background
        label.setOpaque(true);
        // setting the border of the label
        label.setBorder(border);
        // positioning the elements of the label horizontally
        label.setHorizontalAlignment(JLabel.CENTER);
        // positioning the elements of the label vertically
        label.setVerticalAlignment(JLabel.CENTER);

        // creating the frame
        JFrame frame = new JFrame();
        // giving the frame title
        frame.setTitle("JLabel");
        // completely when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // making the frame nonadjustable
        frame.setResizable(false);
        // setting the frame size
        frame.setSize(800, 600);
        // making the frame visible
        frame.setVisible(true);
        // adding the label to the frame
        frame.add(label);
        // the label occupies only the exact required size for it in the frame (the frame becomes exactly the size to fix the label)
        frame.pack();
    }
}