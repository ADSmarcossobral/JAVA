
public class LivroLancamentoContabil{
    
    private LancamentoContabil[] historico;

    public LivroLancamentoContabil(){
        this.historico = new LancamentoContabil[0];
    }

    public void addLancamento(LancamentoContabil lancamento){
        LancamentoContabil[] temp = new LancamentoContabil[this.historico.length + 1];
        for(int iLanc = 0; iLanc < this.historico.length; iLanc++){
            temp[iLanc] = this.setLancamentoContabil(iLanc, temp[iLanc]);
        }
        temp[temp.length - 1] = lancamento;
        this.historico = temp;
    }

    public LancamentoContabil getLancamentoContabil(int posicao){
        return this.historico[posicao];
    }

    public void setLancamentoContabil(int posicao, LancamentoContabil lancamento){
        this.historico[posicao] = lancamento;
    }

}