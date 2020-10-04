/**
 * 
 */
package com.oscar.negocios;
import com.oscar.presentacion.*;

/**
 * @author Usuario
 *
 */
public class Negocios {
	public Integer Persona() {
		String nombre;
		int peso;
		int altura;
		int resultadoIMC;
		
		String cad="";
		if(resultadoIMC()<16.00){
		  cad="Infrapeso: Delgadez Severa";
		}else if(resultadoIMC()<=16.00 || resultadoIMC()<=16.99){
		  cad="Infrapeso: Delgadez moderada";
		}else if(resultadoIMC()<=17.00 ||resultadoIMC()<=18.49){
		  cad="Infrapeso: Delgadez aceptable";
		}else if(resultadoIMC()<=18.50 || resultadoIMC()<=24.99){
		  cad="Peso Normal";
		}else if(resultadoIMC()<=25.00 || resultadoIMC()<=29.99){
		  cad="Sobrepeso";
		}else if(resultadoIMC()<=30.00 || resultadoIMC()<=34.99){
		  cad="Obeso: Tipo I";
		}else if(resultadoIMC()<=35.00 || resultadoIMC()=40.00){
		  cad="Obeso: Tipo III";
		}else{
		  cad="no existe clasificacion";
		}
		  return cad;
		
		
		return null;
		
	}
	
	public void asignar (String nombre,int peso, int altura) {
		String n = nombre;
		int p = peso;
		int a = altura;
	}
	
	public double imc(int peso,int altura) {
		return peso/altura;
	}
	
	
	public Integer comparativa(int resultadoIMC) {
		String cad="";
		if(resultadoIMC()<16.00){
		  cad="Infrapeso: Delgadez Severa";
		}else if(resultadoIMC()<=16.00 || resultadoIMC()<=16.99){
		  cad="Infrapeso: Delgadez moderada";
		}else if(resultadoIMC()<=17.00 ||resultadoIMC()<=18.49){
		  cad="Infrapeso: Delgadez aceptable";
		}else if(resultadoIMC()<=18.50 || resultadoIMC()<=24.99){
		  cad="Peso Normal";
		}else if(resultadoIMC()<=25.00 || resultadoIMC()<=29.99){
		  cad="Sobrepeso";
		}else if(resultadoIMC()<=30.00 || resultadoIMC()<=34.99){
		  cad="Obeso: Tipo I";
		}else if(resultadoIMC()<=35.00 || resultadoIMC()=40.00){
		  cad="Obeso: Tipo III";
		}else{
		  cad="no existe clasificacion";
		}
		  return cad;
	}
}


