package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal {
	private static List<Mamifero> listado= new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre,int edad,String habitat,String genero,boolean pelaje,int patas){
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		this.pelaje=pelaje;
		this.patas=patas;
		listado.add(this);
	}
	public Mamifero() {
		listado.add(this);
	}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje=pelaje;
	}
	public boolean getPelaje() {
		return pelaje;
	}
	public void setPatas(int patas) {
		this.patas=patas;
	}
	public int getPatas() {
		return patas;
	}
	public static void setListado(List<Mamifero> x) {
		listado=x;
	}
	public static List<Mamifero> getListado() {
		return listado;
	}
	
	public static Mamifero crearCaballo(String nombre,int edad,String genero){
		Mamifero nuevo = new Mamifero(nombre,edad,"pradera",genero,true,4);
		caballos++;
		return nuevo;
	}
	public static Mamifero crearLeon(String nombre,int edad,String genero){
		Mamifero nuevo = new Mamifero(nombre,edad,"selva",genero,true,4);
		leones++;
		return nuevo;
	}
	public static int cantidadMamiferos() {
		return listado.size();
	}

}
