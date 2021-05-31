package Heranca;

import java.util.Scanner;

public class Bilheteria {
	public static void main(String[] args){
		
		int i, q = 0;
		//Pessoa[] pessoas; Não consegui trabalhar com vetor e herança na mesma aplicação
		//pessoas = new Pessoa[i];
		Scanner inTexto = new Scanner(System.in);
		Scanner inNumeros = new Scanner(System.in);
		do{
			System.out.println("############## Venda de ingressos #################");
			Pessoa pessoas/*[i]*/ = new Pessoa();
			//Crianca criancas = new Crianca();
			//Idoso idosos = new Idoso(); Eu tentei colocar os outros objetos da aplicação mas, não consgui dar nenhuma funcionalidade pra eles
			System.out.println("Digite sua idade: ");
			pessoas/*[i]*/.setIdade(inNumeros.nextInt());
			System.out.println("Digite o seu nome: ");
			pessoas/*[i]*/.setNome(inTexto.nextLine());
			Object o;
			o = pessoas;
			pessoas = null;
			System.out.println("**********************");
			System.out.println("Imprimindo o bilhete");
			System.out.println(o);
			System.out.println("***************************");
			System.out.println("Vai fazer outra venda?");
			q = inNumeros.nextInt();
		}while(q != 0);
	}
}

