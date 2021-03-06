
public class RelogioDigital{

    private int horas;
    private int minutos;
    private int segundos;

    public RelogioDigital(){
        this(0, 0, 0);
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

    public int compara(RelogioDigital outro){
        if(this.getHoras() > outro.getHoras()){
            return 1;
        } else if(this.getHoras() < outro.getHoras()){
            return -1;
        } else{
            if(this.getMinutos() > outro.getMinutos()){
                return 1;
            } else if(this.getMinutos() < outro.getMinutos()){
                return -1;
            } else{
                if(this.getSegundos() > outro.getSegundos()){
                    return 1;
                } else if(this.getSegundos() < outro.getSegundos()){
                    return -1;
                } else{
                    return 0;
                }
            }
        }
    }

    public int getHoras(){
        return this.horas;
    }

    public void setHoras(int horas){
        this.horas = horas;
    }

    public int getMinutos(){
        return this.minutos;
    }

    public void setMinutos(int minutos){
        this.minutos = minutos;
    }

    public int getSegundos(){
        return this.segundos;
    }

    public void setSegundos(int segundos){
        this.segundos = segundos;
    }

}