
public class Omnidirecional extends Antena{

	public Omnidirecional(String id, double potencia, double posX, double posY) {
		super(id,potencia,posX,posY);
	}
	
	public double distanciaMax() {
		return Math.sqrt(super.getPotencia());
	}
	
}
