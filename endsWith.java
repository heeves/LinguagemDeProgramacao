
import java.util.Scanner;


public class endsWith {
	public static boolean fimCom(String s){
		for(int i=0;i<=255;i++){
			if(s.endsWith("a") || s.endsWith("e") || s.endsWith("i") || s.endsWith("o") || s.endsWith("u"))
				return true;
		}
		return false;
	}
		public static void main(String[] args){
		String s;
		Scanner ent = new Scanner (System.in);
		System.out.print("Digite a senha: ");
		s = ent.nextLine();
		do{
			System.out.println(fimCom(s));
		}while(false);
	}
}
