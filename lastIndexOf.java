import java.util.Scanner;
public class lastIndexOf {
	public static boolean ultima(String s){
		for(int i = 0;i<=255;i++){
			s.lastIndexOf("a");
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		String s;
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite a senha: ");
		s = ent.nextLine();
		System.out.println(ultima(s));
	}
}
