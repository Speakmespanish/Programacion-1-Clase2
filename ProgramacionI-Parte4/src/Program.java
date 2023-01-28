
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean activo = true;
		int opcion;
		ClearConsole clear = new ClearConsole();
		Libros libro = new Libros();
		
		do {
			
			System.out.print("\n1.Agregar libro"
					+ "\n2.Mostrar libros"
					+ "\n3.Prestamo"
					+ "\n4.Devolucion"
					+ "\n5.ToString"
					+ "\n6.Salir"
					+ "\nOpcion a elegir --->>  ");
			opcion = Input.scan.nextInt();
			
			switch (opcion) {
			
			case 1:
				clear.Clear();
				libro.setLibro();
				clear.Clear();
				break;
				
			case 2:
				clear.Clear();
				libro.getLibro();
				clear.Clear();
				break;
				
			case 3:
				clear.Clear();
				libro.Prestamo();
				clear.Clear();
				break;
				
			case 4:
				clear.Clear();
				libro.Devolucion();
				clear.Clear();
				break;
				
			case 5:
				clear.Clear();
				libro.ToString();
				clear.Clear();
				
				break;
				
			case 6:
				clear.Clear();
				System.out.print("Saliendo del programa...");
				activo = false;
				break;
				
			default:
				break;
				
			}
			
			
		} while (activo);
	}

}
