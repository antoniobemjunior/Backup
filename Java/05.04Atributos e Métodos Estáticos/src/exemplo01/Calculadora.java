package exemplo01;

public class Calculadora {

	//Somar
	public static void somar(int valor1, int valor2) {
		System.out.println("A soma é " + (valor1+valor2) + ".");
	}
	
	//Subtracao
	public static int subtrair(int valor1, int valor2){
		return (valor1-valor2);
	}
	
	//Dividir
	public static double divisao(double valor1, double valor2){
		return (valor1/valor2);
	}
		
	//Multiplicar
	public static double multiplicacao(double valor1, double valor2){
		return (valor1*valor2);
	}
	
}
