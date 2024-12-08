import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;

    MyFrame() {
        button = new JButton("Select File");
        button.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {

            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File("C:\\Users\\Aashish\\Desktop"));

            int response = fileChooser.showOpenDialog(null);   // selects file to open returns 0 if the file opens 1 if the file does not open

            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }

            int response1 = fileChooser.showSaveDialog(null);

            if (response1 == JFileChooser.APPROVE_OPTION) {
                File newFile = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(newFile);
            }
        }
    }
}
