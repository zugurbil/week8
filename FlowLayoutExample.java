import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        // Create a new frame (window)
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        
        // Set the layout manager to FlowLayout
      //frame.setLayout(new FlowLayout());
      //  frame.setLayout(new FlowLayout(FlowLayout.LEFT));
      frame.setLayout( new FlowLayout(FlowLayout.LEFT, 30, 70));
        // Create components
        JLabel label = new JLabel("Enter Name:");
        JTextField textField = new JTextField(15);  // 15 columns wide
        JButton button = new JButton("Submit");

        // Add components to the frame
        frame.add(label);
        frame.add(textField);
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);
    }
}
