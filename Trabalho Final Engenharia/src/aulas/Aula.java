package aulas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aula {

	private String conteudo;
	private List<Alunos> lista = new ArrayList<Alunos>();
	private Date dataInicio;
	private Date dataFim;
	private Professor professor;
	private String turno;
	private int sala;
}
