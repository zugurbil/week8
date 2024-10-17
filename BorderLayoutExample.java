import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        // Create a new frame (window)
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        
        // Set the layout manager to BorderLayout
        frame.setLayout(new BorderLayout());

        // Create components
        JLabel label = new JLabel("Enter Name:");
        JTextField textField = new JTextField(15);  // 15 columns wide
        JButton button = new JButton("Submit");

        // Add components to specific regions of BorderLayout
        frame.add(label, BorderLayout.WEST);       // Label on the West (left)
        frame.add(textField, BorderLayout.CENTER); // Text field in the Center
        frame.add(button, BorderLayout.EAST);      // Button on the East (right)

        // Make the frame visible
        frame.setVisible(true);
    }
}
