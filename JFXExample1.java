import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JFXExample1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a button and set its text
        Button button = new Button("Click me!");

        // Set an action when the button is clicked
        button.setOnAction(e -> System.out.println("Hello, JavaFX!"));

        // Create a layout (StackPane) and add the button to it
        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        // Create a scene with the layout, and set dimensions
        Scene scene = new Scene(layout, 300, 200);

        // Set the scene to the stage
        primaryStage.setScene(scene);

        // Set title for the stage (window)
        primaryStage.setTitle("Simple JavaFX Example");

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}