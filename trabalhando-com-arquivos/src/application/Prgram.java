package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
		
		
//		String path = "/home/byaldo/teste.txt";
//
//		
//		try(BufferedReader br  = new BufferedReader(new FileReader(path))) {
//			
//			String line = br.readLine();
//			while(line != null ) {
//				System.out.println(line);
//				line = br.readLine();
//			}
//		} catch (IOException e) {
//			System.out.println("Error: " +e.getMessage());
//			
//		}
//	}

//		String [] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
//		String path = "/home/byaldo/teste-gravar-arquivo.txt";
//		
//		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path , true))) {
//			for(String line : lines) {
//				bw.write(line);
//				bw.newLine();
//			}
//		} catch (IOException e) {
//
//			e.printStackTrace(); 
//			
//		}

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter a folder path: ");
//		String	strPath = sc.nextLine();
//		
//		File path = new File(strPath);
//		File[] folders = path.listFiles(File::isDirectory);
//		System.out.println("Folders: ");
//		
//		for(File folder : folders) {
//			System.out.println(folder);
//		}
//		
//		File [] files = path.listFiles(File::isFile);
//		System.out.println("FILES: ");
//		
//		for(File file : files) {
//			System.out.println(file);
//		}
//		
//		boolean success = new File(strPath + "//subdir").mkdir();
//		
//		System.out.println("Directory created successfully: "+ success);
//		sc.close();
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path:");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("Get Name: "+ path.getName());
		
		System.out.println("Get Parent: "+ path.getParent());
		System.out.println("Get Path: "+ path.getPath());
		
		
		sc.close();
	}
}
















