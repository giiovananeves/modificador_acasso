public class Contas{

    private int numero;
    private double saldo;

    public void setNumero(int numero){
        this.numero=numero;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

    //acessar com método públicos 

    public double getSaldo(){
        return this.saldo;
    }

    public double getNumero(){
        return this.numero;

    }



}