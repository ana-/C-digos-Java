public class Imposto{

	Calculadora calc = new Calculadora();
	double resultadoImposto;

	public void calculaImposto(double valor){
		double resultado;
		resultado = calc.multiplica(valor, 0.01);

		resultado = calc.divide(100, resultado);
		resultado = calc.soma(resultado, valor);
		resultadoImposto = resultado;
	}

	public double retornaResultadoImposto(){
		return resultadoImposto;
	}

}
