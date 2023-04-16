/**
 * 
 */
package luchaLibre;

import java.util.ArrayList;
/**
 * @author Daniela
 *
 */
public class Luchador {

	/**
	 * 
	 */
	
private  int salud = 300;
	private  String nombre;
	private  int categoria;
	private int cantVida;
	private  int fuerza;
	private boolean siestamuerto;
    private ArrayList<Ataque> ataques = new ArrayList<Ataque>();
  //getter and setters
  	/**
  	 * @return the cantVida
  	 */
  	public int getCantVida() {
  		return cantVida;
  	}
  	/**
  	 * @param cantVida the cantVida to set
  	 */
  	public void setCantVida(int cantVida) {
  		this.cantVida = cantVida;
  	}
  	/**
  	 * @return the fuerzaMinima
  	 */
  	public int getFuerza() {
  		return fuerza;
  	}
  	/**
  	 * @param fuerzaMinima the fuerzaMinima to set
  	 */
  	public  void setFuerzaMinima(int fuerzaMinima) {
  		this.fuerza = fuerzaMinima;
  	}
  	public int getSalud() {
  		return salud;
  	}
  	public void setSalud(int salud) {
  		this.salud = salud;
  	}
  	public String getNombre() {
  		return nombre;
  	}
  	public  void setNombre(String nombreJugador) {
  		this.nombre = nombreJugador;
  	}
  	public int getCategoria() {
  		return categoria;
  	}
  	public void setCategoria(int categoriaJugador) {
  		this.categoria = categoriaJugador;
  	}
  	/**
  	 * @return the ataques
  	 */
  	public ArrayList<Ataque> getAtaques() {
  		return ataques;
  	}
  	/**
  	 * @param ataques the ataques to set
  	 */
  	public void setAtaques(ArrayList<Ataque> ataques) {
  		this.ataques = ataques;
  	}
  	//Constructores
  	//constructor parametros
  	public Luchador() {
  		// TODO Auto-generated constructor stub
  		String nombre = "";
  		int categoria = 0;
  		int fuerza = 0;
  		
  	}
  	//constructor con atributos
  	
  	public Luchador(String nombreJugador,int categoriaJugador) {
  	   this.nombre = nombreJugador;
  	   this.categoria = categoriaJugador;
  	   this.fuerza = categoria * 10 + 10;
  	}
  	
  	//
}
