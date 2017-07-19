
public class NoSensor {
	private String id;
	private double latitude;
	private double longitude;
	private double altura;
	private double temperatura;
	
	public NoSensor(String id, double latitude, double longitude, double altura){
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.altura = altura;
		this.setTemperatura(0);
	}
    
    public NoSensor(){
        this(id, 0, 0, 0);
    }
	
	public String getId(){
		return this.id;
	}
	
	private void setId(String id){
		this.id = id;
	}
	
	public double getLatitude(){
		return this.latitude;
	}
	
	public void setLatitude(double latitude){
		this.latitude = latitude;
	}
	
	public double getLongitude(){
		return this.longitude;
	}
	
	public void setLongitude(double longitude){
		this.longitude = longitude;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public double getTemperatura(){
		return this.temperatura;
	}
	
	public void setTemperatura(double temperatura){
		this.temperatura = temperatura;
	}
	
	public double calculaDistancia(NoSensor outro){
		double distancia;
		distancia = Math.pow(this.getLatitude() - outro.getLatitude(), 2) +
					Math.pow(this.getLongitude() - outro.getLongitude(), 2) +
					Math.pow(this.getAltura() - outro.getAltura(), 2);
		distancia = Math.sqrt(distancia);
		return distancia;
	}
	
	public void mover(double latitude, double longitude, double altura){
		this.setLatitude(latitude);
		this.setLongitude(longitude);
		this.setAltura(altura);
	}
	
	public void mover(){
		this.mover(0,0,0);
	}
	
	public void mover(NoSensor outro){
		this.mover(outro.getLatitude(), outro.getLongitude(), outro.getAltura());
	}
	
	public boolean equals(NoSensor outro){
		return this.getId().equals(outro.getId());
	}
	@Override
	public String toString(){
		return "[" + id + "] " + "(" + this.getLatitude() + "; " +
				this.getLongitude() + "; " + this.getAltura() + ") " + ": " +
				this.getTemperatura();
	}
	
}