
public class Celular extends HostAtivo{

    private Antena antena;

    public Celular(String id, double potencia){
        super(id,potencia);
    }

    public void enviarMsg(){

    }
    public void receberMsg(){

    }

    public Antena getAntena(){
        return this.antena;
    }

    public void conectarAntena(Antena antena){
        this.antena = antena;
    }

}