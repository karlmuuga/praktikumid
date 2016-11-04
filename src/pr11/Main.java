package pr11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.show();
        VBox layout = new VBox();
        Scene stseen = new Scene(layout, 600, 400);
        primaryStage.setScene(stseen);

        Label pealkiri = new Label("Enter password");
        TextField parool = new PasswordField();
        Button button = new Button("Login");
        layout.getChildren().addAll(pealkiri, parool, button);

        button.setOnAction(event -> {
            if(parool.getText().equals("paroolike123"))
                pealkiri.setText("Õnnestus!");
            else
                pealkiri.setText("Feil!!");
        });
    }
}