package practica0_alled;

import java.util.Scanner;

public class clase_practica0 {
	public static void main(String[] args) {
	//recibe un néro lo convirte en el umbral y le suma o resta 1 de 1 en 1
	int umbral = 5;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Por favor escriba un entero:");
	
	int x = sc.nextInt();	
	//con esto guardo el int que he pedido a la gente en el entero x 
	if(x>umbral) 
		System.out.println("por encima del umbral");
	for(int i= x;i>umbral;i++){
		x++;
	}
	if(x==5)
		System.out.println("Has dado en el clavo!!");
	else
		System.out.println("por debajo de umbral");
		for(int i= x;i<umbral;i++){
			x++;
		}
	System.out.println(x);
	}
}

