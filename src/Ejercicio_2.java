
public class Ejercicio_2 {

	public static void main(String[] args) {
		//datos											//Apartado para variables.
		int numero=1;									//Variable para los numeros.
		char letra = 'F';								//Variable para las letras.
		
		//programa
		do {											//Bucle que repite el proceso hasta llegar aa los valores indicados.
			System.out.println(numero+"----"+letra);	//Muestra el numero con su letra. 
			numero++;									
			letra++;
			if(letra=='J') {                            //Controla que tras llegar a la letra I se vuelva a la F.
				letra='F';
			}
		}while(numero!=27);								//Cierre del bucle
		
		System.out.println("Fin del Programa");			//Indica el fin del programa
	}

}
