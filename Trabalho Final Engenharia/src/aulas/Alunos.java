package aulas;

public class Alunos {

	private String nome;
	private Presenca presenca;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Presenca getPresenca() {
		return presenca;
	}
	public void setPresenca(Presenca presenca) {
		this.presenca = presenca;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Alunos [nome=");
		builder.append(nome);
		builder.append(", presenca=");
		builder.append(presenca);
		builder.append("]");
		return builder.toString();
	}	
	
	
}
