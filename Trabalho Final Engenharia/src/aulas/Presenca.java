package aulas;

import java.util.Date;
import java.util.List;

public class Presenca {

	private Date data;
	private String presenca;
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getPresenca() {
		return presenca;
	}
	public void setPresenca(String presenca) {
		this.presenca = presenca;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Presenca [data=");
		builder.append(data);
		builder.append(", presenca=");
		builder.append(presenca);
		builder.append("]");
		return builder.toString();
	}
	
	
}
