package controlador;

import modelo.Logica;
import modelo.dao.PersonaDao;
import modelo.vo.PersonaVo;
import vista.VentanaBuscar;
import vista.VentanaPrincipal;
import vista.VentanaRegistro;


public class Coordinador {
	
//	Clase Coordinador.
//
//	Esta clase contiene toda la lógica de relaciones en el aplicativo, es el puente entre el modelo y las vistas.
//
//	Puede contener instancias locales tanto de clases de la vista como de clases del modelo, 
//	estas instancias tienen sus respectivos métodos set y get permitiendo el flujo de llamados del sistema.
//
//	Cuando se desea registrar una persona desde la clase VentanaRegistro se hace un llamado al método 
//	registrarPersona() de la clase Coordinador, posteriormente esta clase llama al método ValidarRegistro()
//	de la clase Logica y esta a su vez realiza las validaciones correspondientes para determinar si se llama
//	o no al método RegistrarPersona() de la clase PersonaDao. 

	
	private Logica miLogica;
	private VentanaPrincipal miVentanaPrincipal;
	private VentanaRegistro miVentanaRegistro;
	private VentanaBuscar miVentanaBuscar;
	
	public VentanaPrincipal getMiVentanaPrincipal() {
		return miVentanaPrincipal;
	}
	public void setMiVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}
	public VentanaRegistro getMiVentanaRegistro() {
		return miVentanaRegistro;
	}
	public void setMiVentanaRegistro(VentanaRegistro miVentanaRegistro) {
		this.miVentanaRegistro = miVentanaRegistro;
	}
	public VentanaBuscar getMiVentanaBuscar() {
		return miVentanaBuscar;
	}
	public void setMiVentanaBuscar(VentanaBuscar miVentanaBuscar) {
		this.miVentanaBuscar = miVentanaBuscar;
	}
	public Logica getMiLogica() {
		return miLogica;
	}
	public void setMiLogica(Logica miLogica) {
		this.miLogica = miLogica;
	}
	
//////////////////////////////////////////////////////////
	
	public void mostrarVentanaRegistro() {
		miVentanaRegistro.setVisible(true);
	}
	public void mostrarVentanaConsulta() {
		miVentanaBuscar.setVisible(true);
	}
	
	public void registrarPersona(PersonaVo miPersona) {
		miLogica.validarRegistro(miPersona);
	}
	
	public PersonaVo buscarPersona(String codigoPersona) {
		return miLogica.validarConsulta(codigoPersona);
	}
	
	public void modificarPersona(PersonaVo miPersona) {
		miLogica.validarModificacion(miPersona);
	}
	public void eliminarPersona(String codigo) {
		miLogica.validarEliminacion(codigo);
	}


}
