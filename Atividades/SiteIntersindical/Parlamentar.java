
public class Parlamentar extends Mandato{

    private double representatividade;
    private int totalVotos;
    private double ativismoParlamentar;
    private double custoCampanha;

    public Parlamentar(int id, String nomeMandatario, int votos){
        super(id, nomeMandatario);
        this.setVotos(votos);    
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

    public void setVotos(int totalVotos){
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