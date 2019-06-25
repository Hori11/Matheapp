
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EinfacheAufgabeController {

    @FXML
    private Label aufgabentext;

    @FXML
    private TextField antwort;

    /*
     * Setzt den Aufgabentext
     */
    public void neueAufgabe(int zahl1, int zahl2, String s)
    {
        aufgabentext.setText(zahl1 + " " + s + " " + zahl2 + " = ");
        antwort.setText("");
    }

    /*
     * Holt die eingegebene Antwort
     */
    public int getAntwort()
    {
        int s = Integer.parseInt(antwort.getText());
        return s;
    }
}
