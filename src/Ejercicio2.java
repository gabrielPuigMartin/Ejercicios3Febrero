import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static double findAverageUsingStream(int[] array) {
		return Arrays.stream(array).average().orElse(Double.NaN);
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Integer[] v_numbers = new Integer[3];
		int[] v_numbersint = new int[3];
		for (int i = 0; i < 3; i++) {
			boolean done = false;
			do {
				System.out.println("Enter qualification of exercise " + i + ": ");
				String v_input=null;
				v_input = console.next();
				try {
					v_numbers[i] = Integer.parseInt(v_input);
					v_numbersint[i] = v_numbers[i];
					done = true;
				} catch (Exception e) {
					System.out.println("Invalid input: Enter just numbers 0-9 !");
				}

			} while (!done);
		}
		console.close();
		double v_average = findAverageUsingStream(v_numbersint);
		switch ((int) v_average) {
		case 1: {
			System.out.println("Nota: " + v_average + " Muy deficiente");
			break;
		}
		case 2: {
			System.out.println("Nota: " + v_average + " Muy deficiente");
			break;
		}
		case 3: {
			System.out.println("Nota: " + v_average + " Insuficiente");
			break;
		}
		case 4: {
			System.out.println("Nota: " + v_average + " Insuficiente");
			break;
		}
		case 5: {
			System.out.println("Nota: " + v_average + " Suficiente");
			break;
		}
		case 6: {
			System.out.println("Nota: " + v_average + " Bien");
			break;
		}
		case 7: {
			System.out.println("Nota: " + v_average + " Notable");
			break;
		}
		case 8: {
			System.out.println("Nota: " + v_average + " Notable");
			break;
		}
		case 9: {
			System.out.println("Nota: " + v_average + " Excelente");
			break;
		}
		case 10: {
			System.out.println("Nota: " + v_average + " Matrícula de honor");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + v_average);
		} 
			

	}

}
