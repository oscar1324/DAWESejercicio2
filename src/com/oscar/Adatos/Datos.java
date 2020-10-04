/**
 * 
 */
package com.oscar.Adatos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.oscar.negocios.*;
import com.oscar.presentacion.*;

/**
 * @author Usuario
 *
 */
public class Datos {
	
	public List<String> Losdatos() throws IOException {
		// objeto file
		File file = new File("ruta");
		// FileReader leyendo los archivos
		// BufferedReader, almacena los documentos leidos
		BufferedReader BR = new BufferedReader(new FileReader(file));
		List<String> lecturas = new ArrayList(); // matriz dinámica donde se agregan o eliminan elementos
		// linea
		String linea; //con lo que se lee
		while((linea = BR.readLine()) != null) { // con el readLine vamos leyendo los elementos del BuferedReader
			// se hace ciclo, hasta que bufferedReader deja de tener documentos almacenados, null = null se sale
			if(linea.contains(nombre)) {
				String nombre;
				int peso;
				int altura;
			}
			
		}
		return BR;
	}
	
	public String recuperaPersona(String linea) {
		String[] Arpersona = linea.split("  -  ");
		return Arpersona[0];
	}


}
