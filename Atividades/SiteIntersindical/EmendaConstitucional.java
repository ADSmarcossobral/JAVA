
public class EmendaConstitucional extends PropostaLegislativa{
    public EmendaConstitucional(int defesaDH, int defesaDT, int defesaIR){
        super(defesaDH, defesaDT, defesaIR);
    }
    public double getImpactoLegislativo(){
        double maior;
        maior = getMaiorNota();
        return ((this.getDefesaDH() + this.getDefesaDT() + this.getDefesaIR()) * 2) / maior;
    }
}