
public class Molecula{
    private ElementoQuimico[] atomos;

    public Molecula(){
        this.atomos = new ElementoQuimico[0];
    }

    public void addAtomo(ElementoQuimico eq){
        ElementoQuimico[] maior = new ElementoQuimico[this.atomos.length + 1];
        for(int iCont = 0; iCont < this.atomos.length; iCont++)
            maior[iCont] = this.atomos[iCont];
        maior[maior.length - 1] = eq;
        this.atomos = maior;
    }

    public int size(){
        return this.atomos.length;
    }

    public ElementoQuimico getMenorZ(){
        if(this.size() == 0)
            return null;
        ElementoQuimico menor = ElementoQuimico[0];
        for(ElementoQuimico atual : this.atomos){
            if(atual.getNumeroAtomico() < menor.getNumeroAtomico())
                menor = atual;
        } 
        return menor;
    }

    public int getQtdedAtomos(ElementoQuimico outro){
        int qtde = 0;
        for(ElementoQuimico atual : this.atomos)
            if(atual.equals(outro))
                qtde++;
        return qtde;
    }

    public boolean exists(ElementoQuimico outro){
        for(ElementoQuimico atual : this.atomos)
            if(atual.equals(outro))
                return true;
            return false;
    }

}