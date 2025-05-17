public class Main
{

	public static void main(String[] args) {
    Scanner p1 = new Scanner (System.in);
    Scanner p2 = new Scanner (System.in);
    
	    System.out.println("quanto dinheiro você tem?");
	    Double money = p2.nextDouble();
	    
	    System.out.println("escolha um pedido pelo numero");
	    System.out.println(" ");
    System.out.println("1 feijoada R$22,00");
    System.out.println(" ");
    System.out.println("2 macaco R$30,00");
    System.out.println(" ");
    System.out.println("3 vrido R$5,00");
    System.out.println(" ");
    System.out.println("4 milf R$150,00");
    int pedido = p1.nextInt();
    
    switch(pedido){
    
    case 1;
        if (money >= 22)
        System.out.println("boa refeição");
        
        else (money <= 22);
        System.out.println("você passara fome hoje");
        break;
        
    case 2; 
        if (money >= 30)
        System.out.println("boa refeição");
       
        else (money <= 30);
        System.out.println("você passara fome hoje");
        break;
        
    case 3;
        if (money >= 5)
        System.out.println("boa refeição");
        
        else (money <= 5);
        System.out.println("você passara fome hoje");
        break;
        
    case 4;
        if money >= 150
        System.out.println("boa refeição");
        
        else (money <= 150);
        System.out.println("você passara fome hoje");
        break;
   
    
	}
    
}
	}
}
