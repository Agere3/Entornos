package ej4uf3;

import java.io.*;

public class ejercicio4 {

	public static void main(String[] args) throws IOException {
		System.out.print("Entra número: ");
		int numero = pedirNumero();
		System.out.println(calcularResultado(numero));
	}
	
	
	public static int pedirNumero() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int numero = Integer.parseInt(reader.readLine());
		while (numero <= 0) {
			System.out.print("Error. Introduce un número positivo");
			System.out.print("Entra nuevo número: ");
			numero = Integer.parseInt(reader.readLine());
		}
		reader.close();
		return numero;
	}
	
	
	public static int calcularResultado(int numero) {
		int resultado = 1;
		while (numero > 0) {
			resultado = resultado * numero;
			numero--;
		}
		return resultado;
	}

}
