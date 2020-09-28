package zooAnimales;
import java.util.ArrayList;
import java.util.List;

import gestion.*;

public class Animal {
	private static int totalAnimales=Mamifero.cantidadMamiferos()+Ave.cantidadAves()+Reptil.cantidadReptiles()+Pez.cantidadPeces()+Anfibio.cantidadAnfibios();
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal(String nombre,int edad,String habitat,String genero){
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
	}
	public Animal(){}
	
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	public static void setTotalAnimales(int x) {
		totalAnimales=x;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public int getEdad() {
		return edad;
	}
	public void setHabitat(String habitat) {
		this.habitat=habitat;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setGenero(String genero) {
		this.genero=genero;
	}
	public String getGenero() {
		return genero;
	}
	public void setZona(Zona zona) {
		this.zona=zona;
	}
	public Zona getZona() {
		return zona;
	}
	
	public void totalPorTipo() {
		System.out.print("Mamiferos: "+ Mamifero.cantidadMamiferos());
		System.out.print("Aves: "+Ave.cantidadAves());
		System.out.print("Reptiles: "+Reptil.cantidadReptiles());
		System.out.print("Peces: "+Pez.cantidadPeces());
		System.out.print("Anfibios: "+Anfibio.cantidadAnfibios());
	}
	
	public String toString() {
		if (zona==null){
			return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+
			genero;
		}else {
			return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+
			genero+", la zona en la que me ubico es "+zona+" en el "+zona.getZoo().getNombre();
		}
	}
	public String movimiento(){
		return "desplazarse";
	}
}

class Mamifero extends Animal{
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
	
	public static Mamifero crearCaballo(String nombre,int edad,String habitat,String genero,boolean pelaje,int patas){
		Mamifero nuevo = new Mamifero(nombre,edad,"pradera",genero,true,4);
		caballos++;
		return nuevo;
	}
	public static Mamifero crearLeon(String nombre,int edad,String habitat,String genero,boolean pelaje,int patas){
		Mamifero nuevo = new Mamifero(nombre,edad,"selva",genero,true,4);
		leones++;
		return nuevo;
	}
	public static int cantidadMamiferos() {
		return listado.size();
	}
}

class Ave extends Animal{
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
		Ave nuevo = new Ave(nombre,edad,"montañas",genero,"cafe glorioso");
		halcones++;
		return nuevo;
	}
	public static Ave crearAguila(String nombre,int edad,String genero){
		Ave nuevo = new Ave(nombre,edad,"montañas",genero,"blanco y amarillo");
		aguilas++;
		return nuevo;
	}
	public static int cantidadAves() {
		return listado.size();
	}
}

class Reptil extends Animal{
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

class Pez extends Animal{
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

class Anfibio extends Animal{
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
	public boolean getVenenoso() {
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
		return listado.size();
	}
}
