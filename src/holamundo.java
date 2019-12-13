import java.util.Scanner;


public class holamundo {

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
