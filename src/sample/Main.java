package sample;

import com.itextpdf.text.Document;
import com.sun.prism.Image;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Calculator");
       // scene.getStylesheets().addAll("style.css");
        primaryStage.setScene(new Scene(root,346,432));
        primaryStage.show();
    }

    Document doc = new Document();

    public static void main(String[] args) {
        launch(args);
    }
}
