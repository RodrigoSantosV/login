package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    public Button idBoton;
   /* public PasswordField passwordOriginal;
    public TextField textField;
    public Label idlabelConstraseña;*/


    public void contboton(ActionEvent evento){
        idBoton.setText("Boton pulasado");
    }

  /*  public void traerdelante(ActionEvent evento2){

            textField.setText(passwordOriginal.getText());
            if(idlabelConstraseña.isFocused())
                passwordOriginal.setVisible(false);

    }*/

}

