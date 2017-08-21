
public class BalancoContabil{

    private Conta[] conta;

    public Conta getConta(int posicao){
        return this.conta[posicao];
    }

    public void setConta(int posicao, Conta conta){
        this.conta[posicao] = conta;
    }

}