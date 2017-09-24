
public class Area {

	private Antena[] antenas;
	private Celular[] celulares;
	
	public Area(){
		setAntenas(new Antena[0]);
	}

	public Antena[] getAntenas() {
		return antenas;
	}

	public void setAntenas(Antena[] antenas) {
		this.antenas = antenas;
	}
	
	public double distanciaMaxHost(Omnidirecional omni){
		return 1 / Math.pow(omni.distanciaMax(), 2);
	}
	
	public double distanciaMaxHost(Direcional direcional){
		return 2 / Math.pow(direcional.distanciaMax(), 2);
	}
	
	public Celular buscarCelular(String id) {
		for(Celular celular : this.celulares)
			if(celular.equals(id))
				return celular;
		return null;
	}
	
	public Antena antenaComMaiorPotencia(double x, double y) {
		Antena maior = antenas[0];
		for(Antena antena : this.antenas) {
			if(antena.getPosX() == x && antena.getPosY() == y)
				if(antena.distanciaMax() > maior.distanciaMax())
					maior = antena;
		}
		return maior;
	}

	public Celular[] getCelulares() {
		return celulares;
	}

	public void setCelulares(Celular[] celulares) {
		this.celulares = celulares;
	}
	
}