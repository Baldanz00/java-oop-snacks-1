public class RegistroStudenti {
    private Studente[] studenti;
    private int numeroStudenti; //quanti studenti ci sono
    public RegistroStudenti() {
        studenti = new Studente[10];
        int numeroStudenti= 0;
    }
    public void aggiungiStudente(Studente studente) {
       if (numeroStudenti < studenti.length) {
        studenti[numeroStudenti] = studente;
        numeroStudenti++;
       } else {
        System.out.println("Il registro è pieno");
       }
    }
    public void stampaStudenti() {
        for(int i=o; i<numeroStudenti; i++) {
            System.out.println(studenti[i].getDettagliStudente());
        }
    }
}