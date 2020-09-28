package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal{
	private static List<Ave> listado= new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre,int edad,String habitat,String genero,String colorPlumas){
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		this.colorPlumas=colorPlumas;
		listado.add(this);
	}
	public Ave(){listado.add(this);}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas=colorPlumas;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public static void setListado(List<Ave> listad) {
		listado=listad;
	}
	public static List<Ave> getListado() {
		return listado;
	}
	
	public String movimiento(){
		return "volar";
	}
	public static Ave crearHalcon(String nombre,int edad,String genero){
		Ave nuevo = new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
		halcones++;
		return nuevo;
	}
	public static Ave crearAguila(String nombre,int edad,String genero){
		Ave nuevo = new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
		aguilas++;
		return nuevo;
	}
	public static int cantidadAves() {
		return listado.size();
	}

}
