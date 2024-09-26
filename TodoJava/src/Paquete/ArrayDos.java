package Paquete;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayDos {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Digite longitud --> ");
		int N = x.nextInt();
		int[] numeros = new int[N];
		for (int i=0 ; i < N ; i++)
		{
			System.out.println("Valor en la posicion " + i);
			numeros[i] = x.nextInt();
		}
		Arrays.sort(numeros);
		// imprmiendo el array ordenado
		for (int i=0 ; i < N ; i++)
		{
			System.out.println(numeros[i]);
		}
	}

}

