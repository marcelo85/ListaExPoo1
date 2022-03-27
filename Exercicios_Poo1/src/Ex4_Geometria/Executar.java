package Ex4_Geometria;

public class Executar {

	public static void main(String[] args) {
		
		Quadrado q1 = new Quadrado(5);
		Quadrado q2 = new Quadrado(8);

		Triangulo t1 = new Triangulo(5,7,3,3);
		Triangulo t2 = new Triangulo(8,6,4,4);

		Circulo c1 = new Circulo(5);
		Circulo c2 = new Circulo(8);

		String quadrado1 = "A �rea do quadrado q1 �: "+q1.calculaArea()+"\n" + "E o perimetro �: "+q1.calculaPerimetro();
		String quadrado2 = "A �rea do quadrado q2 �: "+q2.calculaArea()+"\n" + "E o perimetro �: "+q2.calculaPerimetro();

		String triangulo1 = "A �rea do triangulo t1 �: "+t1.calculaArea()+"\n" + "E o perimetro �: "+t1.calculaPerimetro();
		String triangulo2 = "A �rea do triangulo t2 �: "+t2.calculaArea()+"\n" + "E o perimetro �: "+t2.calculaPerimetro();

		String circulo1 = "A �rea do circulo c1 �: "+c1.calculaArea()+"\n" + "E o perimetro �: "+c1.calculaPerimetro();
		String circulo2 = "A �rea do circulo c2 �: "+c2.calculaArea()+"\n" + "E o perimetro �: "+c2.calculaPerimetro();

		}

	}

}
