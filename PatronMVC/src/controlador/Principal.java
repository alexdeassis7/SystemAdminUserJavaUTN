package controlador;

import modelo.Logica;
import vista.VentanaBuscar;
import vista.VentanaPrincipal;
import vista.VentanaRegistro;
//Esta clase contiene el m�todo main que ejecuta la aplicaci�n, el m�todo hace 
//un llamado al m�todo iniciar el cual crea las instancias de las clases ventanas y 
//la clase Logica  estableciendo las relaciones con la clase Coordinador.
//
//A cada instancia de las clases se les env�a una instancia de la clase Coordinador,
//y a la instancia de Coordinador se le env�a cada instancia de las clases, esto por
//medio de los m�todos set y get estableciendo las relaciones necesarias y por ultimo
//se usa la instancia de la clase VentanaPrincipal para cargarla en pantalla. 



public class Principal {
	
	Logica miLogica;
	VentanaPrincipal miVentanaPrincipal;
	VentanaBuscar miVentanaBuscar;
	VentanaRegistro miVentanaRegistro;
	Coordinador miCoordinador;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Principal miPrincipal=new Principal();
		miPrincipal.iniciar();
	}

	/**
	 * Permite instanciar todas las clases con las que trabaja
	 * el sistema
	 */
	private void iniciar() {
		/*Se instancian las clases*/
		miVentanaPrincipal=new VentanaPrincipal();
		miVentanaRegistro=new VentanaRegistro();
		miVentanaBuscar= new VentanaBuscar();
		miLogica=new Logica();
		miCoordinador= new Coordinador();
		
		/*Se establecen las relaciones entre clases*/
		miVentanaPrincipal.setCoordinador(miCoordinador);
		miVentanaRegistro.setCoordinador(miCoordinador);
		miVentanaBuscar.setCoordinador(miCoordinador);
		miLogica.setCoordinador(miCoordinador);
		
		/*Se establecen relaciones con la clase coordinador*/
		miCoordinador.setMiVentanaPrincipal(miVentanaPrincipal);
		miCoordinador.setMiVentanaRegistro(miVentanaRegistro);
		miCoordinador.setMiVentanaBuscar(miVentanaBuscar);
		miCoordinador.setMiLogica(miLogica);
				
		miVentanaPrincipal.setVisible(true);
	}

}
