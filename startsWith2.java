import java.util.Scanner;
public class startsWith2 {
	public static boolean iniCom(String s){
		for(int i=0;i<=255;i++){
			if(s.startsWith("a", i) || s.startsWith("e", i) || s.startsWith("i", i) || s.startsWith("o", i) || s.startsWith("u", i))
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
		System.out.println(iniCom(s));
	}while(false);
}
}
