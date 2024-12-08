import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // JOptionPane = pop up a standard dialog box that prompts users for a value
        //               or informs then of something

        // giving the plain message
        JOptionPane.showMessageDialog(null, "this is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
        // giving the information message
        JOptionPane.showMessageDialog(null, "this is more useless info", "title", JOptionPane.INFORMATION_MESSAGE);
        // giving a question type of message
        JOptionPane.showMessageDialog(null, "really??", "title", JOptionPane.QUESTION_MESSAGE);
        // giving a warning message
        JOptionPane.showMessageDialog(null, "your computer has virus", "title", JOptionPane.WARNING_MESSAGE);
        // giving a error message
        JOptionPane.showMessageDialog(null, "error occurred", "title", JOptionPane.ERROR_MESSAGE);

        // giving options
        JOptionPane.showConfirmDialog(null, "do you know how to code", "code", JOptionPane.YES_NO_CANCEL_OPTION);

        // taking input
        String name = JOptionPane.showInputDialog("enter your name : ");
        System.out.println(name);

        // creating a string array for the option to change from yes no and cancel to
        String[] option = {"yes i'm", "no i'm not", "fuck u!!"};

        // JOptionPane in one line
        JOptionPane.showOptionDialog(null,
                "u are asowme",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                option,
                0);
    }
}