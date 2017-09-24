
public class Direcional extends Antena{
	
	private int quadrante;
	
	public Direcional(String id, double potencia, double posX, double posY) {
		super(id,potencia,posX,posY);
	}
	
	public double distanciaMax() {
		return 2 * Math.sqrt(super.getPotencia());
	}

	public int getQuadrante() {
		return quadrante;
	}

	public void setQuadrante(int quadrante) {
		this.quadrante = quadrante;
	}
	
}
