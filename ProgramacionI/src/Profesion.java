import java.util.Scanner;

public class Profesion {

	ClearConsole clear = new ClearConsole();
	
	
	public void ProfProgramador () {
		String respuesta;
		Scanner getres = new Scanner(System.in);
		
		System.out.print("\nComo eres un programador, responde con un 'V' o 'F' segun sea: "
				+ "\nEl mejor amigo del desarrollador es Google: ");
		
		
		respuesta = getres.next();
		
		if (respuesta.toLowerCase().equals("v")) {
			
			System.out.print("\nSu respuesta es correcta!\nPresione una tecla para continuar...");
			respuesta = getres.next();
		} else {System.out.print("\nSu respuesta es incorrecta!\nPresione una tecla para continuar..."); respuesta = getres.next();}
	}
	
	public void ProfDesigner() {
		String respuesta;
		Scanner getres = new Scanner(System.in);
		
		System.out.print("\nComo eres diseñador grafico, responde con un 'V' o 'F' segun sea: "
				+ "\nPuedes trabajar de freelancer con facilidad: ");
		
		respuesta = getres.next();
		
		if (respuesta.toLowerCase().equals("v")) {
			System.out.print("\nSu respuesta es correcta!\nPresione una tecla para continuar...");
			respuesta = getres.next();
		} else {System.out.print("\nSu respuesta es incorrecta!\nPresione una tecla para continuar..."); respuesta = getres.next();}
	}
	
	public void ProfContable() {
		String respuesta;
		Scanner getres = new Scanner(System.in);
		
		System.out.print("\nComo eres contador, responde con un 'V' o 'F' segun sea: "
				+ "\nPuedes trabajar con finanzas sin ninguna dificuldad: ");
		
		respuesta = getres.next();
		
		if (respuesta.toLowerCase().equals("v")) {
			System.out.print("\nSu respuesta es correcta!\nPresione una tecla para continuar...");
			respuesta = getres.next();
		} else {System.out.print("\nSu respuesta es incorrecta!\nPresione una tecla para continuar..."); respuesta = getres.next();}
	}
}
