
public class Celular extends Host{

	private Antena antena;
	
	public Celular(String id, double potencia, double posX, double posY) {
		super(id,potencia,posX,posY);		
	}

	public Antena getAntena() {
		return antena;
	}

	public void setAntena(Antena antena) {
		this.antena = antena;
	}
	
	public void associarAntena(Antena antena) {
		this.setAntena(antena);
	}
	
	public void desassociarAntena(){
		this.setAntena(null);
	}

	public boolean equals(String outro) {
		return this.getId().equals(outro);
	}
	
	@Override
	public void sendMsg() {
		
	}

	@Override
	public void receiveMsg() {
		
	}
	
}