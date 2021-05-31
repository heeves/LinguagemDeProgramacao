import java.util.Scanner;

public class charAt {
	public static boolean  achaVogal(String s){
		for(int i=0;i<=255;i++){
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
				System.out.println(i);
			}
		return false;
		}
	//} 
public static void main(String[] args){
	String s;
	Scanner ent = new Scanner (System.in);
	System.out.println("Digite um texto");
	s = ent.nextLine();
	do{
	    System.out.println(achaVogal(s));
	 }while(true);
    }
}
