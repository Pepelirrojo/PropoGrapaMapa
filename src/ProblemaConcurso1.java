import java.util.Scanner;

public class ProblemaConcurso1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] frase = sc.nextLine().split("\\s");
			for (int i = 0; i < frase.length; i++) {
				String[] silaba = frase[i].split("-");
				for (int j = 0; j < silaba.length; j++) {
					char vocal = silaba[j].toLowerCase().charAt(silaba[j].length() - 1);
					if (vocal != 97 && vocal != 101 && vocal != 105 && vocal != 111 && vocal != 117 && vocal != 121) {
						vocal = silaba[j].charAt(silaba[j].length() - 2);
					}
					String trad = silaba[j] + "p" + vocal;
					System.out.print(trad);	
				}
				System.out.print(" ");
			}
		}
	}
}
