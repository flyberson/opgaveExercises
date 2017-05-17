/*
 */
package exerciseBinding;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.ConditionalFeature.FXML;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author flyberson
 */
public class FXMLController implements Initializable {
    @FXML Label label;
    @FXML TextField text;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        label.textProperty().bind(text.textProperty());
    }    
    
}
