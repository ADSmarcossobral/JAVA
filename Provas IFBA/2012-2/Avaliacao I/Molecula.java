
public class Molecula{

    private Receptor[] receptores;
    private double threshold;

    public Molecula(int tamanho){
        receptores = new Receptor[tamanho];
        for(Receptor r : this.receptores)
            r = new Receptor();
    }

    public Receptor[] getReceptores(){
        return this.receptores;
    }

    public void setReceptores(Receptor[] receptores){
        this.receptores = receptores;
    }

}