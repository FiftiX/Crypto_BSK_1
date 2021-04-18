package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;





public class Main extends Application {

    @FXML
    private Label labelResult;

    @FXML
    private void initialize() {
        labelResult.setText("I'm a Label.");
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

    }


    public void tak(){
        labelResult.setText("SIEMA");
    }

    public static void main(String[] args)
    {

        double n;
        String text, key, a, b;
        //TextField NWord = new TextField();
        //TextField Text = new TextField();
        TextField Key = new TextField();
        TextField AWord = new TextField();
        TextField BWord = new TextField();
        //Label label1 = new Label();
        Button Code = new Button();

        text = AWord.getText();

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {

            }
        };
        Code.setOnAction(event);



        launch(args);
    }
}
