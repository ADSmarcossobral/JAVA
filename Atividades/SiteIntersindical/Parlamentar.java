
public class Parlamentar extends Mandato{

    private int totalVotos;
    private double custoCampanha;
    private Partido partido;
    private PropostaLegislativa[] propostas;

    public Parlamentar(int id, String nomeMandatario, int totalVotos){
        super(id, nomeMandatario);
        this.setTotalVotos(totalVotos); 
        propostas = new PropostaLegislativa[0];  
    }

    public double getAtivismo(){
        return this.getAtivismoLegislativoBruto() * this.partido.getAtivismoSem(this);
    }

    public double getAtivismoLegislativoBruto(){
        double bruto = 0;
         for(PropostaLegislativa proposta : propostas){
             bruto += proposta.getImpactoLegislativo();
         }
        return bruto;
    }

    public double getAvaliacao(){
        return this.getAtivismo() * this.getRepresentatividade();
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

    public double getRepresentatividadeAbsoluta(){
        return this.getCustoCampanha() / this.getTotalVotos();
    }

    public int getTotalVotos(){
        return this.totalVotos;
    }

    public void setTotalVotos(int totalVotos){
        this.totalVotos = totalVotos;
    }

    public double getCustoCampanha(){
        return this.custoCampanha;
    }

    public void setCustoCampanha(double custoCampanha){
        this.custoCampanha = custoCampanha;
    }

}