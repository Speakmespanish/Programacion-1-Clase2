
public class Contador {

	int Count;
	
	public Contador () { //Constructor sin parametros
		
	}
	
	public Contador (int Count) { //Constructor con parametros
		
		this.Count = Count;
	}
	
	public void getCount() {
		
		System.out.print(Count);
	}
	
	public void setCount(int count) {
		this.Count = count;
	}
	
	
	//Metodos para incrementar y descrementar el contador
	public void Incremento ()  {
		
		ClearConsole.Clear();
		System.out.print("Ingrese la cantidad de numeros que desees incrementar --->>  ");
		int num = Input.scan.nextInt();
		
		for (int i = 0; i < num; i++) {
			Count++;
			System.out.print("\nNumero: " + Count);
		}
	}
	
	public void Descremento () {
		
		ClearConsole.Clear();
		System.out.print("Ingrese la cantidad de numeros que desees descrementar --->>  ");
		int num = Input.scan.nextInt();
		
		for (int i = 0; i < num; i++) {
			Count--;
			System.out.print("\nNumero: " + Count);
		}
	}
}
