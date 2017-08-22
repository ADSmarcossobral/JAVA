
public class Ativo extends Conta{

    public Ativo(String nome, double saldo){
        super(nome, saldo);
    }

    @Override
    public void debitar(double valor){
        super.creditar(valor);
    }

    @Override
    public void creditar(double valor){
        super.debitar(valor);
    }

}