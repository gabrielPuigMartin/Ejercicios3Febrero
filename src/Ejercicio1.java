import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Integer[] v_numbers = new Integer[3];
		for (int i = 0; i < 3; i++) {
			boolean done = false;
			do {
				System.out.println("Enter number " + i + ": ");
				String v_input=null;
				v_input = console.next();
				try {
					v_numbers[i] = Integer.parseInt(v_input);
					done = true;
				} catch (Exception e) {
					System.out.println("Invalid input: Enter just numbers 0-9 !");
				}

			} while (!done);
		}
		System.out.println("----------------------------");
		if (v_numbers[0]+v_numbers[1] == v_numbers[2]) {
			int v_suma = v_numbers[0] + v_numbers[1];
			System.out.println("NÚmero 1 + Número 2 = " + v_suma);
			System.out.println("NÚmero 3 = " + v_numbers[2]);
		}
		else {
			System.out.println("NÚmero 1 = " + v_numbers[0]);
			System.out.println("NÚmero 2 = " + v_numbers[1]);
			System.out.println("NÚmero 3 = " + v_numbers[2]);
			int v_suma = v_numbers[0] + v_numbers[1] + v_numbers[2];
			System.out.println("Suma total = " + v_suma);
			
		}
	

		
		
		
	}

}
