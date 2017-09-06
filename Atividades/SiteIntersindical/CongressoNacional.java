
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

    public Mandato buscaMandato(String nomeMandatario){
        for(Mandato atual : mandatos)
            if(atual.getNomeMandatario().equals(nomeMandatario);
                return atual;
        return null;
    }

    public double getAvaliacao(String nomeMandatario){
        return this.buscaMandato(nomeMandatario).getAvaliacao();
    }


}