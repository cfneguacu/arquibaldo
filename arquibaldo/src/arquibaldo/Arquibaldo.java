package arquibaldo;

public class Arquibaldo {

	public static void main(String[] args) {
		
		double interno = 2;
		double externo = 1;
		double temp;
		
		temp = interno;
		
		if(interno > externo) {
			
			interno = externo;
			externo = temp;

		}
		
		double a = 2;
		double b = interno*2; 
		double c = interno - (externo*externo);
		
		double delta;
		double x1;
		double angulo;
		
		delta = b*b - 4*a*c;
		
		x1 = (- b + Math.sqrt(delta))/(2*a);	
		
		angulo = (int)(Math.toDegrees(Math.acos((x1+interno)/externo)));
		
		if(angulo!=0) {

		System.out.println((int)angulo);
		
		}else {
			
		System.out.print("Não existe tal triangulo");
			
		}
	}
}
