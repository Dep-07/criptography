package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import lk.ijse.crypto.Demo;

public class DecryptionFormController {

    public TextField txtText;
    public TextField txtKey;
    public TextField txtDecryptedText;
    public Button btnDecryption;

    public void btnDecryption_OnAction(ActionEvent actionEvent) {

        String cipherText = txtText.getText();
        String key = txtKey.getText();

        if (cipherText.trim().isEmpty()){
            new Alert(Alert.AlertType.ERROR,"Please Enter Valid Text", ButtonType.CLOSE).show();
            txtText.requestFocus();
            return;
        }

        if (key.trim().isEmpty()){
            new Alert(Alert.AlertType.ERROR,"Please Enter Valid Key",ButtonType.CLOSE).show();
            txtKey.requestFocus();
            return;
        }

      /*  System.out.println(text);
        String reversedText = "";
        for (int i = 0; i < text.length(); i++) {
            int code = text.charAt(i);
            code -= 10;
            char orgChar = (char) code;
            reversedText += orgChar;
        }
        System.out.println(reversedText);

        char[] sr = reversedText.toCharArray();
        char temp  = sr[0];
        sr[0] = sr[sr.length-1];
        sr[sr.length -1] = temp;
        String text1 = String.valueOf(sr);
        System.out.println(text1);

        String finalWord = "";
        if(text1.charAt(text1.length()-1) == key.charAt(0) ){
             finalWord = text1.substring(0,text.length()-1);
        }
        System.out.println(text1.charAt(text.length()-1));
        System.out.println(key.charAt(0));
        txtDecryptedText.setText(finalWord);*/
        txtDecryptedText.setText(Demo.decrypt(cipherText,key));



    }
}
