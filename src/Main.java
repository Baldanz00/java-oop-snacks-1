public class Main {
    public static void main(String[]args) {

        //Snack1 
        Studente s1=new Studente("Giovanni" , "Rossi" , 24);
        System.out.println(s1.getDettagliStudente());

        //Snack2
        ContoBancario conto = new ContoBancario("IT567965754");
        conto.deposito(300);
        conto.prelevo(100);
        System.out.println("Saldo attuale" + conto.getSaldo());

        //Snack3
        RegistroStudenti registro = new RegistroStudenti();
        registro.aggiungiStudente(new Studente("Luca", "Neri", 21));
        registro.stampaStudenti();
    }
}