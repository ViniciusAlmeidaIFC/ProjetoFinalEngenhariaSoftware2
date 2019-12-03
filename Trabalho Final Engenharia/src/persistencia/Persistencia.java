package persistencia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import aulas.Aula;

public class Persistencia {

private Gravacao g;
	
	public Persistencia(Gravacao g) {
		this.g = g;
	}
	
	public boolean gravar(List<Aula> list) throws IOException {
		return g.gravar(list);
		
	}
	public List<Aula> ler() throws ParseException, FileNotFoundException{
		return g.ler();
	}
}
