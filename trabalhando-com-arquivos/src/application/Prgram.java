package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Prgram {
	public static void main(String[] args) {
		
//		File file = new File("/home/byaldo/teste.txt");
//		Scanner sc =null;
//		
//		try {
//			sc = new Scanner(file);
//			while(sc.hasNextLine()) {
//				System.out.println(sc.nextLine());
//			}
//			
//
//		} catch (Exception e) {
//			
//			System.out.println();
//		} finally {
//			if( sc != null) {
//				sc.close();
//			}
//		}
		
		
		String path = "/home/byaldo/teste.txt";

		
		try(BufferedReader br  = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while(line != null ) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " +e.getMessage());
			
		}
	}

}











