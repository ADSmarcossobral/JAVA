
public class CongressoNacional{
    
    private Mandato[] mandatos;

    public CongressoNacional(){
        mandatos = new Mandato[0];
    }

    public Mandato getMandato(int posicao){
        return mandatos[posicao];
    }

    public void setMandato(int posicao, Mandato mandato){
        this.mandatos[posicao] = mandato;
    }


}