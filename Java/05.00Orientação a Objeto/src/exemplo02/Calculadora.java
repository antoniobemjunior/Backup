package exemplo02;

public class Calculadora {

	//Soma
	void somar(int valor1, int valor2) {
		System.out.println("A soma é " + (valor1+valor2) + ".");
	}
	
	//Subtracao
	int  subtrair(int valor1, int valor2){
		return (valor1-valor2);
	}
	
	//Divisão
	double  divisao(double valor1, double valor2){
		return (valor1/valor2);
	}
		
	//Multiplicacao
	double multiplicacao(double valor1, double valor2){
		return (valor1*valor2);
	}
	
}
