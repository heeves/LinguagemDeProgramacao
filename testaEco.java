package Entregas;

public class testaEco {
	public static void main(String[] args){
		Eco e = new Eco();
		int i, cont, cont2;
		cont = 0;
		cont2 = 0;
		for( i = 0;i < 4; i++) {//0|1|3|4
			e.ola();
			cont += 1;
			if (i == 3)
				cont += 1;//1|2|4|5				
			if (i > 0)
				cont2 = cont + cont;
		}
		System.out.println("A resposta é: "+ cont2);
	}
}
