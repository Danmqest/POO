public class Conta {

    private final int NUMERO;
    private double saldo;
    private double juros;

    public Conta(int numero){
        this.NUMERO = numero;
    }

    public int getNumero() {
        return NUMERO;
    }
   
    // public void setNumero(int numero) {
    //    this.numero = numero;
    //} Não e feito pos não a a necessicade de ser alteraro;
    
    public double getSaldo() {
        return saldo;
    }

    public double getJuros() {
        return juros;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setJuros(double juros) {
    this.juros = juros;
}
    
    
}
