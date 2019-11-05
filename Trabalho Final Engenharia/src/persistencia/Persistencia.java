package persistencia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Persistencia {

private Gravacao g;
	
	public Persistencia(Gravacao g) {
		this.g = g;
	}
	
	public boolean gravar(double[] list) throws IOException {
		return g.gravar(list);
		
	}
	public double[] ler() throws ParseException, FileNotFoundException{
		return g.ler();
	}
}
