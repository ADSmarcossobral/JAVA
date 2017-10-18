package inf008.application;

import inf008.entidades.Aluno;
import inf008.entidades.Professor;

public class App {

	public void run(){
		Professor professor = new Professor();
		professor.fireMeuEvento("Aula em 5 minutos.");
		Aluno aluno1 = new Aluno("2016116007");
		Aluno aluno2 = new Aluno("2016116008");
		professor.addOuvinte(aluno1);
		professor.addOuvinte(aluno2);
		professor.fireMeuEvento("Aula em 10 minutos");
		Aluno aluno3 = new Aluno("2016116009");
		professor.addOuvinte(aluno3);
		professor.fireMeuEvento("Aula em 20 minutos");
	}
	
	public static void main(String[] args) {
		(new App()).run();
	}

}
