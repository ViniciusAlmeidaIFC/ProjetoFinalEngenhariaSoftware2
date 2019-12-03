package aulas;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import persistencia.JSON;
import persistencia.Persistencia;

public class Main2 {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		List<Aula> lista = new ArrayList<Aula>();
		JSON json = new JSON();
		Persistencia pers = new Persistencia(json);
		
		lista = json.ler();
		
		System.out.println(lista);
		
		

	}

}
