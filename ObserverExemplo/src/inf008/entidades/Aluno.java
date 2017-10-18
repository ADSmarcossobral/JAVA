package inf008.entidades;

import inf008.Ouvinte;

public class Aluno implements Ouvinte {

		private String mat;
		
		public Aluno(String mat){
			this.setMat(mat);
		}

		public String getMat() {
			return mat;
		}

		public void setMat(String mat) {
			this.mat = mat;
		}

		@Override
		public void processeEvento(MeuEvento evento) {
			System.out.println(evento.getTexto());
		}
		
}
