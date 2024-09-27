import java.util.*;
public class Incremento {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Digite valor de N");
		int N = x.nextInt();
		incremento(N);
	}
	
	//Creando la funcionde recursividad
	static void incremento(int n)
	{
		if (n >= 1)
		{
			    incremento(n-1);
			System.out.print(n);
		}
		else
			System.out.println();
		
	}
}
