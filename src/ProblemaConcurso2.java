import java.util.ArrayDeque;
import java.util.Scanner;

public class ProblemaConcurso2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		sc.nextLine();
		for (int j = 0; j < c; j++) {
			ArrayDeque<String> simbolos = new ArrayDeque<String>();
			simbolos.add("Trebol");
			simbolos.add("Pica");
			simbolos.add("Corazón");
			simbolos.add("Rombo");
			ArrayDeque<String> simbolos2 = simbolos.clone();
			ArrayDeque<String> simbolos3 = simbolos.clone();
			boolean maquina = false;
			int dinMax = sc.nextInt();
			int contador = 0;
			String simb1 = null ;
			String simb2 = null;
			String simb3 = null;
			while (!maquina) {
				int tirada = (int) Math.floor(Math.random() * 24 + 1);
				for (int i = 0; i < tirada+2; i++) {
					String aux = simbolos.pollFirst();
					simbolos.addLast(aux);
					simb1 = aux;
				}
				for (int i = 0; i < tirada-3; i++) {
					String aux = simbolos2.pollLast();
					simbolos2.addFirst(aux);
					if (aux.equals(null)) {
						i--;
					}
					simb2 = aux;
				}
				for (int i = 0; i < tirada+4; i++) {
					String aux = simbolos3.pollFirst();
					simbolos3.addLast(aux);
					simb3 = aux;
				}
				System.out.println(simb1);
				System.out.println(simb2);
				System.out.println(simb3);
				System.out.println();
				contador++;
				if (simb1 == simb2 && simb2 == simb3) {
					maquina = true;
					System.out.println("PREMIO!");
				}
				if (contador == dinMax && !maquina) {
					maquina = true;
					System.out.println("NO TIENES PREMIO Y TE HAS DEJADO: " + contador + "€");
				}
			}	
		}
	}
}
