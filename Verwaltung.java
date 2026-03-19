import java.util.ArrayList; // Importiert ArrayList für dynamische Listen

public class Verwaltung {
    
    private ArrayList<Notes> notizen; // Liste, die alle Notizen speichert
    
    public Verwaltung(){
       notizen = new ArrayList<>(); // Initialisiert die Liste beim Erstellen des Objekts
    }

    // Erstellt eine neue Notiz und fügt sie der Liste hinzu
    public Notes erstelleNotiz(){
        Notes notiz= new Notes(); // Neue Notiz erzeugen
        notizen.add(notiz); // Zur Liste hinzufügen
        return notiz; // Die erstellte Notiz zurückgeben
    }

    // Setzt den Titel einer Notiz
    public void setzeTitel(Notes notiz, String titel){
        notiz.speicherTitel(titel); // Übergibt den Titel an das Notiz-Objekt
    }

    // Setzt den Inhalt einer Notiz
    public void setzeInhalt(Notes notiz, String inhalt){
        notiz.speichereInhalt(inhalt); // Übergibt den Inhalt an das Notiz-Objekt
    }

    // Gibt alle vorhandenen Notizen aus
    public void zeigeVorhandeneNotizen(){
        for(int i = 0; i< notizen.size(); i++){
            // ACHTUNG: Hier ist ein Fehler -> i+1 kann zu IndexOutOfBounds führen
            Notes n = notizen.get(i+1); // Holt die Notiz aus der Liste
            
            System.out.println(i + ". Notiz:"); // Ausgabe des Index
            System.out.println("\tTitel: " + n.gibTitel()); // Titel anzeigen
            System.out.println("\tInhalt: " + n.gibInhalt()); // Inhalt anzeigen
        }
    }

    /**
     * löscht den ersten inhalt in der liste
     * 
     */
    public void loescheNotiz(int index){
        // Prüft, ob der Index außerhalb der Liste liegt
        if(index >= notizen.size()){
            throw new IllegalArgumentException("Index ist außerhalb der Listenlänge");
        }
        notizen.remove(index); // Entfernt die Notiz an der angegebenen Position
    }

}
