import java.util.*;
public class SumaNumeros {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Digite valor de N");
		int N = x.nextInt();
		System.out.println(suma(N));
	}
	static int suma(int n)
	{
		if (n == 1)
			return 1;
		else
			return  n + suma(n - 1);
	}

}
