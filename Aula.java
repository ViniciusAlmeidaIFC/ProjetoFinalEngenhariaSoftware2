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
	
	public String getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public List<Alunos> getLista() {
		return lista;
	}
	
	public void setLista(List<Alunos> lista) {
		this.lista = lista;
	}
	
	public Date getDataInicio() {
		return dataInicio;
	}
	
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public Date getDataFim() {
		return dataFim;
	}
	
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public String getTurno() {
		return turno;
	}
	
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public int getSala() {
		return sala;
	}
	
	public void setSala(int sala) {
		this.sala = sala;
	}
	
	
	
	
}
