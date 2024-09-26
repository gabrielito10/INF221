import java.util.*;
public class While {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int contador1 = 1;
		System.out.println("Digite el valor maximo ");
		int maximo = x.nextInt();
		while (contador1 <= maximo)
		{
			System.out.println("La secuencia esta en " + contador1);
			//normal
			//contador1 = contador1 + 1;
			//con sobre carga de operadores
			//contador1 += 1;
			// con sobre carga de 1
			contador1++;
		}
		System.out.println("Digite el valor minimo");
		int minimo = x.nextInt();
		int contador2 = 20;
		while (contador2 >= minimo)
		{
			System.out.println("La secuencia esta en " + contador2);
			contador2--;
		}
	}
}

