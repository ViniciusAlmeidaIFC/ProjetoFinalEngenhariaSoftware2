package persistencia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import aulas.Aula;

public interface Gravacao {

	public boolean gravar(List<Aula> list) throws IOException;
	public List<Aula> ler() throws ParseException, FileNotFoundException;
}
