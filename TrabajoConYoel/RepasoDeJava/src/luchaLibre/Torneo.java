/**
 * 
 */
package luchaLibre;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Torneo {
	//Atributos
		public static LinkedList<Luchador> gladiador = new LinkedList<Luchador>();
		public static Scanner sc = new Scanner(System.in);
		public static String nombreJugador;
		public static int categoriaJugador;
		public static int option;
		public static int limiteVida;
		public static int cantAtacantes;
		public static int fuerzaMinima;
		
	//Métodos
public static void mostrarMenu() {
	
		System.out.println("|================================================================|");
		System.out.println("|                          Menú Principal                        |");
		System.out.println("|================================================================|");
		System.out.println("|              1 👉 Mostrar Gladiadores                          |");
		System.out.println("|              2 👉 Añadir Gladiador                             |");
		System.out.println("|              3 👉 ¿Preparado? ¡A luchar!                       |");
		System.out.println("|              4 👉 Mostrar Listado de Puntuaciones              |");
		System.out.println("|              5 👉 Salir del Juego                              |");
		System.out.println("|================================================================|");
		System.out.println();
		System.out.println(" ¡Ahora es tú turno de elejir una opcción!:");
		
	}
	//
	
	 //Método para mostrar los Gladiadores
	 public static void mostrarGladiadores(Scanner sc) {
		 int cantGladiadores = gladiador.size();
		  System.out.println(" ============ 1 👉  Mostrar Gladiadores ======================== ");
		  System.out.println();
		  
		
		  if(gladiador.isEmpty()){
	            System.out.println("                 ❗La lista está vacia❗                   ");
	            System.out.println();
	        }
		  else {
			 System.out.println("Cantidad de Gladiadores:" + cantGladiadores );
	         System.out.println();
	         System.out.println("|============================================================|");
	         System.out.println("|            Los Gladiadores del combate son:                |");
	         System.out.println("|============================================================|");
	         System.out.println();
	         for (Luchador luchador : gladiador) {
	          System.out.println("|👉 Nombre: " + luchador.getNombre() + "\n|👉 Categoría: " + luchador.getCategoria()+"\n|👉 Fuerza Mínima:  "
	         + luchador.getFuerza()+"\n|👉 Canidad de Ataques: "+ luchador.getCategoria() +"\n|👉 Tipos de Ataques: " );
	          System.out.println();
	         }
	}
	
	       
	       }
	 //Método para guardar los Gladiadores
	
	 public static void añadirGladiador(Scanner sc) {
		  System.out.println(" ============= 2  👉  Añadir Gladiador =========================");
		  System.out.println();
		  System.out.println("  Escriba el nombre de tú Campeon: ");
		   nombreJugador = sc.nextLine();
		  System.out.println();
		  System.out.println("                            Categorías:                         ");
		  System.out.println("|==============================================================|");
		  System.out.println("|     1->peso mosca🪰 / 2->peso pluma🪶 / 3->peso ligero🌬️     |");
		  System.out.println("|           4->peso medio🪨 / 5->peso pesado🗿                 |");
		  System.out.println("|==============================================================|");
		  System.out.println();
		  System.out.println("  Elija su categoría :");
		  categoriaJugador = Integer.parseInt(sc.nextLine());
		  Luchador luchador = new Luchador(nombreJugador , categoriaJugador);
		  gladiador.add(luchador);
		  System.out.println(" ¡ El gladiador "+ nombreJugador +" !  a sido agragado ");
		  System.out.println();
		 
	 }  
	 //
		
	 //
	 public static boolean sePuedePelear() {
		 boolean sePedePelear;
		 if (gladiador.size() >= 1) {
			 sePedePelear = true;
		 }
		 else {
			 sePedePelear =false;
		 }
		return sePedePelear;
		}
	 public static void batallaGladiadores(Scanner sc) {
		 System.out.println(" ============== 3 👉 ¿Preparado? ¡A luchar! ===================== ");
		 if(sePuedePelear()==true) {
			 if (gladiador.size()==1) { 
		 System.out.println("                   ❕⚠️ ¡Faltan luchadores! ⚠️❕                     ");
		 System.out.println("       Se necesitan más de un gladiador para iniciar el torneo    ");
		 System.out.println("                 Por favor introdusca más campeones.                 ");
		 System.out.println();
		 }
			 else {
			   System.out.println();
			   System.out.println("            ((🔔)) ¡Que comience el combate! ((🔔))            ");
			   System.out.println();
			 }
		 }
		 else {
				  System.out.println("                ❕⚠️ ¡No hay luchadores! ⚠️❕               ");
				  System.out.println("            Necesitamos Luchadores para el torneo           ");
				  System.out.println("        Por favor introdusca a las esttrellas del Show.     ");
				  System.out.println();
		 }
		 
		 
		 } 
	 //
	 public static void listadoPuntuaciones() {
		 System.out.println(" ============== 4  👉  Mostrar Listado de puntuaciones ========== ");
		 
		 
		 
		 
		 
		 
		 System.out.println("");
	 }
	 //
	 public static void SaliendoDelJuego() {
		 System.out.println(" ============== 5  👉  Salir del Juego ========================== ");
		 System.out.println();
		 System.out.println("              Esperamos que lo hallas disrutado                   ");
		 System.out.println("                  Hasta el próximo Torneo de :                    ");
	     System.out.println(" ==============| 👊🏻 Batalla de Gladiadores 👊🏻 |================== ");
	     System.out.println(" =======================| ⚡1.0⚡ |============================== ");
		 System.out.println("                     Juego Terminado                              ");
	 }

	 //Esepciones 
	      
	      
	     
	      
	      
	      
	      
	      
	     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("|================================================================|");
	       System.out.println("|                          Sea Bienvenido a:                     |");
	       System.out.println("|================================================================|");
	       System.out.println("|                     🥊Batalla de Gladiadores🥊                 |");
	       System.out.println("|                            👊🏻 Básico 👊🏻                        |");
	       System.out.println("|                              ⚡1.0⚡                           |");
	       System.out.println("|================================================================|");
	       System.out.println();
	       do {
	    		mostrarMenu();
	    		option = Integer.parseInt(sc.nextLine());	
	    		if (option >0 && option <= 5) {
	    			switch(option) {
	    	  
	    		case 1: 
	    		mostrarGladiadores(sc);
	    			break;
	    		case 2:
	    		añadirGladiador(sc);
	    			break;
	    		case 3:
	    			batallaGladiadores(sc);
	    			break;
	    		case 4:
	    			
	    			break;
	    		case 5:
	    			SaliendoDelJuego();
	    			break;
	    		}}
	    		else {
	    			//PorDefecto();
	    			mostrarMenu();
	    		}
	    		
	    	}while(option != 5);
	    			
	 
		}
	}



