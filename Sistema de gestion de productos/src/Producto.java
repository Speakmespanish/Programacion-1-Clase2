import java.util.ArrayList;

public class Producto {
	
	ArrayList <Producto> productos = new ArrayList<Producto>();
public static String Nombre;
public static int Cantidad = 0;
public static double Precio;
public static boolean Stock;

	public Producto (String Nombre, double Precio) {
		Producto.Nombre = Nombre;
		Producto.Precio = Precio;
	}
	
	public Producto (String Nombre, double Precio, int Cantidad) {
		
		Producto.Nombre = Nombre;
		Producto.Precio = Precio;
		Producto.Cantidad = Cantidad;
	}
	
	
	public static void AgregarCantidad (int Cantidad) {
		Producto.Cantidad += Cantidad;
	}
	
	public static void Vender (int CantidadVenta) {
		
		Producto.Cantidad -= CantidadVenta;
	}
	
	public static void getproducto () {
		
		System.out.print("\nEl nombre del producto es: " + Producto.Nombre
				+ "\nEl precio del producto es: " + Producto.Precio + " dop"
				+ "\nLa cantidad que queda de este producto es: " + Producto.Cantidad);
	}
}
