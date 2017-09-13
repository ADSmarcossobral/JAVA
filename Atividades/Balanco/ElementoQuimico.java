public class ElementoQuimico implements JSonnable{
    
    private int numeroAtomico;
    private int numeroMassa;
    private String nome;
    
    public ElementoQuimico(int numeroAtomico,
                           int numeroMassa,
                           String nome){
      this.setNumeroAtomico(numeroAtomico);                         
      this.setNumeroMassa(numeroMassa);   
      this.setNome(nome);
    }  
    
    public void setNumeroAtomico(int numeroAtomico){
        this.numeroAtomico = numeroAtomico;                                 
    }
    
    public void setNumeroMassa(int numeroMassa){
        this.numeroMassa = numeroMassa;                                 
    }
    
    public void setNome(String nome){
        this.nome = nome;                                 
    }    
    
    public int getNumeroAtomico(){
        return this.numeroAtomico; 
    }    
    
    public boolean equals(ElementoQuimico eq){
        return this.getNumeroAtomico() == eq.getNumeroAtomico();
    }    
    
   public String getNome(){
        return this.nome;  
    }      
    
    public String toString(){
        return "[" + this.getNumeroAtomico() + "] - " + this.getNome();
    }  
    
    
    public CampoJSon[] getCampos(){
        CampoJSon[] campos = new CampoJSon[3];

        campos[0] = new CampoJSon("numeroAtomico", this.getNumeroAtomico());
        campos[1] = new CampoJSon("numeroMassa", this.numeroMassa);        
        campos[2] = new CampoJSon("nome", this.getNome());

        return campos;
    }        
    
}
