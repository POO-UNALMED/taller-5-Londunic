package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal {
	private static List<Anfibio> listado= new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre,int edad,String habitat,String genero,String colorPiel,boolean venenoso){
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		listado.add(this);
	}
	public Anfibio(){listado.add(this);}
	
	public void setColorPiel(String colorPiel) {
		this.colorPiel=colorPiel;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso=venenoso;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public static void setListado(List<Anfibio> listad) {
		listado=listad;
	}
	public static List<Anfibio> getListado() {
		return listado;
	}
	
	public String movimiento(){
		return "saltar";
	}
	public static Anfibio crearRana(String nombre,int edad,String genero){
		Anfibio nuevo = new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		ranas++;
		return nuevo;
	}
	public static Anfibio crearSalamandra(String nombre,int edad,String genero){
		Anfibio nuevo = new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
		salamandras++;
		return nuevo;
	}
	public static int cantidadAnfibios() {
		return salamandras+ranas;
	}

}
