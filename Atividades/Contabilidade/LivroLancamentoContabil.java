
public class LivroLancamentoContabil{
    
    private LancamentoContabil[] historico;

    public LancamentoContabil getLancamentoContabil(int posicao){
        return this.historico[posicao];
    }

    public void setLancamentoContabil(int posicao, LancamentoContabil lancamento){
        this.historico[posicao] = lancamento;
    }

}