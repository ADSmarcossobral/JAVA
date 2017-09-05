
public class Parlamentar extends Mandato{

    private int totalVotos;
    private double ativismoParlamentar;
    private double custoCampanha;
    private Partido partido;
    private PropostaLegislativa[] propostas;

    public Parlamentar(int id, String nomeMandatario, int totalVotos){
        super(id, nomeMandatario);
        this.setTotalVotos(totalVotos); 
        propostas = new PropostaLegislativa[0];  
    }
    public double getAvaliacao(){
        return getAtivismoLegislativo() * getRepresentatividade();
    }

    public PropostaLegislativa getProposta(int posicao){
        return this.propostas[posicao];
    }

    public void setProposta(int posicao, PropostaLegislativa proposta){
        this.propostas[posicao] = proposta;
    }
    
    public Partido getPartido(){
        return this.partido;
    }

    public void setPartido(Partido partido){
        this.partido = partido;
    }

    public double getRepresentatividade(){
        return this.getTotalVotos() / this.getCustoCampanha();
    }

    public int getTotalVotos(){
        return this.totalVotos;
    }

    public void setTotalVotos(int totalVotos){
        this.totalVotos = totalVotos;
    }

    public double getAtivismoLegislativo(){
        return this.ativismoParlamentar;
    }

    public void setAtivismoLegislativo(double ativismoParlamentar){
        this.ativismoParlamentar = ativismoParlamentar;
    }

    public double getCustoCampanha(){
        return this.custoCampanha;
    }

    public void setCustoCampanha(double custoCampanha){
        this.custoCampanha = custoCampanha;
    }


}