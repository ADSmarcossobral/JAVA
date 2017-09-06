
public class ParlamentarTitular extends Parlamentar{
    
    public ParlamentarTitular(int id, String nomeMandatario, int totalVotos){
        super(id, nomeMandatario, totalVotos);
    }

    public double getRepresentatividade(){
        return getRepresentatividadeAbsoluta() * 1;
    }


}