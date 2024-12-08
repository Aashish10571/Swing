import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;

public class MyFrame extends JFrame implements MouseListener {
    JLabel label;

    MyFrame() {
        label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
        label.setBounds(780, 0, 20, 20);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.setSize(800, 600);
        this.setLayout(null);
        this.setUndecorated(true);
        this.add(label);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setOpacity(0.7f);
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 40, 40));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == label) {
            this.dispose();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == label) {
            label.setText("X");
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("");
    }
}
