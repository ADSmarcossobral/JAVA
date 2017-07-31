
public class Molecula{

    private Receptor[] recptores;
    private double ihreshold;

    public Molecula(int n){
        recptores = new Receptor[n];
        for(Receptor r : this.recptores)
            r = new Receptor();
    }

    public Receptor[] getReceptores(){
        return this.recptores;
    }

    public void setReceptores(Receptor[] recptores){
        this.recptores = recptores;
    }


}