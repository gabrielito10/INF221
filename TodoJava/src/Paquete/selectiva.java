package Paquete;

import java.util.*;
public class selectiva {

	public static void main(String[] args) {
		//La siguiente linea si o si
		Scanner x = new Scanner(System.in);
		System.out.println("Intruduzca una nota");
		int nota = x.nextInt();
		if (nota >= 51)
		{
			System.out.println("Ud. Aprobo");
		}
		else
		{
			System.out.println("Ni modo se lanzo");
		}
	}

}