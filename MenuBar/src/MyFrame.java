import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu filMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    MyFrame() {
        // creating a menu bar
        menuBar = new JMenuBar();
        filMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        filMenu.setMnemonic(KeyEvent.VK_F);     // press Alt + f to open
        editMenu.setMnemonic(KeyEvent.VK_E);    // press Alt + e to edit
        helpMenu.setMnemonic(KeyEvent.VK_H);    // press Alt + h to help

        menuBar.add(filMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setMnemonic(KeyEvent.VK_L);    // L for load
        saveItem.setMnemonic(KeyEvent.VK_S);    // S for save
        exitItem.setMnemonic(KeyEvent.VK_E);    // E to exit

        filMenu.add(loadItem);
        filMenu.add(saveItem);
        filMenu.add(exitItem);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("loaded a file");
        } else if (e.getSource() == saveItem) {
            System.out.println("saved a file");
        } else {
            System.exit(0);
        }
    }
}
