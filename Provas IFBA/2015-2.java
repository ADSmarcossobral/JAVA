
public class RelogioDigital{

    private int horas;
    private int minutos;
    private int segundos;

    public RelogioDigital(){
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public RelogioDigital(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public RelogioDigital(RelogioDigital outro){
        this.horas = outro.getHoras();
        this.minutos = outro.getMinutos();
        this.segundos = outro.getSegundos();
    }

    public void incrementa(){
        if(this.getSegundos() == 59){
            this.setSegundos(0);
            if(getMinutos() == 59){
                this.setMinutos(0);
                if(getHoras() == 23){
                    this.setHoras(0);
                } else{
                    this.setHoras(getHoras()+1);
                }
            } else{
                this.setMinutos(getMinutos()+1);
            }
        } else{
            this.setSegundos(getSegundos()+1);
        }
    }

    public void incrementa(int segundos){
        for(int x = 0; x < segundos; x++)
            incrementa();
    }

    public String toString(){
        return getHoras() + ":" + getMinutos() + ":" + getMinutos();
    }

    public String toString2(){
        String aux = "PM";
        int p = 0;
        if(getHoras() > 12)
            op = -12;
        else if(getHoras() < 12)
            aux = "AM";
        return getHoras() - op + ":" + getMinutos() + ":" + getSegundos() + "[" + aux + "]";
    }
    
}