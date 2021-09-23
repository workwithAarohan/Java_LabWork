package dialogbox;

import javax.swing.JOptionPane;

public class DialogBox 
{
    public static void main(String[] args) 
    {
        String name = JOptionPane.showInputDialog("Enter your Name:");
        String college = JOptionPane.showInputDialog("Enter your College Name:");
        
        JOptionPane.showMessageDialog(null,"Hello "+ name + "\nWelcome to " + college,
                "Welcome",JOptionPane.INFORMATION_MESSAGE);
    }
}