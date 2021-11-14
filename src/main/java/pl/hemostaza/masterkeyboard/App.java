package pl.hemostaza.masterkeyboard;

import javafx.application.Application;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class App extends Application  {

    String line = "Testowa linia, sprawdzam czy potrafisz pisać, zażółć gęślą jaźń";

    private UserInterface userInterface;
    private GamePrinter gamePrinter;
    private TypingController typingController;

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Miszcz klawiatury wersja 0.0.0.0.0.1");
        //userInterface= new UserInterface();
        gamePrinter = new GamePrinter(stage);
        //userInterface.InitializeGame(stage, line);
        gamePrinter.print();
        typingController = new TypingController(gamePrinter, line);
        stage.addEventHandler(KeyEvent.KEY_TYPED, typingController::KeyTyped);


        stage.show();
    }


}
