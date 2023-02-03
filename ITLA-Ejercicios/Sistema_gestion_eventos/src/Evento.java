import java.util.ArrayList;
import java.util.Date;

public class Evento {

	public static ArrayList <Evento> evento = new ArrayList<Evento>();
	
	String Nombre;
	String Lugar;
	String Fecha;
	String prueba;
	Invitados invitados;
	public static int Cantidad_Eventos;
	
	
	public Evento(String Nombre, String Fecha) {
		this.Nombre = Nombre;
		this.prueba = Fecha;
		Cantidad_Eventos = evento.size();
	}
	
	public Evento(String Nombre, String Fecha, String Lugar, Invitados invitados) {
		this.Nombre = Nombre;
		this.Fecha = Fecha;
		this.Lugar = Lugar;
		this.invitados = invitados;
		Cantidad_Eventos = evento.size();
	}
	
	
	
	public void agregarInvitado(String Nombre) {
		
		invitados.Nombre = Nombre;
		
	}
	
	public void agregarInvitado(Invitados invitados) {
		this.invitados = invitados;
		
	}
	
	public static void mostrarInfo () {
		for (Evento event: evento) {
			System.out.print("\nNombre de evento: " + event.Nombre
					+ "\nLugar del evento: " + event.Lugar
					+ "\nFecha del evento: " + event.Fecha
					+ "\nLista de invitados del evento: " + event.invitados);
		}
	}
	
	public int getCantidadEventos() {
		return Cantidad_Eventos;
	}
	
	
}
