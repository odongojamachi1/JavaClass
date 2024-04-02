

import javax.swing.*;
import java.awt.event.*;

public class DataProcessor {
    public static void main(String[] args) {
        // Create a JFram
        JFrame frame = new JFrame("User Input");

        // Create a JTextField for user input
        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);

        // Create a JButton
        JButton button = new JButton("Submit");
        button.setBounds(100, 100, 100, 30);

        // Create a JLabel to display the greeting message
        JLabel label = new JLabel();
        label.setBounds(50, 150, 200, 30);

        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText(); // Get user input from the text field
                label.setText("Hello, " + name + "!"); // Display greeting message
            }
        });

        // Add components to the frame
        frame.add(textField);
        frame.add(button);
        frame.add(label);

        // Set frame size and layout
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
