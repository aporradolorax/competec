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


//ATT 2

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner p1 = new Scanner(System.in);
		String senha = "BATATA";
		String tent = p1.nextLine();
		
		if ( tent.equalsIgnoreCase (senha)){
		    System.out.println("parabens você acertou!!");
		   
		}
		else{
		    System.out.println("senha incorreta");
		}
		
		
		
		
	}
}




