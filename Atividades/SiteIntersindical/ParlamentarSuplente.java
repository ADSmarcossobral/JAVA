
public class ParlamentarSuplente extends Parlamentar{

    public ParlamentarSuplente(int id, String nomeMandatario, int totalVotos){
        super(id,nomeMandatario,totalVotos);
    }

    public double getRepresentatividade(){
        return getRepresentatividadeAbsoluta() * 0.5;
    }

}