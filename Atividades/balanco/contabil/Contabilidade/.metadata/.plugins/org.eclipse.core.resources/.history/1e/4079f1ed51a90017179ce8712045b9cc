package inf008.contabil;

import inf008.persistencia.ContaDAO;

public class RegistroContabil{
    private String nomeEmpresa;
    private String cnpjEmpresa;
    private ContaDAO balanco;
    private LivroContabil livro;    
    

    public RegistroContabil(String nomeEmpresa, String cnpjEmpresa){
        this.setNomeEmpresa(nomeEmpresa);
        this.setCNPJEmpresa(cnpjEmpresa);
        this.balanco = new ContaDAO();
        this.livro = new LivroContabil();
    }    
    
    public void setNomeEmpresa(String nomeEmpresa){
         this.nomeEmpresa =  nomeEmpresa;
    }    
    
    public void setCNPJEmpresa(String cnpjEmpresa){
        this.cnpjEmpresa =  cnpjEmpresa;
    }
    
    public String getNomeEmpresa(){
         return this.nomeEmpresa;
    } 
    
    public String getCNPJEmpresa(){
         return this.cnpjEmpresa;
    }     
    
    public void registrarFatoContabil(int id, String descricao,
                                      String nomeContaCredito,
                                      String nomeContaDebito,
                                      double valor){
                                          
                                          
      Conta credito = this.balanco.findByName(nomeContaCredito);                                      
      Conta debito = this.balanco.findByName(nomeContaDebito);
      Lancamento lancamento = new Lancamento(id, descricao, credito, debito, valor);
      this.livro.adicionar(lancamento);
      this.balanco.ajustar(nomeContaCredito, nomeContaDebito, valor);
                                          
    } 
    
    public void addConta(Conta conta) throws Exception{
         this.balanco.save(conta);
    }    
    
    public String toString(){
        return       "**** Registro Contabil ****\n" +
                     "* Empresa " + this.getNomeEmpresa() + "\n" + 
                     "* CNPJ " + this.getCNPJEmpresa() + "\n" + 
                     "**** Balanco           ****\n" +
                     this.balanco + "\n" + 
                     "**** Livro            ****\n" +
                     this.livro + "\n" + 
                     "**************************\n";
                     
    }    
}
