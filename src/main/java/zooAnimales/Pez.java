package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal{
	private static List<Pez> listado= new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre,int edad,String habitat,String genero,String colorEscamas,int cantidadAletas){
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		listado.add(this);
	}
	public Pez(){listado.add(this);}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas=colorEscamas;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas=cantidadAletas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public static void setListado(List<Pez> listad) {
		listado=listad;
	}
	public static List<Pez> getListado() {
		return listado;
	}
	
	public String movimiento(){
		return "nadar";
	}
	public static Pez crearSalmon(String nombre,int edad,String genero){
		Pez nuevo = new Pez(nombre,edad,"oceano",genero,"rojo",6);
		salmones++;
		return nuevo;
	}
	public static Pez crearBacalao(String nombre,int edad,String genero){
		Pez nuevo = new Pez(nombre,edad,"oceano",genero,"gris",6);
		bacalaos++;
		return nuevo;
	}
	public static int cantidadPeces() {
		return listado.size();
	}

}
