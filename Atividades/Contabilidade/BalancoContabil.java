
public class BalancoContabil{

    private Conta[] contas;

    public BalancoContabil(){
        conta = new Conta[0];
    }

    public void addConta(Conta conta){
        Conta[] temp = new Conta[this.contas.length + 1];
        for(int iConta = 0; iConta < this.contas.length; iConta++)
            temp[iConta] = this.contas[iConta];
        temp[temp.length - 1] = conta;
        this.contas = temp;
    }

    public Conta buscarContaPeloNome(String nome){
        for(Conta atual : this.contas){
            if(atual.getNome().equals(nome))
                return atual;
        }
    }

    public ajustar(String nomeContaDebito, String nomeContaCredito, double valor){
        this.buscarContaPeloNome(nomeContaDebito).debitar(valor);
        this.buscarContaPeloNome(nomeContaCredito).creditar(valor);
    }

    public Conta getConta(int posicao){
        return this.conta[posicao];
    }

    public void setConta(int posicao, Conta conta){
        this.conta[posicao] = conta;
    }

}