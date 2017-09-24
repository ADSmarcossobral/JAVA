
public class SistemaHangout {

	private Area area;
	
	public void	moverCelular(String id, double x, double y) {
		Antena novaAntena = area.antenaComMaiorPotencia(x, y);
		Celular celular;
		celular = area.buscarCelular(id);
		if(!novaAntena.equals(celular.getAntena())) {
			celular.desassociarAntena();
			celular.associarAntena(novaAntena);
			celular.setPosX(x);
			celular.setPosY(y);
		}
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	
}
