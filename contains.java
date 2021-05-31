import java.util.Scanner;
public class contains {
	public static boolean contem(String s){
		for(int i=0; i<=255;i++){
			s.contains(s);
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		String s;
		Scanner ent = new Scanner(System.in);
		System.out.print("Digite a senha: ");
		s = ent.nextLine();
		System.out.print(contem(s));
	}
}
