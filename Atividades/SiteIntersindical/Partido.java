
public class Partido extends Mandato{

    private Parlamentar[] parlamentares;

    public Partido(int id, String nomeMandatario){
        super(id, nomeMandatario);
    }

        public Parlamentar getParlamentar(int posicao){
        return this.parlamentares[posicao];
    }

    public void setParlamentar(int posicao, Parlamentar parlamentar){
        this.parlamentares[posicao] = parlamentar;
    }

    public double getMediaRepresentatividade(){
        double total = 0;
        for(Parlamentar parlamentar : this.parlamentares){
            total += parlamentar.getRepresentatividadeAbsoluta();
        }
        return total / this.parlamentares.length;
    }

    public double getMediaAtivismo(){
        double total = 0;
        for(Parlamentar parlamentar : this.parlamentares){
            total += parlamentar.getAtivismo();
        }
        return total / this.parlamentares.length;
    }

    public double getAvaliacao(){
        return this.getMediaRepresentatividade() * this.getMediaAtivismo();
    }

    public double getAtivismoSem(Parlamentar p){
        double ativismoTotal = 0;
        for(Parlamentar parlamentar : this.parlamentares)
            if(!parlamentar.equals(p))
                ativismoTotal += parlamentar.getAtivismo();
        return ativismoTotal;
        
    }

    public double getAtivismo(){
        double ativismoTotal = 0;
        for(Parlamentar parlamentar : this.parlamentares)
            ativismoTotal += parlamentar.getAtivismo();
        return ativismoTotal;
    }
    
}