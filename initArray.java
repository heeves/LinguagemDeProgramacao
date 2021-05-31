package Testes;
import java.util.Scanner;
public class initArray {
	public static void main(String args[]) {
		int v[] = new int[10];
		System.out.printf("%s%8s\n", "Indice", "Valor");
		for(int i = 0; i < v.length; i++)
			System.out.printf("%5d%8d\n", i, v[i]);
	}
}
