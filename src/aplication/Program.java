package aplication;

import java.util.Scanner;

import entities.Triangle;


// Solução de calcular a aréa de dois triangulos, sem a orientação a Objetos.
public class Program {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//
//		Double xA, xB, xC, yA, yB, yC;
//		
//		System.out.println("Enter the measures of triangules X:");
//		xA = sc.nextDouble();
//		xB = sc .nextDouble();
//		xC = sc.nextDouble();
//		
//		System.out.println("Enter the measures of triangules Y:");
//		yA = sc.nextDouble();
//		yB = sc .nextDouble();
//		yC = sc.nextDouble();
//
//		double p = (xA + xB + xC) / 2.0;
//		double areaX =  Math.sqrt( p * ( p -xA ) * ( p - xB) * (p -xC) );
//		
//		
//		p = (yA + yB + yC) / 2.0;
//		double areaY = Math.sqrt( p * (p - yA ) * (p - yB) * (p - yC) );
//		
//		System.out.printf("Triangulo X area: %.4f%n", areaX);
//		System.out.printf("Triangulo Y area: %.4f%n", areaY);
//		
//		if(areaX > areaY) {
//			System.out.println("Larger area: X");
//		}else {
//			System.out.println("Larger area: Y");
//		}		
//		sc.close();

		Scanner sc = new Scanner(System.in);	
	
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangules X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		

		
		double areaX =  x.area();
			
		System.out.println("Enter the measures of triangules Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		

		double areaY = y.area();		

		System.out.printf("Triangulo X area: %.4f%n", areaX);
		System.out.printf("Triangulo Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: Y");
		}		

		
		sc.close();
		
				
	}

}
