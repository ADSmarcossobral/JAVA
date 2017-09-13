public class Ativo extends Conta{
   
    public Ativo(int id, String nome, double saldo, boolean emUso){
        super(id, nome, saldo, emUso);
    }    
    
    public Ativo(int id, String nome){
        this(id, nome, 0, true);
    }  
    
    public Ativo(int id, String nome, boolean emUso){
        this(id, nome, 0, emUso);
    }     
    
    public void debitar(double valor){
        this.saldo += valor;
    }    

    public void creditar(double valor){
        this.saldo -= valor;        
    }
    
    public String getTipo(){
        return "A";
    }        
    
}    