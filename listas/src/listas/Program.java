package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		String[] vetor = new String[5];
		
		vetor[0] = "Teste";
		vetor[1] = "Teste1";
		vetor[2] = "Teste2";
		vetor[3] = "Teste3";
		vetor[4] = "Teste4";
		
		for(String x: vetor) {
			System.out.println(x);
		}
		
		System.out.println();
		list.add("maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Any");
		
		
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------------------------------------");
		
		list.add(2, "Aldo");
		
		list.remove("maria");
		list.remove(1);
		
		for(String x : list) {
			System.out.println(x);
		}
		
		
		System.out.println("---------------------------------------------------------------");
		
		List<String> result = list.stream()
				.filter( x-> x.charAt(0) == 'A')
				.collect(Collectors.toList());
		
		
		for(String x : result) {
			System.out.println(x);
		}
	}
}














