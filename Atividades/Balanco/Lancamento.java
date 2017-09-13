public class Lancamento implements Ordenavel, JSonnable{
    private int ordem;
    private String descricao;
    private double valor;
    private Conta credito;
    private Conta debito;  
    
    
    public Lancamento(int ordem, String descricao, Conta credito, Conta debito, double valor){
        this.ordem = ordem;
        this.descricao = descricao;
        this.credito = credito;
        this.debito = debito; 
        this.valor = valor; 
    }   
    
    public int compare(Ordenavel o){
        Lancamento lancamento = (Lancamento)o;
        return lancamento.ordem - this.ordem;
    };    
    
    
    public String toString(){
        return "[" + this.ordem + "] - Descricao " + this.descricao + "\n" +
               "Valor R$" + this.valor + "\n" + 
               "Credito " + this.credito.getNome() + "\n" +
               "Debito " + this.debito.getNome();
    }
    
    
    public CampoJSon[] getCampos(){
        CampoJSon[] campos = new CampoJSon[5];

        campos[0] = new CampoJSon("ordem", this.ordem);
        campos[1] = new CampoJSon("descricao", this.descricao);        
        campos[2] = new CampoJSon("valor", this.valor);
        campos[3] = new CampoJSon("credito", this.credito.getNome());        
        campos[4] = new CampoJSon("debito", this.debito.getNome());         
        
        return campos;
        
        
    }    
    
   
    
}
