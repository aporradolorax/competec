import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner p1 = new Scanner (System.in);
	    
	    String nome = p1.nextLine();
	    int tamanho = nome.length();  
		System.out.println(nome+" tem "+tamanho+" letras");
	}
}
