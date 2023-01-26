public class Persona {
	
	//Atributos
	String Nombre;
	String Apellido;
	int Edad;
	boolean Casado;
	String Cedula;
	String Profesion;
	
	ClearConsole clear = new ClearConsole();
	
	public Persona (String Profesion) { //Constructor
		
		this.Profesion = Profesion;
		System.out.print("\nLa profesion de esta pesona es: " + Profesion);
		
	}
	
	//Metodo para llamar otros metodos segun profesion
	public void LlamarProfesion () {
		
		switch (Profesion.toLowerCase()) 
		{
		case "programador": {
			
			Profesion programador = new Profesion();
			programador.ProfProgramador();
			
			break;} 
		
		case "diseñador grafico": 
		{
			Profesion designer = new Profesion();
			designer.ProfDesigner();
			
			break;
		}
		
		case "contador": 
		{
			Profesion Contable = new Profesion();
			Contable.ProfContable();
			
			break;
		}
		
		default: {break;}
		
		}
		
		
	}
	
	
	//Metodos getter y setter
	public void getpersona () {
		
		clear.Clear();
		System.out.print("\nEl nombre de la persona es: " + Nombre
				+ "\nEl apellido de la persona es: " + Apellido
				+ "\nLa edad de esa persona es: " + Edad
				+ "\nLa cedula de la persona es: "+ Cedula);
		
		if (Casado) {
			System.out.print("\nLa persona esta casada");
		} else {System.out.print("\nLa persona no esta casada");}
		
		LlamarProfesion();
	}
	
	public void setpersona (String Nombre, String Apellido, int Edad, boolean Casado, String Cedula) {
		
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Edad = Edad;
		this.Casado = Casado;
		this.Cedula = Cedula;

		
	}
	
}
