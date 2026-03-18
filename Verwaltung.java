import java.util.ArrayList;

public class Verwaltung {
    
    private ArrayList<Notes> notizen;
    
    public Verwaltung(){
       notizen = new ArrayList<>();
    }

    public boolean erstelleNotiz(String inhalt){
        Notes notiz= new Notes();
        notiz.speichereInhalt(inhalt);
        return notizen.add(notiz);
    }

    public void zeigeVorhandeneNotizen(){
        for(Notes n : notizen){
            System.out.println(n.gibInhalt());
        }
    }

    /**
     * löscht den ersten inhalt in der liste
     * 
     */
    public void loescheNotiz(int index){
        if(index >= notizen.size()){
            throw new IllegalArgumentException("Index ist außerhalb der Listenlänge");
        }
        notizen.remove(index);
    }
}
