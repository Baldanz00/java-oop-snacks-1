public class ContoBancario {
    private String numConto;
    private double saldo;
    public ContoBancario (String numConto) {
        this.numConto=numConto;
        this.saldo=0.0;
    }
    public void deposito(double importo) {
        if(importo>0) {
            saldo += importo;
        }
    }
    public void prelevo(double importo) {
        if(importo>0 && importo <=saldo) {
            saldo -= importo;
        }
    }
    public double getSaldo() {
        return saldo;
    }
}
