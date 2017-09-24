
public abstract class Antena extends Host{

	private Celular[] celulares;
	
	public Antena(String id, double potencia, double posX, double posY) {
		super(id,potencia,posX,posY);
		celulares = new Celular[0];
	}
	
	@Override
	public void sendMsg(){
		
	}
	
	@Override
	public void receiveMsg() {
		
	}
	
	public Celular[] getCelulares() {
		return celulares;
	}
	
	public void setCelulares(Celular[] celulares) {
		this.celulares = celulares;
	}
	
	public boolean equals(Antena outra) {
		return this.getId().equals(outra.getId());
	}

	public abstract double distanciaMax();
	
}
