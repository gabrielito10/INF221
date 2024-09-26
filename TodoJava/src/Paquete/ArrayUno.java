package Paquete;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayUno {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		// declarando un array con un tamaño fijo
		char[] letras = new char[5];
		letras[0] = 'c';
		letras[1] = 'a';
		letras[2] = 'z';
		letras[3] = 'x';
		letras[4] = 'e';
		//imprimmiendo un valor del array
		System.out.println(letras[2]);
		//imprimiendo todo el array
		System.out.println("-----------------------");
		for(int i=0 ; i < letras.length ; i++)
		{
			System.out.println(letras[i]);
		}
		//Ordenando el array
		Arrays.sort(letras);
		System.out.println("-----------------------");
		for(int i=0 ; i < letras.length ; i++)
		{ 
			System.out.println(letras[i]);
		}
		// declarando un array con varios elementos
		int [] numeros = {5, 8, 3, 10, 7, 6};
		Arrays.sort(numeros);
		System.out.println("-----------------------");
		for(int i=0 ; i < numeros.length ; i++)
		{ 
			System.out.println(numeros[i]);
		}
	}

}
