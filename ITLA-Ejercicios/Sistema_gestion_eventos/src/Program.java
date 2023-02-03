import java.util.ArrayList;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean activo = true;
		int opcion;
		String Nombre;
		String Lugar;
		String Fecha;
		String prueba;
		ArrayList <Evento> evento = new ArrayList<Evento>();
		ArrayList<Invitados> invitados = new ArrayList<Invitados>();
		//Invitados invitados;
		
		
		do {
			
			System.out.print("1.Registrar eventos"
					+ "\n2.Registrar usuarios para evento"
					+ "\n3.Mostrar informacion del evento"
					+ "\n4.Mostrar cantidad de eventos"
					+ "\n5.Salir"
					+ "\nOpcion a elegir --->>  ");
			opcion = Input.scan.nextInt();
			
			switch (opcion) {
			
			case 1:
				ClearConsole.clear();
				System.out.print("\nIntroduce el nombre del evento --->>  ");
				Nombre = Input.scan.next();
				
				System.out.print("\nIntroduce la fecha del evento --->>  ");
				Fecha = Input.scan.next();
				
				System.out.print("\nIntroduce el lugar del evento --->>  ");
				Lugar = Input.scan.next();
				
				evento.add(new Evento(Nombre, Fecha));
				System.out.print("Evento agregado correctamente!\nPresione una tecla para continuar...");
				String Press = Input.scan.next();
				
				ClearConsole.clear();
				
				break;
				
			case 2:
				ClearConsole.clear();
				System.out.print("Introduce el nombre del invitado --->>  ");
				Nombre = Input.scan.next();
				
				invitados.add(new Invitados(Nombre));
				
				System.out.print("Invitado registrado!\nPresione una tecla para continuar...");
				Press = Input.scan.next();
				
				ClearConsole.clear();
				
				break;
				
			case 3:
				ClearConsole.clear();
				Evento.mostrarInfo();
				Press = Input.scan.next();
				break;
				
			case 4:
				break;
				
			case 5:
				ClearConsole.clear();
				break;
				
			default:
				break;
			
			}
			
			
		} while (activo);
		
	}

}
