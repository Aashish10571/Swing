import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Myframe extends JFrame implements MouseListener {

    JLabel label;

    Myframe() {
        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        label.addMouseListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // invoked when the mouse button has been clicked (pressed and released) on a component
        System.out.println("you clicked the mouse");
        label.setBackground(Color.black);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // invoked when a mouse button has been released on a component
        System.out.println("you pressed the mouse");
        label.setBackground(Color.yellow);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // invoked when a mouse button has been released on a component
        System.out.println("you released the mouse");
        label.setBackground(Color.green);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // invoked when the mouse enters a component
        System.out.println("you entered the component");
        label.setBackground(Color.blue);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // invoked when the mouse exits a component
        System.out.println("you exited the component");
        label.setBackground(Color.red);
    }
}
