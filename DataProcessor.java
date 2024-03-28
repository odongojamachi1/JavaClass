// import java.util.Scanner;

// public class DataProcessor {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input phase
//         System.out.println("Enter your name:");
//         String name = scanner.nextLine();

//         System.out.println("Enter your age:");
//         int age = scanner.nextInt();

//         // Process phase
//         String message;
//         if (age >= 18) {
//             message = "You are an adult.";
//         } else {
//             message = "You are a minor.";
//         }

//         // Output phase
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println(message);

//         // Close the scanner
//         scanner.close();
//     }
// }

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
