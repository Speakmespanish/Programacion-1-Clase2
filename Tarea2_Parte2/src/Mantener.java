import java.util.Scanner;
public class Mantener {

	public void MantenerCuenta() {
		Scanner scan = new Scanner(System.in);
		Cuenta cnt = new Cuenta();
		ClearConsole clear = new ClearConsole();
		
		int Opcion;
		boolean Apagar = true;
		boolean Apagar2 = true;
		
		do {
			
			System.out.print("Bienvenido!\n"
					+ "1.Registrarse"
					+ "\nSalir"
					+"\nOpcio a elegir --->>  ");
			
			Opcion = scan.nextInt();
			
			
			
			switch (Opcion) {
				
			case 1:
				
				try {
				cnt.setcuenta();
				
				
				
				do {
					clear.ClearConsole();
					System.out.print("\n1.Ver informacion de la cuenta"
							+ "\n2.Ingreso"
							+ "\n3.Reintegro"
							+ "\n4.Transferencia a otra cuenta"
							+ "\n5.Salir"
							+ "\nOpcion a elegir --->>  ");
					
					Opcion = scan.nextInt();
					
					switch (Opcion) {
					case 1:
						cnt.getcuenta();
						System.out.print("\nPresiona una tecla para continuar...");
						scan.next();
						clear.ClearConsole();
						break;
						
					case 2:
						clear.ClearConsole();
						System.out.print("Su saldo actual es de: " + cnt.Saldo
								+ "\nIntroduce la cantidad a ingresar --->>  ");
						double Ingreso = scan.nextDouble();
						cnt.Ingreso(Ingreso);
						break;
						
					case 3:
						cnt.Reintegro();
						break;
						
					case 4:
						cnt.Transferencia();
						break;
						
					case 5:
						Apagar2 = false;
						clear.ClearConsole();
						break;
					default:
						break;
					}
					
				} while (Apagar2);
				
				}
				catch (Exception e) {
					System.out.print("Ha ocurrido el siguiente error: " + e);
				}
				
				
				break;
			default: 
				Apagar = false;
				break;
			
			}
			
		} while (Apagar);
		
	}
	
}
