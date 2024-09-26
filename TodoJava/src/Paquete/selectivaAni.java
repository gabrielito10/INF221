package Paquete;

import java.util.*;
public class selectivaAni {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Valor de A");
		int a = x.nextInt();
		System.out.println("Valor de B");
		int b = x.nextInt();
		System.out.println("Valor de C");
		int c = x.nextInt();
		if (a > b && a > c)
			System.out.println("El mayor es " + a);
		else if (b > a && b > c)
			System.out.println("El mayor es " + b);
		else 
			System.out.println("El mayor es " + c);
	}

}