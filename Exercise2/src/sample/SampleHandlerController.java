package sample;
import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class SampleHandlerController {
    @FXML
    private Label jumpingLabel;

    public void movingLabel(){

        //generates a new random number generator called randomPos
        Random randomPos = new Random();
        //if the jumpingLabel is touched by the cursor it automatically jumps to a random position
        //this next line sets the X coordinate on the page
        jumpingLabel.setLayoutX(randomPos.nextInt(500));
        //this next line sets the Y coordinate on the page
        jumpingLabel.setLayoutY(randomPos.nextInt(300));
    }
}