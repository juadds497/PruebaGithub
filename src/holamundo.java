import java.util.Scanner;

public class holamundo {

	
	public static int suma (){
		int sum;
		int numero1 = 5;
		int numero2 = 8;
		sum = numero1 + numero2;
		return sum;
	}
	public static int resta (){
		int resta;
		int numero1 = 5;
		int numero2 = 8;
		resta = numero1 - numero2;
		return resta;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros;
		int numero;
		System.out.print("Introduce cuantos numeros");
		numero=teclado.nextInt();
		numeros = new int[numero];
		for (int i =0;i>=numeros.length;i++) {
			System.out.print("Introduce un numero");
			numeros[i] = teclado.nextInt();
		}
		String c = ""; 
		for (int a =numeros.length-1;a>=0;a--) {
			System.out.print(a + "-");
		}
	}
}
