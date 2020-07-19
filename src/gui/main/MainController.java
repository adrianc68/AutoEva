package gui.main;

import gui.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

public class MainController extends Controller {
    @FXML private HBox bC;
    @FXML private TextField uField;
    @FXML private PasswordField pField;
    @FXML private TextField prField;
    @FXML private TextField archF;
    @FXML private CheckBox checkP;
    @FXML private TextField notificacionField;

    public MainController() {
    }


    public void showStage() {
        loadFXMLFile( getClass().getResource( "/gui/main/MainVista.fxml" ), this );
        stage.showAndWait();
    }


}
