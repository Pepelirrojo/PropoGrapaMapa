import java.util.ArrayDeque;
import java.util.Scanner;

public class ProblemaConcurso2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<String> simbolos = new ArrayDeque<String>();
		simbolos.add("Trebol");
		simbolos.add("Pica");
		simbolos.add("Corazón");
		simbolos.add("Rombo");
		ArrayDeque<String> simbolos2 = simbolos.clone();
		ArrayDeque<String> simbolos3 = simbolos.clone();
		boolean maquina = false;
		int contador = 0;
		while (!maquina) {
			String simb1 = null ;
			String simb2 = null;
			String simb3 = null;
			int tirada = (int) Math.floor(Math.random() * 24 + 1);
			for (int i = 0; i < tirada; i++) {
				String aux = simbolos.pollFirst();
				simbolos.addLast(aux);
				simb1 = aux;
			}
			for (int i = 0; i < tirada-3; i++) {
				String aux = simbolos2.pollLast();
				simbolos2.addFirst(aux);
				simb2 = aux;
			}
			for (int i = 0; i < tirada+4; i++) {
				String aux = simbolos3.pollFirst();
				simbolos3.addLast(aux);
				simb3 = aux;
			}
			contador++;
			System.out.println(simb1);
			System.out.println(simb2);
			System.out.println(simb3);
			contador++;
			if (simb1 == simb2 && simb2 == simb3) {
				maquina = true;
				System.out.println("PREMIO!");
			}
			if (contador == 10) {
				maquina = true;
				System.out.println("NO TIENES PREMIO Y TE HAS DEJADO: " + contador + "€");
			}
		}
		
	}
}
