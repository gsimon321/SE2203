package sample;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class BeautifulFlowersController implements Initializable {
    //initialization of all of the FXML objects
    @FXML
    private ImageView flowersImageView;
    @FXML
    private Label flowersNote;
    @FXML
    private RadioButton roseRadioButton;
    @FXML
    private RadioButton callaLilyRadioButton;
    @FXML
    private RadioButton cannaRadioButton;
    @FXML
    private RadioButton bleedingHeartRadioButton;
    @FXML
    private RadioButton cherryBlossomRadioButton;

    //declaration of all of the Images
    private Image rose;
    private Image callaLilly;
    private Image canna;
    private Image cherryBlossom;
    private Image bleedingHeart;

    //initialize method that starts once the program is run
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //initializing all of the images use a file path
        rose = new Image("Rose.gif");
        callaLilly = new Image("Calla Lily.gif");
        canna = new Image("Canna.gif");
        bleedingHeart = new Image("Bleeding Heart.gif");
        cherryBlossom = new Image("Cherry Blossom.gif");

    }
    //listener responsible for the onclick action of the Rose Radio button
    public void roseRadioButtonListener() {
        //sets the image of the ImageView to be a rose
        flowersImageView.setImage(rose);
        //sets the text of the label to be the appropriate one
        flowersNote.setText("This beautiful flower and symbol of love belongs the genus Rosa. The family name of thisflower is Rosaceae and it contains different other species in almost all parts of the world. Theflower of rose vary in size from each other depending upon the species to which they belong.A large number of species of this flower are found in different parts of Asia.");
    }
    //listener responsible for the onclick action of the Calla Lilly Radio button
    public void callaLilyRadioButtonListener() {
        //sets the image of the ImageView to be a calla lilly
        flowersImageView.setImage(callaLilly);
        //sets the text of the label to be the appropriate one
        flowersNote.setText("One simple and common name of this beautiful flower is arum lily and this flowering plant belongs to the family known as Araceae. This flowering plant is grown well in areas which have reasonable rainfall and moderate temperatures.");
    }
    //listener responsible for the onclick action of the Canna Radio button
    public void cannaRadioButtonListener(){
        //sets the image of the ImageView to be a canna
        flowersImageView.setImage(canna);
        //sets the text of the label to be the appropriate one
        flowersNote.setText("This beautiful flowering plant belongs to a genus that contains around 10 species and its family is know as Cannaceae. This flower plant also provides large quantity of starch which is further used for different purposes. This flower is mostly found in tropical regions of the world. The flower of this plant have three sepals and three petals.");
    }
    //listener responsible for the onclick action of the Cherry Blossom Radio button
    public void cherryBlossomRadioButtonListener(){
        //sets the image of the ImageView to be a cherry blossom
        flowersImageView.setImage(cherryBlossom);
        //sets the text of the label to be the appropriate one
        flowersNote.setText("Cherry blossom, a beautiful flowering plant is found in different parts of the world including the Northern hemisphere.  It is found in those areas which have moderate climate. All species of this flowering plant do not produce cherries at all as there are special species of the flower that produce edible cherries.");
    }
    //listener responsible for the Bleeding Heart Radio Button
    public void bleedingHeartRadioButtonListener(){
        //sets the image of the ImageView to be a bleeding heart
        flowersImageView.setImage(bleedingHeart);
        //sets the text of the label to be the appropriate one
        flowersNote.setText("The bleeding heart flower belongs tot the family know as Papaveraceae. This heart shaped flower is famous all over the world due to its unique beauty and is found in great numbers in Siberia and China. Blooming season of this flower starts in spring when there spread beautiful pink heart-shaped flowers in gardens.  Lady-in-a-bath is also a common name of this flower.");
    }
}