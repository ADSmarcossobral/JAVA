
public abstract class HostAtivo extends Host{

    public HostAtivo(String id, double potencia){
        super(id,potencia);
    }


    public abstract void enviarMsg();
    public abstract void receberMsg();


}