package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

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
