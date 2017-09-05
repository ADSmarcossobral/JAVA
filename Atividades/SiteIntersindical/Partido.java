
public class Partido extends Mandato{

    private Bancada bancada; 

    public Partido(int id, String nomeMandatario){
        super(id, nomeMandatario);
    }

    public double getAvaliacao(){
        return this.bancada.getMediaRepresentatividade() * this.bancada.getMediaAtivismoLegislativo();
    }




}