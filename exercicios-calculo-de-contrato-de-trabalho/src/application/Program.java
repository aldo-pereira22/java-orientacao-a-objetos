package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		System.out.print("Enter departament's name: ");
		String departamentname = sc.nextLine();
		
		System.out.print("Enter Worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		
		
		
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		
		System.out.print("Salary:  ");
		double baseSalary = sc.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departamentname));

		System.out.print("How many contracts to this worker ?");
		int n = sc.nextInt();
		
		for(int i = 1; i < n; i++) {
			System.out.print("Enter contratct"+ i +" data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date dateContract = sdf.parse(sc.next());
			System.out.print("Value per hour:  ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (Hours) ");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(dateContract, valuePerHour, hours);
			
			worker.addContract(contract);
			
		}
		
		System.out.println();
		
		System.out.print("Enter month and year to calculate income: (MM/YYYY): ");
		String monthAndYear =  sc.next();
		int month = Integer.parseInt( monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));	
		
		System.out.println(("Name: "+worker.getName()));
		System.out.println("Departement: "+ worker.getDepartment().getName());
		System.out.println("Income for :" +monthAndYear + " : " + String.format("%.2f", worker.income(year, month) ));
		
		sc.close();
	}
}























