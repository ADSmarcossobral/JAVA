
public class BalancoContabil{

    private Conta[] conta;

    public BalancoContabil(){
        conta = new Conta[0];
    }

    public void addConta(Conta conta){
        Conta[] temp = new Conta[this.conta.length + 1];
        for(int iConta = 0; iConta < this.conta.length; iConta++)
            temp[iConta] = this.conta[iConta];
        temp[temp.length - 1] = conta;
        this.conta = temp;
    }

    public Conta getConta(int posicao){
        return this.conta[posicao];
    }

    public void setConta(int posicao, Conta conta){
        this.conta[posicao] = conta;
    }

}