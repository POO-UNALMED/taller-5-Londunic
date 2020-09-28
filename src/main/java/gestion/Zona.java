package gestion;
import zooAnimales.*;
import java.util.*;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private static List<Animal> animales= new ArrayList<Animal>();
	
	public Zona(String nombre,Zoologico zoo){
		this.nombre = nombre;
		this.zoo=zoo;
	}
	
	public Zona(){}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo=zoo;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public static void setAnimales(List<Animal> animale) {
		animales=animale;
	}
	public static List<Animal> getAnimales() {
		return animales;
	}
	
	public void agregarAnimales(Animal a){
		animales.add(a);
	}
	
	public static int cantidadAnimales() {
		return Animal.getTotalAnimales();
	} 
}
