
public class BalancoContabil{

    private Conta[] conta;

    public BalancoContabil(int tamanho){
        conta = new Conta[tamanho];
        for(Conta conta : this.conta)
            conta = new Conta();
    }

    public Conta getConta(int posicao){
        return this.conta[posicao];
    }

    public void setConta(int posicao, Conta conta){
        this.conta[posicao] = conta;
    }

}