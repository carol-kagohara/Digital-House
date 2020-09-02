package geometria;

public class Raio {
	double raio;
	
	public static double pi = 3.1415;

	public static double circunferencia(double raio) {
		return 2 * Math.PI * raio;
	}
	
	public static double volume(double raio) {
		return 4 * Math.PI * Math.pow(raio,3.0) / 3.0;
	}
}
