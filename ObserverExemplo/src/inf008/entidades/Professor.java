package inf008.entidades;

import java.util.ArrayList;
import java.util.Collection;

import inf008.Ouvinte;

public class Professor {

	private Collection<Ouvinte> ouvintes;

	public Collection<Ouvinte> getOuvintes() {
		return ouvintes;
	}

	public void setOuvintes(Collection<Ouvinte> ouvintes) {
		this.ouvintes = ouvintes;
	}
	
	public Professor(){
		this.ouvintes = new ArrayList<Ouvinte>();
	}
	
	public void addOuvinte(Ouvinte ouvinte){
		this.ouvintes.add(ouvinte);
	}
	
	public void fireMeuEvento(String texto){
		MeuEvento evento = new MeuEvento(texto);
		for(Ouvinte ouvinte : this.ouvintes){
			ouvinte.processeEvento(evento);
		}
	}
	
}
