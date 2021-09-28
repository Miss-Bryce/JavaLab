package Lab_200440217;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private TextField magicInput;

    @FXML
    private TextField scienceInput;

    @FXML
    private TextField villainInput;

    @FXML
    private Text outputText;

    //private ComicSeries comicSeries = new ComicSeries();

    @FXML
    void onButtonClick(ActionEvent event) {
        ComicSeries comic = new ComicSeries(magicInput.getText(),scienceInput.getText(),villainInput.getText());
        outputText.setText(comic.toString());
    }
}
