import java.util.Scanner;
public class replaceAll {
	public static boolean mudatudo(String s){
		for(int i = 0;i <= 255; i++){
			s.replaceAll("a", "e");
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		String s;
		Scanner ent = new Scanner(System.in);
		System.out.print("Digite a senha: ");
		s = ent.nextLine();
		System.out.print(mudatudo(s));
	}
}
