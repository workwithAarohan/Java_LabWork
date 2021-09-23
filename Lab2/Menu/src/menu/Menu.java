package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Menu extends JFrame implements ActionListener
{
    JMenu menu, submenu;
    JMenuItem list1, list2, list3, list4, list5, list6;

    Menu()
    {
        JFrame f = new JFrame("Menu");
        JLabel title = new JLabel("Implementation of MenuBar");  
        title.setBounds(110,50,200,20);
        f.add(title);
        
        JMenuBar mb = new JMenuBar();
        
        menu=new JMenu("Subject");
        submenu=new JMenu("Elective");
        
        list1 = new JMenuItem("Advanced Java");
        list2 = new JMenuItem("Data Warehousing and Data Mining");
        list3 = new JMenuItem("Principle of Management");
        list4 = new JMenuItem("Software Project Management");
        list5 = new JMenuItem("Information Retrieval");
        list6 = new JMenuItem("About");
        
        list6.addActionListener(this);
        
        menu.add(list1); 
        menu.add(list2); 
        menu.add(list3);
        submenu.add(list4); 
        submenu.add(list5);
        menu.add(submenu);
        menu.add(list6);
        mb.add(menu);
        
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(null,"This is the implementation of MenuBar",
                "Menu",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String[] args) 
    {
        new Menu();
    }


}
