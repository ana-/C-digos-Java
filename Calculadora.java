public class Calculadora{

	public double soma(double x, double y){
		return x + y;	
	}

	public double subtrai(double x, double y){
		return x - y;
	}

	public double multiplica(double x, double y){
		return x * y;
	}

	public double divide(double x, double y){
		if (y != 0){
			return x / y;
		} else {
			return 0;
		}
	}

}
