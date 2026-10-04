package com.form;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuiDesign 
{
	private JFrame frm;
    private JLabel lb1,lb2 , lb3,lb4,lb5,lb6,lb7,lb8;
    private JButton bt1,bt2;
    private JCheckBox checkBox1,checkBox2,checkBox3;
    private JRadioButton radioButton1 , radioButton2;
    private JTextArea textArea1,addressArea;
    private JTextField txtName, txtId,txtPhone,txtemail;
    private JComboBox<String> countryCbox;
    private ButtonGroup btg;

    public GuiDesign()
    {
        frm = new JFrame("Employee Registration form");
        bt1 = new JButton("Submit");
        bt2 = new JButton("Reset");
        
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();
        

        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();

        lb1 = new JLabel();
        lb2 = new JLabel();
        lb3 = new JLabel();
        lb4 = new JLabel();
        lb5 = new JLabel();
        lb6 = new JLabel();
        lb7 = new JLabel();
        lb8 = new JLabel();
        
        txtName = new JTextField();
        txtId = new JTextField();
        txtPhone = new JTextField();
        txtemail = new JTextField();
        
        textArea1 = new JTextArea(100,50);
        addressArea = new JTextArea(5,20);
      
        String countyList[] = {"India","Pakistan","Amrica","China","Bangladesh","Australiya"} ;
        countryCbox = new JComboBox<>(countyList);

         btg = new ButtonGroup();
        gui();
    }

    public void gui()
    {
        frm.setVisible(true);
        frm.setLayout(null);
        frm.setBounds(10,20,900,650);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel heading = new JLabel("Employee Registration Form");
        heading.setBounds(250, 10, 450, 40);
        heading.setFont(new Font("Arial", Font.BOLD, 25));
        frm.add(heading);
        
        lb1.setText("Employee Name : ");
        lb1.setBounds(30,70,140,40);
        frm.add(lb1);
        
        txtName.setBounds(165,75,200,30);
        frm.add(txtName);
        
        lb2.setText("Employee ID : ");
        lb2.setBounds(30,115,130,40);
        frm.add(lb2);
        
        txtId.setBounds(165,120,200,30);
        frm.add(txtId);
        
        lb3.setText("Education :");
        lb3.setBounds(30, 160, 130, 40);
        frm.add(lb3);
        
        checkBox1.setText("10th");
        checkBox1.setBounds(165, 160, 70, 40);

        checkBox2.setText("12th");
        checkBox2.setBounds(240, 160, 70, 40);
        
        checkBox3.setText("Graduation");
        checkBox3.setBounds(315, 160, 120, 40);

        frm.add(checkBox1);
        frm.add(checkBox2);
        frm.add(checkBox3);

        checkBox1.addActionListener(e -> {
        	String edu = checkBox1.getText();
        	JOptionPane.showMessageDialog(frm, "You have selected : "+ edu);
        });
        
        checkBox2.addActionListener(e -> {
        	String edu = checkBox2.getText();
        	JOptionPane.showMessageDialog(frm, "You have selected : "+ edu);
        });
        
        checkBox3.addActionListener(e -> {
        	String edu = checkBox3.getText();
        	JOptionPane.showMessageDialog(frm, "You have selected : "+ edu);
        });
        
        lb4.setText("Gender : ");
        lb4.setBounds(30,205,130,40);
        frm.add(lb4);
        
        radioButton1.setText("Male");
        radioButton1.setBounds(165,205,100,40);
        
        radioButton2.setText("female");
        radioButton2.setBounds(265,205,100,40);
        
        btg.add(radioButton1);
        btg.add(radioButton2);
        
        frm.add(radioButton1);
        frm.add(radioButton2);
        
        lb5.setText("Country : ");
        lb5.setBounds(30,250,130,40);
        frm.add(lb5);
        
        countryCbox.setBounds(165,255,200,30);
        frm.add(countryCbox);
        
        lb7.setText("Phone number :");
        lb7.setBounds(30,295,130,40);
        frm.add(lb7);

        txtPhone.setBounds(165,295,200,40);
        frm.add(txtPhone);
        
        lb6.setText("Address :");
        lb6.setBounds(30, 335, 130, 40);
        frm.add(lb6);
        
        addressArea.setLineWrap(true);
        addressArea.setWrapStyleWord(true);

        addressArea.setBounds(165, 347, 200, 65);
        frm.add(addressArea);

        bt1.setBounds(155,440,100,40);
        frm.add(bt1);
        
        bt2.setBounds(265,440,100,40);
        frm.add(bt2);
        
        JLabel resHeading = new JLabel("Employee Detail");
        resHeading.setBounds(500,65,300,35);
        resHeading.setFont(new Font("Arial",Font.BOLD, 22));
        
        frm.add(resHeading);
        textArea1.setBackground(Color.YELLOW);
        textArea1.setForeground(Color.BLUE);
        textArea1.setFont(new Font("Arial", Font.BOLD, 17));
        textArea1.setEditable(false);
        
        textArea1.setBounds(480,105,370,400);
        frm.add(textArea1);
        
        bt1.addActionListener(e -> {
        	String name = txtName.getText().trim();
        	String id = txtId.getText().trim();
        	String phone = txtPhone.getText().trim();
        	if(name.isBlank() || id.isBlank() || phone.isBlank())
        	{
        		JOptionPane.showMessageDialog(frm, "Please enter Employee Name, Id and Phone ");
        		return;
        	}
        	
        	String edu = "";
        	if (checkBox1.isSelected()) 
				edu = checkBox1.getText();
        	
			if (checkBox2.isSelected())
					edu = edu.concat(" "+checkBox2.getText());
				
			if (edu.isBlank())
						edu = "Not selected";
	
						String gender = "Not Selected";
			
						
			if (radioButton1.isSelected()) {
						gender = radioButton1.getText();
			}
			else if (radioButton2.isSelected()) {
				gender = radioButton2.getText();
			}
			
			String country = (String) countryCbox.getSelectedItem();
			String address = addressArea.getText();
			
			textArea1.setText("");
			textArea1.append("EMPLOYEE DETAILS\n");
			textArea1.append("--------------------------\n\n");
            textArea1.append("Employee Name : "+ name + "\n\n");
            textArea1.append("Employee ID : " + id+ "\n\n");
            textArea1.append("Education : " +edu+ "\n\n");
            textArea1.append("Gender : " + gender + "\n\n");
            textArea1.append("Country : " +country + "\n\n");
            textArea1.append("Address : " +address + "\n\n");
            textArea1.append("Phone number : " +phone + "\n\n");
            textArea1.append("--------------------------\n");
            textArea1.append("Registration Successfull !!!!");
            
            JOptionPane.showMessageDialog(frm, "Employee Registration Successfully!");
            
        });
        
        bt2.addActionListener(e -> {
        	txtName.setText("");
        	txtId.setText("");
        	
        	checkBox1.setSelected(false);
        	checkBox2.setSelected(false);
        	btg.clearSelection();
        	countryCbox.setSelectedIndex(0);
        	addressArea.setText("");
        	textArea1.setText("");
      
        });
        
        
    }
}










