package Testes;

public class Livro {

	private String autor;
	private String titulo;
	private int ano;
	private String ISBN;
	private boolean emprestado;

	public Livro() {
		emprestado = false;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String novoAutor) {
		autor = novoAutor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String novoTitulo) {
		titulo = novoTitulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String novoISBN) {
		ISBN = novoISBN;
	}
	
	public void setAno(int novoAno) {
		this.ano = novoAno;
	}
	
	public int getAno() {
		return ano;
	}
	
	public boolean getEmprestado() {
		return emprestado;
	}
	
	public void setEmprestado(boolean emprestado){
		this.emprestado = emprestado;
	}
	public void emprestar() {
		emprestado = true;
	}

}
