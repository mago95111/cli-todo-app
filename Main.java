import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Wenn true dann Programm beenden
        boolean shutdown = false;
        Verwaltung ver = new Verwaltung();
        Scanner scanner = new Scanner(System.in);
        String notizInhalt = "";
        int eingabe = -1;
        System.out.println("####### Herzlich Willkommen zur Notizenapp NextNotes #######");
        
        while (true && !shutdown) {
            System.out.println("------------------------------------------------------------------");
            System.out.println("Menü (Gib eine Zahl ein):");
            System.out.println("1: neue Notiz zu erstellen");
            System.out.println("2: alle Notizen anzuzeigen");
            System.out.println("3: eine Notiz zu löschen");
            System.out.println("0: das Programm zu beenden");
            try {
                eingabe = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Falsche Eingabe, bitte Wiederholen");
                scanner.nextLine();
                continue;
            }
            switch (eingabe) {
                case 0:
                    shutdown = true;
                    break;
                case 1:
                    System.out.println("Gib den Inhalt deiner Notiz ein: ");
                    notizInhalt = scanner.nextLine();
                    ver.erstelleNotiz(notizInhalt);
                    break;
                case 2:
                    System.out.println("Vorhandene Notizen: ");
                    ver.zeigeVorhandeneNotizen();
                    break;
                case 3:
                    System.out.println("Index der zu löschenden Notiz eingeben: ");
                    try {
                        int temp = scanner.nextInt();
                        ver.loescheNotiz(temp);
                    } catch (Exception e) {
                        System.out.println("Falsche Eingabe, bitte Wiederholen");
                        scanner.nextLine();
                        continue;
                    }
                    break;
                default:
                    System.out.println("Bitte eine Zahl aus dem Menü eingeben!");
                    break;
            }
        }
        scanner.close();
    }
}
