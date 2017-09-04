
public class Parlamentar{

    private double representatividade;
    private int votos;
    private double ativismoParlamentar;
    private double custoCampanha;

    public Parlamentar(int votos){
        this.setVotos(votos);    
    }

    public double getRepresentatividade(){
        return this.representatividade;
    }

    public void setRepresentatividade(double representatividade){
        this.representatividade = representatividade;
    }

    public int getVotos(){
        return this.votos;
    }

    public void setVotos(int votos){
        this.votos = votos;
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