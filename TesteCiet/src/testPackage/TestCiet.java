package testPackage;

import java.util.Scanner;

public class TestCiet {

	public static void main(String[] args) {				
		
		menuOpcoes();				
	}
	
	static void menuOpcoes() {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Teste 1.......[1]");
		System.out.println("Teste 2.......[2]");
		System.out.println("Teste 3.......[3]");
		System.out.print("Selecione a op��o desejada: ");
		
		int resp = ler.nextInt();
		ler.close();
		
		opcoesTestes(resp);		
	}
	
	static void opcoesTestes(int resp) {
		
			switch(resp) {
			
			case 1:
				
				System.out.println("..:Op��o 1:..");			
					Teste1.teste1();
				
				break;
			case 2:
				
				System.out.println("..:Op��o 2:..");			
				Teste2.teste2();
				
				break;
			case 3:
				
				System.out.println("..:Op��o 3:..");			
				Teste3.teste3();
				
				break;
			default:
				
				System.out.println("..:Op��o inexistente:..");
				break;			
		}
		
	}

}
