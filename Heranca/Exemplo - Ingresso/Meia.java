
public class Meia extends Ingresso{

    public static final int ESTUDANTE = 0;
    public static final int IDOSO = 1;

    private int tipo;

    public Meia(String cadeira, double preco, int tipo){
        super(cadeira, preco);
        this.tipo = tipo;
    }

    @Override
    public double getPreco(){
        return super.getPreco() / 2;
    }

    public int getTipo(){
        return 
    }

}