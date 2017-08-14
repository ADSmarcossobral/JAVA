
public class Ingresso{

    protected String cadeira;
    protected double preco;

    public Ingresso(String cadeira, double preco){
        this.setCadeira(cadeira);
        this.setPreco(preco);
    }

    public String getCadeira(){
        return this.cadeira;
    }

    public void setCadeira(String cadeira){
        this.cadeira = cadeira;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

}