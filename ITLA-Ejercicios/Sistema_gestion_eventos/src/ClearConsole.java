
public class ClearConsole {

	static String clear = "\n";
	
	public static void clear () {
		for (int i = 0; i < 100; i++) {
			System.out.print(clear);
		}
	}
	
}
