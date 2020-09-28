package gestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas= new ArrayList<Zona>();
	
	public Zoologico(String nombre,String ubicacion){
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	
	public Zoologico(){}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion=ubicacion;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setZona(List<Zona> zonas) {
		this.zonas=zonas;
	}
	public List<Zona> getZona() {
		return zonas;
	}
	
	public int cantidadTotalAnimales(){
		int aux=0;
		Iterator<Zona> i= zonas.iterator();
		while(i.hasNext()) {
			Zona zona = (Zona)i.next();
			aux+=zona.cantidadAnimales();
		}
		return aux;
	}
	public void agregarZonas(Zona a){
		zonas.add(a);
	}
}
