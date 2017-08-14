
public class Meia extends Ingresso{

    public Meia(String cadeira, double preco){
        super(cadeira, preco);
    }

    @Override
    public double getPreco(){
        return this.preco / 2;
    }

}