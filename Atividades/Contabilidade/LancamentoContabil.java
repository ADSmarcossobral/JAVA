
public class LancamentoContabil{

    private String descricao;
    private double valor;
    private Conta credito;
    private Conta debito;

    public LancamentoContabil(String descricao, double valor, Conta credito, Conta debito){
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setContaCredito(credito);
        this.setContaDebito(debito);
    }

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

    public Conta getContaCredito(){
        return this.credito;
    }
    
    public void setContaCredito(Conta credito){
        this.credito = credito;
    }

    public Conta getContaDebito(){
        return this.debito;
    }

    public void setContaDebito(Conta debito){
        this.debito = debito;
    }

}