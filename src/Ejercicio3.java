import java.util.Scanner;

public class Ejercicio3 {
	
	static int v_pasajeros;
	public static void main(String[] args) {
		
		System.out.println("El número inicial de pasajeros en el tren es de: " + args[0]);
		v_pasajeros = Integer.parseInt(args[0]);
		Scanner console = new Scanner(System.in);
		Integer[] v_numbers = new Integer[3];
		System.out.println("------------------------------------------------");
		for (int i = 0; i < 2; i++) {
			boolean done = false;
			do {
				System.out.println("Estación " + i + ". Hay " + v_pasajeros + " quedan en el tren.  ¿Cuantos se bajan?: ");
				String v_input=null;
				v_input = console.next();
				try {
					v_numbers[i] = Integer.parseInt(v_input);
					if (v_numbers[i] <= v_pasajeros) {
						v_pasajeros = v_pasajeros - v_numbers[i];
						done = true;
					} else {
						System.out.println("No se pueden bajar mas pasajeros de lo que quedan en el tren!!");
					}
						
				} catch (Exception e) {
					System.out.println("Invalid input: Enter just numbers 0-9 !");
				}

			} while (!done);
		}
		System.out.println("----------------------------------------------------");
		System.out.println("El tren ha llegado a la estación destino con " + v_pasajeros+" pasajeros.");

	}

}
