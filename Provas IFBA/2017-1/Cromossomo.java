
public class Cromossomo{
    private Gene[] genes;

    public Cromossomo(int totalGenes){
        genes = new Gene[totalGenes];
        for(int gCont = 0; gCont < totalGenes; gCont++)
            this.genes[gCont] = new Gene();
    }

    public Gene buscar(int alelo){
        return this.genes[alelo];
    }

    public Cromossomo clonar(){
        Cromossomo clone = new Cromossomo(this.genes.length);
        for(int gCont = 0; gCont < this.genes.length; gCont++)
            clone.genes[gCont] = this.genes[gCont].clonar();
        return clone;
    }

}