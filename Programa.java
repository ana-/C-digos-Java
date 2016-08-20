import java.util.Scanner;

public class Programa{
	
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);	
		System.out.println("Digite o valor: ");
		double valor = entrada.nextDouble();
		//Cria um objeto de calculadora
		Calculadora calc = new Calculadora();
		double resultado = calc.divide(2, valor);
		System.out.println("Res: " + resultado);

		System.out.println("Digite o valor: ");
		valor = entrada.nextDouble();

		Imposto imposto = new Imposto();
		imposto.calculaImposto(valor);
		System.out.println("Imposto: " + imposto.retornaResultadoImposto());
	}

}
