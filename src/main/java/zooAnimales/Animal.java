package zooAnimales;
import gestion.*;

public class Animal {
	private static int totalAnimales=Mamifero.cantidadMamiferos()+Ave.cantidadAves()+Reptil.cantidadReptiles()+Pez.cantidadPeces()+Anfibio.cantidadAnfibios();
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public static void main(String[] args) {
        new Anfibio();
        new Anfibio();
        new Mamifero();
        new Mamifero();
        new Mamifero();
        new Reptil();
        new Pez();
        new Ave();
        new Ave();
        System.out.println(Animal.totalPorTipo());
        System.out.println("Mamiferos: 4\n" + "Aves: 4\n" + "Reptiles: 2\n" + "Peces: 2\n" + "Anfibios: 3");
    }
	
	public Animal(String nombre,int edad,String habitat,String genero){
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
	}
	public Animal(){
		totalAnimales++;
	}
	
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
	
	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" +
		"Aves: " + Ave.cantidadAves() + "\n" +
		"Reptiles: " + Reptil.cantidadReptiles() + "\n" +
		"Peces: " + Pez.cantidadPeces() + "\n" +
		"Anfibios: " + Anfibio.cantidadAnfibios();
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
