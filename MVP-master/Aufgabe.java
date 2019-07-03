import javafx.scene.layout.Pane;
public abstract class Aufgabe
{
    // Attribute
    protected int punkte;

    // Methoden
    public abstract double richtigeLoesungAnzeigen();

    public abstract boolean loesungUeberpruefen();

    public abstract Pane darstellungErstellen();
    
    public abstract void neu();

    public int getPunkte()
    {
        return punkte;
    }

}
