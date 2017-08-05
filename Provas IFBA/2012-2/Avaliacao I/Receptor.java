import java.text.DecimalFormat;

public class Receptor{
    
    private double proteina;
    DecimalFormat formata = new DecimalFormat("0.00");
    
    public Receptor(double proteina){
        this(proteina);
    }

    public Receptor(){
        this(0);
    }

    public double getProteina(){
        return this.proteina;
    }

    public void setProteina(double proteina){
        this.proteina = proteina;
    }

    public double afinidade(Receptor r){
        return this.getProteina() - r.getProteina();
    }

    public String toString(){
        return "[" + formata.format(getProteina()) + "]";
    }

}