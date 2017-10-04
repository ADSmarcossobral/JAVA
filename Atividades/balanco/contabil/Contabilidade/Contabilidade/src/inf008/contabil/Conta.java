package inf008.contabil;
import inf008.util.json.CampoJSon;
import inf008.util.json.JSonnable;
import inf008.util.ordenacao.Ordenavel;

public abstract class Conta implements Ordenavel, JSonnable{
    private int id;
    private String nome;
    protected double saldo; 
    private boolean emUso;     
    
    public Conta(int id, String nome, double saldo, boolean emUso){
        this.id = id;
        this.setNome(nome);
        this.setSaldo(saldo);    
        this.emUso = emUso;
    }    
    
    public Conta(int id, String nome, double saldo){
        this(id, nome, saldo, true);
    }    
    
    
    public Conta(int id, String nome, boolean emUso){
        this(id, nome, 0, emUso);
    } 
    
    public Conta(int id, String nome){
        this(id, nome, 0);
    } 
    
    
    public void setNome(String nome){
        this.nome = nome;
    }    
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }    
    
    public String getNome(){
        return this.nome;
    } 
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public int getId(){
    	return this.id;
    }
    
    public void setID(int id){
    	this.id = id;
    }
    
    public boolean isEmUso(){
    	return emUso;
    }
    
    public void setEmUso(boolean emUso){
    	
    }
    
    public abstract void debitar(double valor);

    public abstract void creditar(double valor);
    
    public abstract String getTipo(); 
    
    
    public String toString(){
        return "[" + this.getTipo() + "-" + this.id + "]" + this.getNome() + "....... R$" + this.getSaldo();
    }  
    
    public int compare(Ordenavel o){
        Conta outra = (Conta) o;
        return this.id - outra.id;
    }  
    
    public CampoJSon[] getCampos(){
        CampoJSon[] campos = new CampoJSon[5];

        campos[0] = new CampoJSon("id", this.id);
        campos[1] = new CampoJSon("tipo", this.getTipo());        
        campos[2] = new CampoJSon("nome", this.nome);
        campos[3] = new CampoJSon("saldo", this.saldo);        
        campos[4] = new CampoJSon("emUso", this.emUso);

        return campos;
    }     
    
}
