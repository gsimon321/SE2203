package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("SampleHandler.fxml"));
        //sets the title for the window
        primaryStage.setTitle("Try Touching Me");
        //sets the height and width of the root
        primaryStage.setScene(new Scene(root, 600, 400));
        //shows the stage
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
