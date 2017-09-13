public class CampoJSon{
    private String nome;
    private int tipo;    
    private String valor;
    
    public CampoJSon(String nome, String valor){
        this(nome, valor, JSonnable.STRING);
    } 
    
    public CampoJSon(String nome, boolean valor){
        this(nome, Boolean.toString(valor), JSonnable.BOOLEAN);
    }
    
    public CampoJSon(String nome, int valor){
        this(nome, Integer.toString(valor), JSonnable.INT);
    }  
    
    public CampoJSon(String nome, double valor){
        this(nome, Double.toString(valor), JSonnable.REAL);
    }    
    
    
    private CampoJSon(String nome, String valor, int tipo){
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;    
    }  
    
    public String getNome(){
         return this.nome;
    }    
    
    public int getTipo(){
         return this.tipo;        
    }    

    public String getValor(){
         return this.valor;                
    }    
    
    
}
