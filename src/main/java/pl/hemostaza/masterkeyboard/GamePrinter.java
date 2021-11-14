package pl.hemostaza.masterkeyboard;

import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class GamePrinter {

    private Stage gameStage;
    private Text toWrite;
    private Text userInput;
    private Text errorChar;

    public GamePrinter(Stage stage) {
        toWrite = new Text();
        userInput = new Text();
        errorChar = new Text();
        gameStage = stage;
    }

    public void print() {
        HBox hBox = new HBox();
        toWrite.setStyle("-fx-font: 24 arial;");
        userInput.setFill(Color.GREEN);
        userInput.setStyle("-fx-font: 24 arial;");
        errorChar.setFill(Color.RED);
        errorChar.setStyle("-fx-font: 24 arial;");
        errorChar.setWrappingWidth(500);
        gameStage.initStyle(StageStyle.UTILITY);
        hBox.getChildren().addAll(userInput, errorChar);
        VBox vBox = new VBox(toWrite, hBox);
        Scene scene = new Scene(vBox);
        gameStage.setScene(scene);
    }

    public String gettoWrite() {
        return toWrite.getText();
    }

    public Text getuserInput() {
        return userInput;
    }

    public Text geterrorChar() {
        return errorChar;
    }

    public void setToWrite(String toWrite) {
        this.toWrite.setText(toWrite);
    }

    public void setUserInput(String userInput) {
        this.userInput.setText(userInput);
    }

    public void setErrorChar(String errorChar) {
        this.errorChar.setText(errorChar);
    }

}
