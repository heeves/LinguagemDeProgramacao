import java.util.Scanner;
public class indexOf {
	public static boolean primeira(String s){
		for(int i=0;i<=255;){
			s.indexOf(3);
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		String s;
		Scanner ent = new Scanner(System.in);
		System.out.print("Digite a senha: ");
		s = ent.nextLine();
		System.out.println(primeira(s));
	}
}
