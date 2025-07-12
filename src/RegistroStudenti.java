import java.util.ArrayList;
public class RegistroStudenti {
    private ArrayList<Studente> studenti;
    public RegistroStudenti() {
        studenti = new ArrayList<>();
    }
    public void aggiungiStudente(Studente studente) {
        studenti.add(studente);
    }
    public void stampaStudenti() {
        for(Studente studente : studenti) {
            System.out.println(studente.getDettagliStudente());
        }
    }
}