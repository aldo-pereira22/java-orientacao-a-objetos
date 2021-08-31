package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		
		System.out.println("Enter the number of employees");
		int n = sc.nextInt();
		
		
		for(int i =1; i <= n; i++) {
			System.out.println("Employee #" + i+ " Data: ");
			System.out.println("outsourced: (y/n) ? ");
			char ch = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per Hour: ");
			double valuePerHour = sc.nextDouble();
			
			
			if( ch == 'y'  ||  ch == 'Y') {
				System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();
		
				list.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
			}else {

				list.add( new Employee(name, hours, valuePerHour));
			}
		}
		System.out.println();
		
		System.out.println("PAYMENTS: ");
		
		for(Employee emp : list) {
			System.out.println(emp.getName()+" - $ " + String.format("%.2f", emp.payment() ) );
		}
		
		sc.close();
	}
}















