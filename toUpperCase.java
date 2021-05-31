import java.util.Scanner;
public class toUpperCase {
	public static boolean paraCima(String s){
		for (int i=0;i<=255;){
			s.toUpperCase();
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		String s;
		System.out.print("Digite a senha: ");
		Scanner ent = new Scanner(System.in);
		s = ent.nextLine();
		System.out.println(paraCima(s));
	}

}
