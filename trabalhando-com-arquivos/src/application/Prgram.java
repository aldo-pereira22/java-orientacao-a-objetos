package application;

import java.io.File;
import java.util.Scanner;

public class Prgram {
	public static void main(String[] args) {
		
		File file = new File("/home/byaldo/teste.txt");
		Scanner sc =null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			

		} catch (Exception e) {
			
			System.out.println();
		} finally {
			if( sc != null) {
				sc.close();
			}
		}
		
	}

}
