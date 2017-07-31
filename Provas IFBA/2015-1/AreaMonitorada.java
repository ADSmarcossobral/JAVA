
public class AreaMonitorade{
    private NoSensor[] sensores;
    
    public double amplitudeTermica(){
        double maior = 0.0, menor = 0.0;
        if(this.sensores.length > 0){
            maior = this.sensores[0].getTemperatura();
            menor = this.sensores[0].getTemperatura();
            for(NoSensor sensor : this.sensores){
                if(sensor.getTemperatura() > maior){
                    maior = sensor.getTemperatura();
                }
                if(sensor.getTemperatura() < menor){
                    menor = sensor.getTemperatura();
                }
            }
        }
        return maior - menor;
    }

    public double amplitudeTermica(double altura){
        double maior = 0.0, menor = 0.0;
        if(this.sensores.length > 0){
            for(NoSensor sensor : this.sensores){
                if(sensor.getAltura() < altura){
                    maior = sensor.getTemperatura();
                    menor = sensor.getTemperatura();
                    break;
                }
            }
            for(NoSensor sensor : this.sensores){
                if(sensor.getTemperatura() > maior && sensor.getAltura() < altura)
                    maior = sensor.getTemperatura();
                if(sensor.getTemperatura() < menor && sensor.getAltura() < altura)
                    menor = sensor.getTemperatura();
            }
        }
        return maior - menor;
    }

    public double ampTermMaiorDist(){
        double ampTerm = 0.0;
        double maior = 0.0;
        if(this.sensores.length > 0){
            maior = this.sensores[0].distancia(this.sensores[1]);
            for(int x = 0; x < this.sensores.length; x++){
                for(int y = 0; y < this.sensores.length; y++){
                    if(this.sensores[x].distancia(this.sensores[y]) > maior){
                        maior = this.sensores[x].distancia(this.sensores[y]);
                        if(this.sensores[x].getTemperatura() > this.sensores[y].getTemperatura)
                            ampTerm = sensores[x].getTemperatura() - sensores[y].getTemperatura();
                        else
                            ampTerm = sensores[y].getTemperatura() - sensores[x].getTemperatura();
                    }
                }
            }
        }
        return ampTerm;
    }

}