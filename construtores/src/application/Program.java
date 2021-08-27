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
		
		
		Product product = new Product(name, price);

		
		product.setName("Computador");
		System.out.println("Update name: "+product.getName());
		product.setPrice(1200.00);
		System.out.println("Update price: "+product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " +product);
		
		
		System.out.println("Enter the number of prodcuts to be added in stock! ");
		int quantity = sc.nextInt();
		
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
