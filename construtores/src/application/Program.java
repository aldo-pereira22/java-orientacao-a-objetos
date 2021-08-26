package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
			
		System.out.println("Enter Product data");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		
		
		System.out.println("Price: ");
		double price = sc.nextDouble();
		
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println("Product data: " +product);
		
		
		System.out.println("Enter the number of prodcuts to be added in stock! ");
		quantity = sc.nextInt();
		
		product.addProducts(quantity);

		
		System.out.println();
		System.out.println("Update data: " +product);

		System.out.println("Enter the number of prodcuts to be removed from stock! ");
		quantity = sc.nextInt();
		
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Removeded data: " +product);		
		
		sc.close();

		sc.close();
	}

}
