public class DomandaQuiz {
    private String testoDomanda;
    private String rispostaCorretta;
    public DomandaQuiz(String testoDomanda, String rispostaCorretta) {
        this.testoDomanda = testoDomanda;
        this.rispostaCorretta = rispostaCorretta;
    }
    public boolean verificoRisposta(String rispostaUtente) {
        return rispostaCorretta.equalsIgnoreCase(rispostaUtente.trim());

    }

    public void stampaRisultato(String rispostaUtente) {
        if(verificoRisposta(rispostaUtente)) {
            System.out.println("Risposta corretta");
        } else {
            System.out.println("Risposta sbagliata");
        }
    }
    public String getTestoDomanda() {
        return testoDomanda;
    }
}