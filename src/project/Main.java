package project;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import static java.lang.Integer.parseInt;

public class Main extends Application{

    @FXML
    private ComboBox ComboBox1;
    @FXML
    private TextField TextResult, AWord, BWord, NWord, Key, Text;
    @FXML
    private Label NLabel, KeyLabel, ALabel, BLabel;

    private int param;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("Crypto_BSK_1");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    @FXML
    public void onStart(){
        String options[] =
                { "Rail Fence", "Macierzowy 2a", "Macierzowy 2b", "Macierzowy 2c", "Cezara", "Vigenere'a" };
        ComboBox1.setItems(FXCollections.observableArrayList(options));
    }

    @FXML
    public void codeAction(){
        String text, key, n, a, b;
        switch(param){
            case 0:
                text = Text.getText();
                n = NWord.getText();
                RailFence railFence = new RailFence(text, parseInt(n));
                TextResult.setText(railFence.encrypt());
                break;
            case 1:
                text = Text.getText();
                Macierzowy2a macierzowy2a = new Macierzowy2a(text);
                TextResult.setText(macierzowy2a.encrypt());
                break;
            case 2:
                text = Text.getText();
                key = Key.getText();
                Macierzowy2b macierzowy2b = new Macierzowy2b(text, key);
                TextResult.setText(macierzowy2b.encrypt());
                break;
            case 3:
                text = Text.getText();
                key = Key.getText();
                Macierzowy2c macierzowy2c = new Macierzowy2c(text, key);
                TextResult.setText(macierzowy2c.encrypt());
                break;
            case 4:
                text = Text.getText();
                a = AWord.getText();
                b = BWord.getText();
                Cezara cezara = new Cezara(text,parseInt(a), parseInt(b));
                TextResult.setText(cezara.encrypt());
                break;
            case 5:
                text = Text.getText();
                key = Key.getText();
                Vigenerea vigenerea = new Vigenerea(text, key);
                TextResult.setText(vigenerea.encrypt());
                break;
        }
    }

    @FXML
    public void decodeAction(){
        String text, key, n, a, b;
        switch(param){
            case 0:
                text = Text.getText();
                n = NWord.getText();
                RailFence railFence = new RailFence(text, parseInt(n));
                TextResult.setText(railFence.decrypt());
                break;
            case 1:
                text = Text.getText();
                Macierzowy2a macierzowy2a = new Macierzowy2a(text);
                TextResult.setText(macierzowy2a.decrypt());
                break;
            case 2:
                text = Text.getText();
                key = Key.getText();
                Macierzowy2b macierzowy2b = new Macierzowy2b(text, key);
                TextResult.setText(macierzowy2b.decrypt());
                break;
            case 3:
                text = Text.getText();
                key = Key.getText();
                Macierzowy2c macierzowy2c = new Macierzowy2c(text, key);
                TextResult.setText(macierzowy2c.decrypt());
                break;
            case 4:
                text = Text.getText();
                a = AWord.getText();
                b = BWord.getText();
                Cezara cezara = new Cezara(text,parseInt(a), parseInt(b));
                TextResult.setText(cezara.decrypt());
                break;
            case 5:
                text = Text.getText();
                key = Key.getText();
                Vigenerea vigenerea = new Vigenerea(text, key);
                TextResult.setText(vigenerea.decrypt());
                break;
        }
    }

    @FXML
    public void onChange(){
        Object actually = ComboBox1.getValue();
        if(actually == "Rail Fence"){
            param = 0;
            NLabel.setVisible(true);
            NWord.setVisible(true);
            KeyLabel.setVisible(false);
            Key.setVisible(false);
            ALabel.setVisible(false);
            AWord.setVisible(false);
            BLabel.setVisible(false);
            BWord.setVisible(false);
        }
        if(actually == "Macierzowy 2a"){
            param = 1;
            NLabel.setVisible(false);
            NWord.setVisible(false);
            KeyLabel.setVisible(false);
            Key.setVisible(false);
            ALabel.setVisible(false);
            AWord.setVisible(false);
            BLabel.setVisible(false);
            BWord.setVisible(false);
        }
        if(actually == "Macierzowy 2b"){
            param = 2;
            NLabel.setVisible(false);
            NWord.setVisible(false);
            KeyLabel.setVisible(true);
            Key.setVisible(true);
            ALabel.setVisible(false);
            AWord.setVisible(false);
            BLabel.setVisible(false);
            BWord.setVisible(false);
        }
        if(actually == "Macierzowy 2c"){
            param = 3;
            NLabel.setVisible(false);
            NWord.setVisible(false);
            KeyLabel.setVisible(true);
            Key.setVisible(true);
            ALabel.setVisible(false);
            AWord.setVisible(false);
            BLabel.setVisible(false);
            BWord.setVisible(false);
        }
        if(actually == "Cezara"){
            param = 4;
            NLabel.setVisible(false);
            NWord.setVisible(false);
            KeyLabel.setVisible(false);
            Key.setVisible(false);
            ALabel.setVisible(true);
            AWord.setVisible(true);
            BLabel.setVisible(true);
            BWord.setVisible(true);
        }
        if(actually == "Vigenere'a"){
            param = 5;
            NLabel.setVisible(false);
            NWord.setVisible(false);
            KeyLabel.setVisible(true);
            Key.setVisible(true);
            ALabel.setVisible(false);
            AWord.setVisible(false);
            BLabel.setVisible(false);
            BWord.setVisible(false);
        }
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}