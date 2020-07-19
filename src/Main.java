import gui.main.MainController;
import javafx.application.Application;
import javafx.stage.Stage;
import util.BrowserProperties;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        MainController mainController = new MainController();
//        mainController.showStage();
        BrowserProperties browserProperties = new BrowserProperties();
        browserProperties.writeProperties();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
