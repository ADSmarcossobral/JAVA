
public abstract class PropostaLegislativa{

    private double defesaDH;
    private double defesaDT;
    private double defesaIR;

    public PropostaLegislativa(double defesaDH, double defesaDT, double defesaIR){
        this.setDefesaDH(defesaDH);
        this.setDefesaDT(defesaDT);
        this.setDefesaIR(defesaIR);
    }

    public abstract double getImpactoLegislativo();

    public double getMaiorNota(){
        double maior;
        if(this.defesaDH > this.defesaDT && this.defesaDH > this.defesaIR)
            maior = this.defesaDH;
        else if(this.defesaDT > this.defesaDH && this.defesaDT > this.defesaIR)
            maior = defesaDT;
        else
            maior = this.defesaIR;
        return maior;
    }

    public double getDefesaDH(){
        return this.defesaDH;
    }

    public void setDefesaDH(double defesaDH){
        this.defesaDH = defesaDH;
    }

    public double getDefesaDT(){
        return this.defesaDT;
    }

    public void setDefesaDT(double defesaDT){
        this.defesaDT = defesaDT;
    }

    public double getDefesaIR(){
        return this.defesaIR;
    }

    public void setDefesaIR(double defesaIR){
        this.defesaIR = defesaIR;
    }


}