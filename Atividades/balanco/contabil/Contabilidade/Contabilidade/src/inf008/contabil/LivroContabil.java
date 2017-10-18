package inf008.contabil;
import inf008.util.ordenacao.Ordenador;

public class LivroContabil{
    private Lancamento[] lancamentos = new Lancamento[0];
    
    public void adicionar(Lancamento lancamento){
       Lancamento[] novo = new Lancamento[this.lancamentos.length + 1];
       for(int i = 0; i < this.lancamentos.length; i++)
         novo[i] = this.lancamentos[i];
       novo[novo.length - 1] = lancamento;
       this.lancamentos = novo;
    }
    
    
    public String toString(){
       Ordenador ordenador = new Ordenador(); 
       ordenador.ordenar(this.lancamentos);
       String rep = "";
       for(Lancamento lancamento : this.lancamentos)
         rep += lancamento + "\n";
       return rep;  
    }    
    
    
}
