
public class Passivo extends Conta{

    public Passivo(String nome, double saldo){
        super(nome, saldo);
    }

    @override
    public void creditar(double valor){
        super.debitar(valor);
    }

    @override
    public void debitar(double valor){
        super.creditar(valor);
    }

}