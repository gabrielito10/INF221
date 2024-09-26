import java.util.*;
public class For {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Digite valor maximo");
		int maximo = x.nextInt();
		for (int i=1 ; i <= maximo ; i++)
		{
			System.out.println("La secuencia esta en " + i);
		}
		
		System.out.println("Digite valor minimo");
		int minimo = x.nextInt();
		for (int i=20 ; i >= minimo ; i--)
		{
			System.out.println("La secuencia esta en " + i);
		}
	}

}
