import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean activo = true;
		int opcion;
		
		
		
		do {
			ClearConsole.clear();
			System.out.print("1.Agregar estudiante"
					+ "\n2.Agregar materias"
					+ "\n3.Mostrar estudiante"
					+ "\n4.Salir"
					+ "\nOpcion a elegir --->>  ");
			opcion = Input.scan.nextInt();
			
			switch(opcion) {
			
			case 1:
				ClearConsole.clear();
				System.out.print("\nIntroduce el nombre del estudiante --->>  ");
				String Nombre_S = Input.scan.next();
				Input.scan.nextLine();
				
				System.out.print("\nIntroduce la matricula del estudiante --->>  ");
				int Matricula_S = Input.scan.nextInt();
				
				System.out.print("\nIntroduce 'S' si desea agregar la carrera --->> ");
				String Option = Input.scan.next();
				
				if (Option.toUpperCase().equals("S")) {
					
					System.out.print("\nIntroduce la carrera del estudiante --->>  ");
					String Carrera_S = Input.scan.next();
					
					Estudiante.estudiantes.add(new Estudiante(Nombre_S, Matricula_S, Carrera_S));
					
					ClearConsole.clear();
					System.out.print("Estudiante registrado con exitos!"
							+ "\nIntroduce una tecla para continuar...");
					String Press = Input.scan.next();
					ClearConsole.clear();
				}
				
				else {
					Estudiante.estudiantes.add(new Estudiante(Nombre_S, Matricula_S));
					
					ClearConsole.clear();
					System.out.print("Estudiante registrado con exitos!"
							+ "\nIntroduce una tecla para continuar...");
					String Press = Input.scan.next();
					ClearConsole.clear();
				}
				
				break;
				
			case 2:
				ClearConsole.clear();
				System.out.print("\nDeseas agregar una o mas materias?\nIntroduce 'e' para una materia o cualquier otra tecla para varias materias --->>  ");
				String Press = Input.scan.next();
				
				if (Press.toLowerCase().equals("e")) {
					Estudiante.setMateria();
				}
				else {
					ClearConsole.clear();
					System.out.print("Introduce el nombre del estudiante --->>  ");
					Nombre_S = Input.scan.next();
					
					for (Estudiante students: Estudiante.estudiantes) {
						
						if (students.Nombre.equals(Nombre_S)) {
							System.out.print("\nIntroduce la cantidad de materias que desees agregar --->>  ");
							int Cantidad = Input.scan.nextInt();
							
							ArrayList<String> mat = new ArrayList<String>();
							
							for (int i = 0; i <= Cantidad; i++) {
								ClearConsole.clear();
								System.out.print("Introduce el nombre de la materia --->> ");
								String Nombre_M = Input.scan.next();
								
								mat.add(Nombre_M);
							}
							
							Estudiante.setMateria(mat, Nombre_S);
						}
					}
					
				}
				break;
				
			case 3:
				ClearConsole.clear();
				Estudiante.getEstudiante();
				break;
				
			case 4:
				ClearConsole.clear();
				activo = false;
				
				break;
			default:
				break;
			
			}
			
		} while (activo);
	}

}
