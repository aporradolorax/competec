//att 1

import java.util.Scanner;
public class Main
{
    
	public static void main(String[] args) {
	Scanner p1 = new Scanner (System.in);
	System.out.println("digite uma palavra");
	String palavra = p1.nextLine();
	
	int num = 1;
    
    while (num<5){
    
    System.out.println(palavra);
    num ++ ;}
    
	}
}


//att 2


import java.util.Scanner;
public class Main
{
    
	public static void main(String[] args) {
	Scanner p1 = new Scanner (System.in);

	int num = 1;
	int soma = 2;
    
    while (soma<100){
        
    int num2= num + soma;
    System.out.println(num+ "+"+soma+ "="+num2);
    num = num2;
    soma ++ ;
        
    }

    
	}
}



//att 3

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner p1 = new Scanner (System.in);
	
	System.out.println("escolha um numero");
	int num = p1.nextInt();
	
	//int mult = 1

    for (int mult = 1; mult<11; mult++){
    int res= num*mult;
    System.out.println(num+ " * "+mult+" = "+res);
    
    
    }
    
	}
}
