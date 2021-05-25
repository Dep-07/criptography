package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import lk.ijse.crypto.Demo;


public class EncriptionFormController {
    public TextField txtText;
    public TextField txtKey;
    public TextField txtEncryptedText;
    public Button btnEncrypt;



    public void btnEncrypt_OnAction(ActionEvent actionEvent) {
            String plainText = txtText.getText();
            String key = txtKey.getText();

            if (plainText.trim().isEmpty()){
                new Alert(Alert.AlertType.ERROR,"Please Enter Valid Text", ButtonType.CLOSE).show();
                txtText.requestFocus();
                return;
            }

            if (key.trim().isEmpty()){
                new Alert(Alert.AlertType.ERROR,"Please Enter Valid Key",ButtonType.CLOSE).show();
                txtKey.requestFocus();
                return;
            }


              txtEncryptedText.setText(Demo.encrypt(plainText,key));






       /* String keyFirst = key.substring(0,1);
        text += keyFirst;
        System.out.println(text);


        char[] sr = text.toCharArray();
        char temp  = sr[0];
         sr[0] = sr[sr.length-1];
         sr[sr.length -1] = temp;
          String text1 = String.valueOf(sr);
        System.out.println(text1);

        String cipherText = "";

        for (int i = 0; i < text1.length(); i++) {
            int code = text1.charAt(i);
            System.out.println(code);
            code += 10;
            char newChar = (char) code;
            cipherText += newChar;
            //System.out.println(cipherText);

        }

        txtEncryptedText.setText(cipherText);
*/
    }
}
