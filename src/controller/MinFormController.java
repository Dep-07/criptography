package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * encrypt
 * get the first charactor from the key using substring method
 * combined the plaintText and first charactor of the key
 * swap the first value and last value of the combined plaintext
 * get the charators of the swaped plainText on by one
 * sign io to the integer
 * add 15 to it
 * assign to char variable
 * assingn the char into string
 * (final part same as yesterday)
 *
 * decrypt part opposite side of above

 * */


import java.io.IOException;

public class MinFormController {
    public Button btnEncryption;
    public Button btnDecryption;

    public AnchorPane root;

    public void btnEncryption_OnAction(ActionEvent actionEvent) throws IOException {
            loadForm("/view/EncriptionForm.fxml");
    }

    public void btnDecryption_OnAction(ActionEvent actionEvent) throws IOException {
            loadForm("/view/DecryptionForm.fxml");

    }

    private void loadForm(String loadFormURL) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(this.getClass().getResource(loadFormURL));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Encrypt");
        stage.centerOnScreen();
//        stage.initOwner(this.root.getScene().getWindow());
//        stage.initModality(Modality.WINDOW_MODAL);
        stage.show();
    }
}
