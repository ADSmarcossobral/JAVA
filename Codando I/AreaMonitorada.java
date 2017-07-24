
public class AreaMonitorada{

    private NoSensor[] sensores;

    public double amplitudeTermica(){
        double maior = 0.0, menor = 0.0;
        if(this.sensores.length > 0){
            maior = sensores[0].getTemperatura();
            menor = sensores[0].getTemperatura();
            for(NoSensor sensor : this.sensores){
                if(this.sensores.getTemperatura() > maior)
                    maior = this.sensores.getTemperatura();
                if(this.sensores.getTemperatura() < menor)
                    menor = this.sensores.getTemperatura();
            }
        }
        return maior - menor;
    }

    public double amplitudeTermica(double altitude){
        double maior = 0.0, menor = 0.0;
        if(this.sensores.length > 0){
            maior = sensores[0].getTemperatura();
            menor = sensores[0].getTemperatura();
            for(NoSensor sensor : this.sensores){
                if(this.sensores.getTemperatura() > maior && this.sensores.getAltitude < altitude)
                    maior = this.sensores.getTemperatura();
                if(this.sensores.getTemperatura() < menor && this.sensores.getAltitude < altitude)
                    menor = this.sensores.getTemperatura();
            }
        }
        return maior - menor;
    }

}