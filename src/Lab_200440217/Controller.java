package Lab_200440217;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text magicInput;

    @FXML
    private Text scienceInput;

    @FXML
    private Text villainInput;

    private Comics comic = new Comics();

    @FXML
    void onButtonClick(ActionEvent event) {
    }
}
