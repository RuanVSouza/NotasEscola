package sistemaEscola;

import java.util.Locale;
import java.util.Scanner;

import entidades.Notas;

public class programa1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Notas notas = new Notas();
		
		System.out.println("Insira seu nome: ");
		notas.name = sc.nextLine();
		System.out.println("Insira suas notas: ");
		notas.nota1 = sc.nextDouble();
		notas.nota2 = sc.nextDouble();
		notas.nota3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE " + notas.media());
		if(notas.media() > 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f ", notas.missingPoint() );
		}
		
		sc.close();
	}

}
