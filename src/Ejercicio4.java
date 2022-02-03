import java.util.Scanner;

public class Ejercicio4 {

	
	public static void main(String[] args) {
	
		String[] v_excursiones = new String[] {"Picos de Europa","Caminito del Rey","Via Verde Tortosa-Puebla de Hijar","Peñarroya de Tastavins", "Tossal dels Tres Reis", "Torredembarra-Tibidabo(MTB)", "Torredembarra-Mataró(MTB)","Torredembarra-La Vinya (Alella)(MTB)"};
		Scanner console = new Scanner(System.in);
		System.out.println("Hola, ¿quieres ver las excursiones disponibles? (S/N)?");
		String v_answer = console.nextLine();
		if (v_answer.equalsIgnoreCase("S"))  {
			for (int i = 0; i < v_excursiones.length; i++) {
				System.out.println("Excursión "+ v_excursiones[i] + ". Interesado (S/N)?:");
				v_answer = console.next();
				if (v_answer.equalsIgnoreCase("S")) {
					System.out.println("Excursión " + v_excursiones[i] + " seleccionada.");
					System.out.println("Fin del programa.");
					break;
				}
			}
			
		} else {
			System.out.println("Fin del programa.");
		}
		
		
		
	}

}
