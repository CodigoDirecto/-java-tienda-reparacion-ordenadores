import vista.Vista;
import controlador.Controlador;
/**
 * La clase principal del programa.
 * Programa diseañado para gestionar tecnicos, reparaciones y ordenadores
 * en una tienda informatica.
 * IES Gregorio Prieto 2022/2023
 * 
 */
public class Main {
	/**
	 * 
	 * @param args ...
	 */
	public static void main(String[] args) {
		Vista vista = new Vista( );
		Controlador controlador = new Controlador(vista);
		controlador.iniciarVista();
	}
}
