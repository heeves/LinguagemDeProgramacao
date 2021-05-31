import java.util.Scanner;


public class startsWith {
	public static boolean iniCom(String s){
		for(int i=0;i<=255;i++){
			if(s.startsWith("a") || s.startsWith("e") || s.startsWith("i") || s.startsWith("o") || s.startsWith("u"))
				return true;
			}
		return false;
		}
	public static void main(String[] args){
		String s;
		System.out.print("Digite a senha: ");
		Scanner ent = new Scanner (System.in);
		s = ent.nextLine();
		do{
			System.out.println(iniCom(s));
		}while(false);
	}
}
