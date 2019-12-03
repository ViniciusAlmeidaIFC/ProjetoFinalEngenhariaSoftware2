package aulas;

public class Professor {

	private String nome;
	private String materia;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor [nome=");
		builder.append(nome);
		builder.append(", materia=");
		builder.append(materia);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
