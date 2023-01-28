import java.util.ArrayList;

public class Libros {

	String Nombre;
	int ID;
	boolean Prestado;
	
	ArrayList<Libros> libro = new ArrayList<Libros>();
	
	public Libros () {
		
	}
	
	public Libros (String Nombre, int ID, boolean Prestado) {
	
	this.Nombre = Nombre;
	this.ID = ID;
	this.Prestado = Prestado;
}
	
	
	public void getLibro () {
		for (Libros book: libro) {
			
			System.out.print("\nEl nombre del libro es: " + book.Nombre
					+ "\t|||El id del libro es: " + book.ID);
			
			if (book.Prestado) {
				System.out.print("\t|||El libro esta prestado!");
			} else {System.out.print("\t|||El libro no esta prestado!"); }
		}
		
		System.out.print("\nPresione una tecla para continuar...");
		String Press = Input.scan.next();
	}
	
	public void setLibro () {
		
		
		
		
		System.out.print("\n\nIntroduce el nombre del libro --->>  ");
		Nombre = Input.scan.next();
		Input.scan.nextLine();
		
		System.out.print("\nIntroduce el id del libro --->>  ");
		ID = Input.scan.nextInt();
		Input.scan.nextLine();
		
		libro.add(new Libros(Nombre, ID, false));
		
		System.out.print("\nPresiona una tecla para continuar...");
		String press = Input.scan.next();
		
	}
	
	public void Prestamo () {
		
		
		System.out.print("Introduce el ID del libro que desees tomar prestado --->>  ");
		int IdCopy = Input.scan.nextInt();
		
		for (Libros lib: libro) {
			
			if (IdCopy == lib.ID) {
				lib.Prestado = true;
				
				System.out.print("\nEl libro ha sido prestado!");
			}
		}
		System.out.print("\nPresione una tecla para continuar...");
		String Press = Input.scan.next();
	}
	
	public void Devolucion () {
		
		System.out.print("Introduce el ID del libro que desees devolver --->>  ");
		int IdCopy = Input.scan.nextInt();
		
		for (Libros lib: libro) {
			
			if (IdCopy == lib.ID) {
				lib.Prestado = false;
				
				System.out.print("\nEl libro ha sido devolvido!");
			}
		}
		
		System.out.print("\nPresione una tecla para continuar...");
		String Press = Input.scan.next();
	}
	
	public void ToString() {
		
		String ElLibro = libro.toString();
		
		System.out.print(ElLibro);
		
		System.out.print("\nPresione una tecla para continuar...");
		String Press = Input.scan.next();
	}

}