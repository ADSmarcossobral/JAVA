
public class PrimeiroLote extends Ingresso{

    public PrimeiroLote(String cadeira, double preco){
        super(cadeira, preco);
    }

    @Override
    public double getPreco(){
        return super.getPreco() * 0.6;
    }

}