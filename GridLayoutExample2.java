import javax.swing.*;
import java.awt.*;

public class GridLayoutExample2 {
    public static void main(String[] args) {
        // Create a new frame (window)
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Set the layout manager to GridLayout (3 rows, 1 column)
        frame.setLayout(new GridLayout(3, 1, 5, 5));  // 3 rows, 1 column with 5px gaps

        // Create components
        JLabel label = new JLabel("Enter Name:");
        JTextField textField = new JTextField(15);  // 15 columns wide
        JButton button = new JButton("Submit");

        // Add components to the frame (each in its own row)
        frame.add(label);      // First row
        frame.add(textField);  // Second row
        frame.add(button);     // Third row

        // Make the frame visible
        frame.setVisible(true);
    }
}
