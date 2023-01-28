import java.util.Scanner;
public class Cuenta {

	String Nombre;
	long IdCuenta;
	double Saldo;
	double Rein;
	
	ClearConsole clear = new ClearConsole();
	
	public Cuenta () {	
		
	}
	
	public Cuenta (String Nombre, long IdCuenta, double Saldo) {
		
		this.Nombre = Nombre;
		this.IdCuenta = IdCuenta;
		this.Saldo = Saldo;
	}
	
	public void getcuenta () {
		
		clear.ClearConsole();
		System.out.print("El propietario de la cuenta es: " + Nombre
				+ "\nEl ID de la cuenta es: " + IdCuenta
				+ "\nEl saldo de la cuenta es: " + Saldo);
	}
	
	public void setcuenta () {
		
		Scanner scan = new Scanner(System.in);

		
		System.out.print("Introduce tu nombre --->>  ");
		Nombre = Input.scan.next();
		Input.scan.nextLine();
		
		System.out.print("Introduce tu ID --->>  ");
		IdCuenta = Input.scan.nextLong();
		
		System.out.print("Introduce tu saldo --->>  ");
		Saldo = Input.scan.nextDouble();
		
	}
	
	public void Ingreso (double Ingreso) {
		Saldo += Ingreso;
		System.out.print("\nSu nuevo saldo es: " + Saldo);
	}
	
	public void Transferencia () {
		
		clear.ClearConsole();
		System.out.print("Inserte el numero de cuenta a la que desea transferir --->>  ");
		long IdCuenta2 = Input.scan.nextLong();
		
		System.out.print("\nIngrese el saldo que desea transferir a la otra cuenta --->>  ");
		double Saldo2 = Input.scan.nextDouble();
		
		if ((Saldo-Saldo2) >= 0) {
			
			Rein = Saldo;
			Saldo = Saldo - Saldo2;
			System.out.print("\nTransferencia exitosa! Su saldo actual es de: " + (Saldo)
					+ "\nPresione cualquier tecla para continuar...");
			String Press = Input.scan.next();
			clear.ClearConsole();
		}
		else {
			System.out.print("\nHubo un error en la transferencia, saldo insuficiente..."
					+ "\nPresione cualquier tecla para continuar...");
			String Press = Input.scan.next();
		}
		
		
	}
	
	public void Reintegro () {
		if (Rein != 0) {
			
			Saldo = Rein;
			clear.ClearConsole();
			System.out.print("\nEl dinero se te ha devuelto a tu cuenta con exitos!\nTu saldo actual es: " + Saldo
					+ "\nPresiona cualquier tecla para continuar...");
			String Press = Input.scan.next();
		}
		else {
			System.out.print("\nLo sentimos, hubo un error"
					+ "\nPresiona cualquier tecla para continuar...");
			String Press = Input.scan.next();
		}
		
	}
}
