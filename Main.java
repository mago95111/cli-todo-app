import java.util.Scanner; // Importiert die Scanner-Klasse, um Benutzereingaben über die Konsole zu lesen

public class Main {
    public static void main(String[] args) {
        // Wenn true dann Programm beenden
        boolean shutdown = false; // Steuerungsvariable für das Beenden der Schleife/Programms
        
        Verwaltung ver = new Verwaltung(); // Erstellt ein Verwaltungsobjekt, das alle Notizen speichert
        
        Scanner scanner = new Scanner(System.in); // Scanner zum Einlesen von Benutzereingaben
        
        Notes notiz = new Notes(); // Erstellt eine leere Notiz
        
        String notizInhalt = ""; // Variable zum Speichern des Notizinhalts
        String notizTitel = "";  // Variable zum Speichern des Notiztitels
        
        int eingabe = -1; // Variable für die Menüauswahl, initial auf -1 gesetzt
        
        System.out.println("####### Herzlich Willkommen zur Notizenapp NextNotes #######"); // Begrüßungsausgabe
        
        // Hauptschleife läuft solange das Programm nicht beendet wird
        while (true && !shutdown) {
            System.out.println("------------------------------------------------------------------");
            System.out.println("Menü (Gib eine Zahl ein):");
            System.out.println("1: neue Notiz zu erstellen");
            System.out.println("2: alle Notizen anzuzeigen");
            System.out.println("3: eine Notiz zu löschen");
            System.out.println("0: das Programm zu beenden");
            
            try {
                // Liest eine Ganzzahl vom Benutzer ein
                eingabe = scanner.nextInt();
                scanner.nextLine(); // Leert den Eingabepuffer (wichtig nach nextInt)
            } catch (Exception e) {
                // Falls keine Zahl eingegeben wurde
                System.out.println("Falsche Eingabe, bitte Wiederholen");
                scanner.nextLine(); // Eingabepuffer leeren
                continue; // Zurück zum Anfang der Schleife
            }
            
            // Auswahlstruktur für das Menü
            switch (eingabe) {
                case 0:
                    shutdown = true; // Programm beenden
                    break;
                    
                case 1:
                    // Neue Notiz erstellen
                    notiz = ver.erstelleNotiz();
                    
                    System.out.println("Gib den Titel deiner Notiz ein: ");
                    notizTitel = scanner.nextLine(); // Titel einlesen
                    ver.setzeTitel(notiz, notizTitel); // Titel setzen
                    
                    System.out.println("Gib den Inhalt deiner Notiz ein:");
                    notizInhalt = scanner.nextLine(); // Inhalt einlesen
                    ver.setzeInhalt(notiz, notizInhalt); // Inhalt setzen
                    break;
                    
                case 2:
                    // Alle vorhandenen Notizen anzeigen
                    System.out.println("Vorhandene Notizen: ");
                    ver.zeigeVorhandeneNotizen();
                    break;
                    
                case 3:
                    // Notiz löschen anhand eines Index
                    System.out.println("Index der zu löschenden Notiz eingeben: ");
                    try {
                        int temp = scanner.nextInt(); // Index einlesen
                        ver.loescheNotiz(temp); // Notiz löschen
                    } catch (Exception e) {
                        // Fehler bei falscher Eingabe
                        System.out.println("Falsche Eingabe, bitte Wiederholen");
                        scanner.nextLine(); // Puffer leeren
                        continue;
                    }
                    break;
                    
                default:
                    // Falls keine gültige Menüoption gewählt wurde
                    System.out.println("Bitte eine Zahl aus dem Menü eingeben!");
                    break;
            }
        }
        
        scanner.close(); // Scanner schließen (Ressourcen freigeben)
    }
}
