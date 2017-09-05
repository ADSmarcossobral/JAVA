
public class Bancada{

    private Parlamentar[] parlamentares;

    public Parlamentar getParlamentar(int posicao){
        return this.parlamentares[posicao];
    }

    public void setParlamentar(int posicao, Parlamentar parlamentar){
        this.parlamentares[posicao] = parlamentar;
    }

    public double getMediaRepresentatividade(){
        double total = 0;
        for(Parlamentar parlamentar : this.parlamentares){
            total += parlamentar.getRepresentatividade();
        }
        return total / 2;
    }

    public double getMediaAtivismoLegislativo(){
        double total = 0;
        for(Parlamentar parlamentar : this.parlamentares){
            total += parlamentar.getAtivismoLegislativo();
        }
        return total / 2;
    }
}