package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal {
	private static List<Reptil> listado= new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre,int edad,String habitat,String genero,String colorEscamas,int largoCola){
		setNombre(nombre);
		setEdad(edad);
		setHabitat(habitat);
		setGenero(genero);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		listado.add(this);
	}
	public Reptil(){listado.add(this);}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas=colorEscamas;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola=largoCola;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public static void setListado(List<Reptil> listad) {
		listado=listad;
	}
	public static List<Reptil> getListado() {
		return listado;
	}
	
	public String movimiento(){
		return "reptar";
	}
	public static Reptil crearIguana(String nombre,int edad,String genero){
		Reptil nuevo = new Reptil(nombre,edad,"humedal",genero,"verde",3);
		iguanas++;
		return nuevo;
	}
	public static Reptil crearSerpiente(String nombre,int edad,String genero){
		Reptil nuevo = new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		serpientes++;
		return nuevo;
	}
	public static int cantidadReptiles() {
		return listado.size();
	}

}
