
public class ParlamentarSuplente extends Parlamentar{

    public ParlamentarSuplente(int id, String nomeMandatario, int totalVotos){
        super(id,nomeMandatario,totalVotos);
    }
    @Override
    public double getRepresentatividade(){
        return super.getRepresentatividade() * 0.5;
    }

}