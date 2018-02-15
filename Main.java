public class Main{
	
	public static void main(String[] arg){
		System.out.println("");
		System.out.println("Area Y Perimetro de Figuras");
		System.out.println("");
		System.out.println("\n\n\t\tEjercicio No.2");
		System.out.println("");
		System.out.println("");

		//variables y numeros a evaluar en centimetros
		double ladosCuadrado = 30.3;
		double lado1Triangulo = 15.0;
		double lado2Triangulo = 24.0;
		double lado3Triangulo = 15.0;
		double alturaTriangulo = 0.0;
		double baseTriangulo = 24.0;
		double radioCirculo = 67.3 ;
		//resultados
		double totalAreaCuadrado,totalPerimetroCuadrado;
		double totalAreaTriangulo,totalPerimetroTriangulo;
		double totalAreaCirculo,totalPerimetroCirculo;


		//validacion del cuadrado
		totalAreaCuadrado = ladosCuadrado*ladosCuadrado;
		totalPerimetroCuadrado = ladosCuadrado*4;

		//validacion del triangulo
		alturaTriangulo=Math.sqrt((Math.pow(lado1Triangulo,2))-(Math.pow((baseTriangulo/2),2)));
		totalAreaTriangulo=baseTriangulo*alturaTriangulo;
		totalPerimetroTriangulo=lado1Triangulo+lado2Triangulo+lado3Triangulo;

		//validacion del circulo
		totalPerimetroCirculo=2*3.1416*radioCirculo;
		totalAreaCirculo=3.1416*(Math.pow(radioCirculo,2));


	}

}