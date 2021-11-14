package pl.hemostaza.masterkeyboard;

import javafx.scene.input.KeyEvent;

public class TypingController {

    private char[] lineChars;
    private int lastIndex;
    private int currentIndex = 0;
    private int error = 0;
    private String userString = "";
    private GamePrinter printer;

    public TypingController(GamePrinter printer, String text) {

        this.printer = printer;
        printer.setToWrite(text);
        lineChars = text.toCharArray();
        lastIndex = text.length();
    }

    public void KeyTyped(KeyEvent e) {
        System.out.println(lineChars[currentIndex]);

        if (e.getCharacter().charAt(0) == lineChars[currentIndex]) {

            userString += e.getCharacter();

            printer.setUserInput(userString);
            if (currentIndex < lastIndex - 1) {
                currentIndex++;
            } else {
                System.out.println("Koniec! ilość błędów: " + error);
                currentIndex = 0;
            }
            printer.setErrorChar("");
            System.out.println("dobrze");
        } else {
            error++;
            printer.setErrorChar(e.getCharacter());
            System.out.println("źle");
        }
    }


}
