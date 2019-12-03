package aulas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import persistencia.JSON;
import persistencia.Persistencia;

public class Main {

	public static void main(String[] args) throws IOException {
		JSON json = new JSON();
		Persistencia pers = new Persistencia(json);
		Date data = new Date();
		data.getTime();
		List<Aula> aulas = new ArrayList<Aula>();
		
		Aula aula = new Aula();
		Alunos aluno = new Alunos();
		Professor professor = new Professor();
		Presenca presenca = new Presenca();
		
		professor.setNome("Maria");
		professor.setMateria("Inglês");
		
		presenca.setPresenca("Presente");
		presenca.setData(data);
		aluno.setNome("Vinicius");
		aluno.setPresenca(presenca);
		
		aula.setConteudo("Inglês");
		aula.setSala(1);
		aula.setTurno("Noturno");
		
		List<Alunos> alunos = new ArrayList<Alunos>();
		
		alunos.add(aluno);
		
		aluno = new Alunos();
		presenca = new Presenca();
		presenca.setData(data);
		presenca.setPresenca("Ausente");
		aluno.setNome("Caio");
		aluno.setPresenca(presenca);
		alunos.add(aluno);
		
		aula.setLista(alunos);
		aula.setProfessor(professor);
		
		aula.setDataInicio(data);
		data = new Date();
		data.getTime();
		aula.setDataFim(data);
		
		aulas.add(aula);
		
		System.out.println(aula);
		
		json.gravar(aulas);
		
		
		
	}

}
