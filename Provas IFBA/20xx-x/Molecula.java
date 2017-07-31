
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

}