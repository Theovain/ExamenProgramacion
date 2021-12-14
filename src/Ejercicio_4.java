import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		//datos
		int numero = 0;								//Numero introducido por teclado.
		int numAnterior = 0;                        //Almacena el numero anterior.
		int numActual = 0;                          
		int numSiguiente = 0;						//Almacena el numero siguiente de la sucesion.
		
		//programa
		System.out.println("Introduce un numero para crear una sucesion de Fibonacci hasta el");
		Scanner lector = new Scanner(System.in);
		numero=lector.nextInt();
		
		do {										//Bucle que crea la sucesion.
			
		if(numActual==0) {							//Imprime los primeros numeros de la sucesion.
			System.out.println(numActual);
			numAnterior=numActual;
			numActual++;
			System.out.println(numActual);
		}
		
		
		else {										//Continua la sucesio.
			numSiguiente=numAnterior+numActual;
			numAnterior=numActual;
			numActual=numSiguiente;
			System.out.println(numSiguiente);
		}
			
		}while(numActual+numAnterior<numero);       //Finaliza la sucesion
		
		if (numero==numActual+numAnterior) {        //Añade a la sucesion el numero introducido por teclado si este
		System.out.println(numero);  				//puede formar parte de dicha sucesion
		}
	}

}
