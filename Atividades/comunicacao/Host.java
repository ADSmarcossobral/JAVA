
public abstract class Host {

	private String id;
	private double potencia;
	private double posY;
	private double posX;
	
	public Host(String id, double potencia, double posX, double posY) {
		this.setId(id);
		this.setPotencia(potencia);
		this.setPosX(posX);
		this.setPosY(posY);
	}
	
	public abstract void sendMsg();
	public abstract void receiveMsg();
	
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPosY() {
		return posY;
	}
	public void setPosY(double posY) {
		this.posY = posY;
	}
	public double getPosX() {
		return posX;
	}
	public void setPosX(double posX) {
		this.posX = posX;
	}
	
}
