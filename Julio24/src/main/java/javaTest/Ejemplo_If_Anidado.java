package javaTest;

public class Ejemplo_If_Anidado {

	public static void main(String[] args) {
		int temperatura = 16;
		
		if(temperatura > 15) 
		{
			if(temperatura > 25) 
			{
				System.out.println("A la playaa!!");
			} else {
				System.out.println("A la Montaña!!");
			}
		}else {
			System.out.println("A descanzar zzzz....");
		}

	}

}
