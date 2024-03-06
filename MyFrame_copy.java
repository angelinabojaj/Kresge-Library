/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package search;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author hayapirzada
 */
public class MyFrame extends JFrame implements ActionListener{
    //instantiate variables
    
    JButton button;
    JTextField textField;
    JTextArea resultArea;
    FileReader reader;
    
    MyFrame(){
    //create a button
    button = new JButton();
    button.setBounds(600, 100, 100, 50);//size of button
    button.addActionListener(this); //add actionlister to button
    button.setText("Search"); //button text
    button.setBackground(Color.LIGHT_GRAY);
    button.setBorder(BorderFactory.createBevelBorder(0));
    
    //create a textField
    textField = new JTextField();
    textField.setPreferredSize(new Dimension(500,40));
    
     //create result Area
    resultArea = new JTextArea(20, 30);
    resultArea.setEditable(false);
    
    // Create a panel to hold the components
    JPanel panel = new JPanel(new FlowLayout());
    panel.add(textField);
    panel.add(button);
    panel.add(resultArea, BorderLayout.CENTER);
    
    //create a widnow
    this.setTitle("Search Feature");//sets title of frame
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of app
    
    //add the componets
    this.add(panel);
    this.pack();
    this.setVisible(true); // make frame visible
   
    
    //instantiate/create/read from file
    
    }
    @Override
    public void actionPerformed(ActionEvent e){
       
        if (e.getSource() == button) {
        String searchText = textField.getText().toLowerCase();
        resultArea.setText(""); // Clear previous results
        
        try {
            reader = new FileReader("src/search/books.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                // Check if the line contains the search text in any field (crown number, title, or author)
                if (line.toLowerCase().contains(searchText)) {
                    resultArea.append(line + "\n");
                }
            }

            bufferedReader.close(); // Close the buffered reader
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close(); // Close the file reader
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
          
        }
    }
}
    
    
}
