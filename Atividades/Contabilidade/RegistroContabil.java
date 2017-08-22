
public class RegistroContabil{
    private String nomeEmpresa;
    private String CGC;
    private BalancoContabil balancoContabil;
    private LivroLancamentoContabil livroLancamentoContabil;

    public RegistroContabil(String nomeEmpresa, String CGC, BalancoContabil balancoContabil, LivroLancamentoContabil livroLancamentoContabil){
        this(nomeEmpresa, CGC, balancoContabil, livroLancamentoContabil);
    }

    public String getNomeEmpresa(){
        return this.nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCGC(){
        return this.CGC;
    }

    public void setCGC(String CGC){
        this.CGC = CGC;
    }

    public BalancoContabil getBalancoContabil(){
        return this.balancoContabil;
    }

    public void setBalancoContabil(BalancoContabil balancoContabil){
        this.balancoContabil = balanco;
    }

    public LivroLancamentoContabil getLivroLancamentoContabil(){
        return this.livroLancamentoContabil;
    }

    public void setLivroLancamentoContabil(LivroLancamentoContabil livroLancamentoContabil){
        this.livroLancamentoContabil = livroLancamentoContabil;
    }

}