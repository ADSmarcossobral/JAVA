
public class Parlamentar extends Mandato{

    private double representatividade;
    private int totalVotos;
    private double ativismoParlamentar;
    private double custoCampanha;
    private Partido partido;
    private PropostaLegislativa[] propostas;

    public PropostaLegislativa getProposta(int posicao){
        return this.proposta[posicao];
    }

    public Parlamentar(int id, String nomeMandatario, int totalVotos){
        super(id, nomeMandatario);
        this.setTotalVotos(totalVotos);    
    }

    public Partido getPartido(){
        return this.partido;
    }

    public void setPartido(Partido partido){
        this.partido = partido;
    }

    public double getRepresentatividade(){
        return this.representatividade;
    }

    public void setRepresentatividade(double representatividade){
        this.representatividade = representatividade;
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