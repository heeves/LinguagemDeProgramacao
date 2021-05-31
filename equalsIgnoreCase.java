import java.util.Scanner;
public class equalsIgnoreCase {
	public static boolean compara(String s){
		for(int i = 0; i<=255;){
			s.equalsIgnoreCase("arara");
			return true;
		}
		return false;
	}
	public static  void main(String[] args){
		String s;
		Scanner ent = new Scanner(System.in);
		System.out.print("Digite a senha: ");
		s = ent.nextLine();
		System.out.println(compara(s));
	}
}
