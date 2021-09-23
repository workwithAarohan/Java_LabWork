/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationform;

import java.awt.Container;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


class RegistrationForm extends JFrame
{
    JLabel title, name, firstname, lastname, dob, gender, mobile, email, password, address;
    JTextField firstnameField, lastnameField, mobileField, emailField;
    JRadioButton male, female, other;
    JPasswordField passwordField;
    JTextArea addressField;
    JCheckBox check;

    JComboBox day, month, year, country;
    String[] days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    String[] years = {"2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000", "1999","1998","1997"};

    JButton submit;

    RegistrationForm()
    {
        setTitle("Registration Form");
        setSize(800,650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Courier", Font.PLAIN,20));
        title.setBounds(20,10,200,30);
        c.add(title);

        name = new JLabel("Name: ");
        name.setBounds(20,50,100,30);
        c.add(name);
        firstnameField = new JTextField();
        firstnameField.setBounds(120,50,100,30);
        c.add(firstnameField);
        lastname = new JLabel("First Name");
        lastname.setBounds(140,70,100,30);
        lastname.setFont(new Font("Courier", Font.PLAIN,10));
        c.add(lastname);
        lastnameField = new JTextField();
        lastnameField.setBounds(230,50,100,30);
        c.add(lastnameField);
        lastname = new JLabel("Last Name");
        lastname.setBounds(250,70,100,30);
        lastname.setFont(new Font("Courier", Font.PLAIN,10));
        c.add(lastname);

        dob = new JLabel("Birth Date: ");
        dob.setBounds(20,120,100,30);
        c.add(dob);
        month = new JComboBox(months);
        month.setBounds(190,120,60,30);
        c.add(month);
        day = new JComboBox(days);
        day.setBounds(120,120,60,30);
        c.add(day);
        year = new JComboBox(years);
        year.setBounds(260,120,70,30);
        c.add(year);

        gender = new JLabel("Gender: ");
        gender.setBounds(20,170,100,30);
        c.add(gender);
        male = new JRadioButton("Male");
        male.setBounds(120, 180,60,20);
        male.setSelected(true);
        c.add(male);
        female = new JRadioButton("Female");
        female.setBounds(190, 180,70,20);
        c.add(female);
        other = new JRadioButton("Other");
        other.setBounds(270, 180,60,20);
        c.add(other);
        ButtonGroup gen = new ButtonGroup();
        gen.add(male);
        gen.add(female);
        gen.add(other);

        mobile = new JLabel("Mobile Number: ");
        mobile.setBounds(20,220,100,30);
        c.add(mobile);
        mobileField = new JTextField();
        mobileField.setBounds(120,220, 210,30);
        c.add(mobileField);

        email = new JLabel("Email: ");
        email.setBounds(20,270,100,30);
        c.add(email);
        emailField = new JTextField();
        emailField.setBounds(120,270,210,30);
        c.add(emailField);

        password = new JLabel("Password: ");
        password.setBounds(20,320,100,30);
        c.add(password);
        passwordField = new JPasswordField();
        passwordField.setBounds(120,320,210,30);
        c.add(passwordField);

        address = new JLabel("Address: ");
        address.setBounds(20,370,100,30);
        c.add(address);
        addressField = new JTextArea();
        addressField.setBounds(120,370,210,50);
        c.add(addressField);

        check = new JCheckBox("Keep me signed in.");
        check.setBounds(120,450, 200,30);
        c.add(check);

        submit = new JButton("Submit");
        submit.setBounds(230,500,100,30);
        c.add(submit);

        setVisible(true);
    }

    public static void main(String[] args) 
    {
        new RegistrationForm();
    }   
}