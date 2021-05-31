import java.util.Scanner;
public class substring{
	public static boolean iniciofim(String s){
		for(int i = 0; i <= 255; i++){
			s.substring(3, 6);
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		String s;
		Scanner ent = new Scanner(System.in);
		System.out.print("Digite a senha: ");
		s = ent.nextLine();
		System.out.print(iniciofim(s));
	}
}
