/**
 * 
 */
package com.oscar.presentacion;

import java.util.Scanner;
import com.oscar.negocios.*;

/**
 * @author Usuario
 *
 */
public class Presentacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Inserte el nombre deseado: ");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.next();
		System.out.println("El indice de masa corporal de " + nombre + " es de: " + new Negocios().Persona() );

	}

}
