import java.util.ArrayList;
import java.util.List;

public class Estudiante {
	
	String Nombre;
	int Matricula;
	String Carrera;
	ArrayList<String> Materia;
	
	
	public static ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
	
	
	public Estudiante (String Nombre, int Matricula) {
		
		this.Nombre = Nombre;
		this.Matricula = Matricula;
	}

	public Estudiante (String Nombre, int Matricula, String Carrera) {
		
		this.Nombre = Nombre;
		this.Matricula = Matricula;
		this.Carrera = Carrera;
	}
	
	public static void setMateria(ArrayList<String> materias, String Nombre) {
		
		for (Estudiante student: estudiantes) {
			if (student.Nombre.equals(Nombre)) {
				student.Materia = materias;
				
				ClearConsole.clear();
				System.out.print("Materias agregadas con exitos!"
						+ "\nIntroduce una tecla para continuar...");
				String Press = Input.scan.next();
				ClearConsole.clear();
				}
			else {
				ClearConsole.clear();
				System.out.print("Fallo en intentar agregar las materias!"
						+ "\nIntroduce una tecla para continuar...");
				String Press = Input.scan.next();
				ClearConsole.clear();
			}
			
			}
			
		}
	
	
	public static void setMateria () {
		
		ClearConsole.clear();
		System.out.print("Introduce el nombre del estudiante al que desee agregar materia --->>  ");
		String Nombre_S = Input.scan.next();
		Input.scan.nextLine();
		
		System.out.print("Introduce la materia --->> ");
		String Materia_S = Input.scan.next();
		Input.scan.nextLine();
		
		for (Estudiante student: estudiantes) {
			if (student.Nombre.equals(Nombre_S)) {
				student.Materia.add(Materia_S);		
				ClearConsole.clear();
				System.out.print("Materia agregada con exitos!"
						+ "\nIntroduce una tecla para continuar...");
				String Press = Input.scan.next();
				ClearConsole.clear();}
			
			else {
				ClearConsole.clear();
				System.out.print("Fallo en intentar agregar la materia!"
						+ "\nIntroduce una tecla para continuar...");
				String Press = Input.scan.next();
				ClearConsole.clear();}
			}
	}
	
	public static void getEstudiante() {
		
		System.out.print("Introduce 'e' para mostrar la informacion de un estudiante o cualquier otra tecla para mostrar la lista de todos los estudiantes --->>  ");
		String Press = Input.scan.next();
		
		if (Press.toLowerCase().equals("e")) {
			
			System.out.print("\nIntroduce el nombre del estudiante para mostrar su informacion --->>  ");
			String Nombre_S = Input.scan.next();
			
			for (Estudiante students: estudiantes) {
				if (students.Nombre.equals(Nombre_S)) {
					ClearConsole.clear();
					System.out.print("El nombre del estudiante es: " + students.Nombre
							+ "\nLa matricula del estudiante es: " + students.Matricula
							+ "\nLa carrera del estudiante es: " + students.Carrera
							+ "\nLas materias del estudiante son: " + students.Materia);
					
					System.out.print("\nIntroduce una tecla para continuar...");
					Press = Input.scan.next();
					ClearConsole.clear();
					
				}
				
				else {
					ClearConsole.clear();
					System.out.print("El estudiante " + Nombre_S + " no existe!");
					
					System.out.print("\nIntroduce una tecla para continuar...");
					Press = Input.scan.next();
					ClearConsole.clear();
				}
			}
		}
		else {
			ClearConsole.clear();
			for (Estudiante students: estudiantes) {
				
				System.out.print("\nEl nombre del estudiante es: " + students.Nombre
						+ "\nLa matricula del estudiante es: " + students.Matricula
						+ "\nLa carrera del estudiante es: " + students.Carrera
						+ "\nLas materias del estudiante son: " + students.Materia
						+"\n--------------------------------------------------------------------------------------------------");
			}
			
			System.out.print("\nIntroduce una tecla para continuar...");
			Press = Input.scan.next();
			ClearConsole.clear();
		}
	}
	
}

