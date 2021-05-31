import java .util.Scanner;
public class toLowerCase {
	public static boolean paraBaixo(String s){
		for(int i=0;i<=255;){
			s.toLowerCase();
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		String s;
		Scanner ent = new Scanner (System.in);
		System.out.println("Digite a senha: ");
		s = ent.nextLine();
		System.out.println(paraBaixo(s));
	}
}
