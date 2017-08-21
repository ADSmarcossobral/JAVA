
public class LancamentoContabil{

    private String descricao;
    private double valor;
    private Conta credito;
    private Conta debito;

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public double getValor(){
        return this.double;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public Conta getCredito(){
        return this.credito;
    }
    
    public void setCredito(Conta credito){
        this.credito = credito;
    }

    public Conta getDebito(){
        return this.debito;
    }

    public void setDebito(Conta debito){
        this.debito = debito;
    }

}