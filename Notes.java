public class Notes {
    //inhalt
    private String inhalt; // Speichert den Textinhalt der Notiz
    private String titel;  // Speichert den Titel der Notiz


    // Gibt den Inhalt der notiz wieder zurück
    public String gibInhalt(){
        return inhalt; // Gibt den gespeicherten Inhalt zurück
    }
    /**
     * speichert den Inhalt was eingetipp wird
     * @param text
     */
    public void speichereInhalt(String text){
        this.inhalt = text; // Speichert den übergebenen Text im Attribut
    }
    
    // Gibt den Titel der Notiz zurück
    public String gibTitel(){
        return titel;
    }

    // Speichert den Titel der Notiz
    public void speicherTitel(String text){
        this.titel = text; // Setzt den Titel

    }
}



/* 
    Sichtbarkeit voi nameDerMethode(beliebig viele Parameter angeben)
    {
        Hier kommt der Code der in der Methode ausgeführt wird
    } 
----------------------------------------------------
    Ein Parameter ist:
    Parametertyp    Parametername
    z.B.:
    String          nnnnnn
    int             num
    double          kommazahl
----------------------------------------------------

    Datentypen:
    Datentyp        Beschreibung
    int             Ganzzahlen z.B. 2000
    double          Gleitkommazahlen z.B. 467.88
    float           Gleitkommazahlen 
    boolean         true oder false
    char            ein einzelnes zeichen z.B.: "a" oder "6"
    long            eine Ganzzahl aber größer als int z.B.: 4000_000_000
    byte            eine Ganzzahl kleiner als int (-128 bis 127)
    short           -32,768 bis 32,767
*/

