
public class Host{

    private String id;
    private double potencia;

    public Host(String id, double potencia){
        this.setId(id);
        this.setPotencia(potencia);
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public double getPotencia(){
        return this.potencia;
    }

    public void setPotencia(double potencia){
        this.potencia = potencia;
    }

}