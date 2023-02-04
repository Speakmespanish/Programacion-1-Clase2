import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean activo = true;
		int opcion;
		ArrayList <Producto> productos = new ArrayList<Producto>();
		
		do {
			
			System.out.print("\n1.Agregar producto"
					+ "\n2.Agregar cantidad a algun producto"
					+ "\n3.Vender producto"
					+ "\n4.Mostrar productos disponibles"
					+ "\n5.Salir"
					+ "\nOpcion a elegir --->>  ");
			opcion = Input.scan.nextInt();
			
			switch (opcion) {
			
			case 1:
				try {
				
				ClearConsole.clear();
				System.out.print("Introduce el nombre del producto --->>  ");
				String Nombre = Input.scan.next();
				
				System.out.print("\nIntroduce el precio del producto --->>  ");
				double Precio = Input.scan.nextInt();
				
				System.out.print("\nIntroduce la cantidad de productos --->>  ");
				int Cantidad = Input.scan.nextInt();
				
				productos.add(new Producto(Nombre.toUpperCase(), Precio, Cantidad));
				System.out.print("\nProducto agregado con exitos!\nIntroduce una tecla para continuar...");
				String Press = Input.scan.next();
				}
				catch (Exception ex) {System.out.print("Ha ocurrido el siguiente error: " + ex); }
				break;
				
			case 2:
				ClearConsole.clear();
				
				System.out.print("Introduce el nombre del producto al que le desees agregar --->>  ");
				String Nombre_producto = Input.scan.next();
				
				System.out.print("\nIntroduce la cantidad que desees agregar --->>  ");
				int Cantidad_producto = Input.scan.nextInt();
				
				
				for (Producto index: productos) {
					if (index.Nombre.equals(Nombre_producto.toUpperCase())) {
						index.Cantidad += Cantidad_producto;
						System.out.print("\nCantidad agregada con exitos!"
								+ "\nIntroduce una tecla para continuar...");
						String Press = Input.scan.next();
						
						ClearConsole.clear();
					} else {
						System.out.print("\nError en agregar la cantidad!"
								+ "\nIntroduce una tecla para continuar...");
						String Press = Input.scan.next();
						
						ClearConsole.clear();
					}
				}
				break;
				
			case 3:
				ClearConsole.clear();
				System.out.print("Introduce el nombre del producto que desees vender --->>  ");
				Nombre_producto = Input.scan.next();
				
				System.out.print("\nIntroduce la cantidad que desees vender del producto --->>  ");
				Cantidad_producto = Input.scan.nextInt();
				
				for (Producto index: productos) {
					int resultadocantidad = index.Cantidad - Cantidad_producto;
					if (index.Nombre.equals(Nombre_producto.toUpperCase()) && resultadocantidad > 0) {
						Producto.Vender(Cantidad_producto);
						System.out.print("\n" + Cantidad_producto + " " + Nombre_producto
								+ " vendido con exitos!"
								+ "\nIntroduce una tecla para continuar...");
						String Press = Input.scan.next();
						
						ClearConsole.clear();
					}
					
					else {
						System.out.print("\nFallo en vender el producto"
								+ "\nIntroduce una tecla para continuar...");
						String Press = Input.scan.next();
						
						ClearConsole.clear();
					}
				}
				break;
			case 4:
				ClearConsole.clear();
				Producto.getproducto();
				System.out.print("\nIntroduce una tecla para continuar...");
				String Press = Input.scan.next();
				
				ClearConsole.clear();
				break;
			case 5:
				ClearConsole.clear();
				System.out.print("Saliendo del programa...");
				activo = false;
				break;
			default:
				ClearConsole.clear();
				System.out.print("Error, opcion no valida..."
						+ "\nIntroduce una tecla para continuar...");
				Press = Input.scan.next();
				ClearConsole.clear();
				break;
			
			}
			
		} while (activo);
		
	}

}
