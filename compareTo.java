import java.util.Scanner;
public class compareTo {
	public static boolean compare(String s){
		for(int i = 0; i<=255;i++){
			s.compareTo("arara");
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		String s;
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite a senha: ");
		s = ent.nextLine();
		System.out.println(compare(s));
	}
}
