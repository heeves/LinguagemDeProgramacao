package Testes;

import java.util.Scanner;

public class Biblioteca {

	public static void main(String[] args) {

		Livro[] livros;
		int i;

		Scanner inTexto = new Scanner(System.in);
		Scanner inNumeros = new Scanner(System.in);

		System.out.println("Quantos livros tem na bilbioteca?");
		i = inNumeros.nextInt();

		// instanciacao do tamanho do vetor - todos referenciam NULO (null)
		livros = new Livro[i];

		System.out.println("----- CADASTRO DOS LIVROS -----");
		for (i = 0; i < livros.length; i++) {

			// instanciacao do objeto livro em uma posicao do vetor
			livros[i] = new Livro();

			// interacao com o usuario!
			System.out.println("Digite os dados do livro " + (i + 1));
			System.out.println("Digite o titulo:");
			livros[i].setTitulo(inTexto.nextLine());
			System.out.println("Digite o autor:");
			livros[i].setAutor(inTexto.nextLine());
			System.out.println("Digite o ISBN:");
			livros[i].setISBN(inTexto.nextLine());
			System.out.println("Digite o ano:");
			livros[i].setAno(inNumeros.nextInt());

		}

		int op, contador;
		String titulo, isbn;
		boolean achou;
		do {
			System.out.println("----- MENU -----");
			System.out.println("1. Buscar titulo");
			System.out.println("2. Emprestar livro ISBN)");
			System.out.println("3. Relatorio");
			System.out.println("4. Sair");
			op = inNumeros.nextInt();
			switch (op) {
			case 1:
				System.out
						.println("Digite o titulo do livro que esta procurando:");
				titulo = inTexto.nextLine();

				achou = false;
				for (i = 0; i < livros.length; i++) {
					if (titulo.equals(livros[i].getTitulo())) {
						System.out.println("Titulo: " + livros[i].getTitulo());
						System.out.println("Autor: " + livros[i].getAutor());
						System.out.println("Ano: " + livros[i].getAno());
						System.out.println("ISBN: " + livros[i].getISBN());
						System.out.println("Emprestado? "
								+ livros[i].getEmprestado());
						achou = true;
					}
				}

				if (achou == false) {
					System.out.println("Livro '" + titulo
							+ "' nao foi encontrado!");
				}

				break;

			case 2:
				System.out
						.println("Digite o ISBN do livro que esta procurando:");
				isbn = inTexto.nextLine();

				for (i = 0; i < livros.length; i++) {
					if (isbn.equals(livros[i].getISBN())) {
						if (livros[i].getEmprestado() == true) {
							System.out.println("O Livro ja esta emprestado!");
						} else {
							livros[i].emprestar();
							System.out.println("Livro emprestado!");
						}
					}
				}
				break;

			case 3:
				contador = 0;
				for (i = 0; i < livros.length; i++) {
					if (livros[i].getEmprestado() == true) {
						System.out.println("Titulo: " + livros[i].getTitulo());
						System.out.println("Autor: " + livros[i].getAutor());
						System.out.println("Ano: " + livros[i].getAno());
						System.out.println("ISBN: " + livros[i].getISBN());
						System.out.println("Emprestado? "
								+ livros[i].getEmprestado());
						contador++;
					}
				}
				System.out.println("Total de livros emprestados: " + contador);
				System.out.println("Livros disponiveis: "
						+ (livros.length - contador));
				for (i = 0; i < livros.length; i++) {
					if (livros[i].getEmprestado() == false) {
						System.out.println("Titulo: " + livros[i].getTitulo());
						System.out.println("Autor: " + livros[i].getAutor());
						System.out.println("Ano: " + livros[i].getAno());
						System.out.println("ISBN: " + livros[i].getISBN());
						System.out.println("Emprestado? "
								+ livros[i].getEmprestado());
					}
				}

				break;

			case 4:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opcao invalida!");
				break;
			}

		} while (op != 4);

	}
}
