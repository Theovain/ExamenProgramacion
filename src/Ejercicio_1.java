
public class Ejercicio_1 {

	public static void main(String[] args) {
		//datos (variables con las que voy a trabajar)
		int numero=1001;                                   //Simplemente el numero inicial de la cuenta atras.
		int contador=0;                                   //Para controlar cuando aparezcan los **.
		
		//programa 
	do {												  //Uso un do while para crear un proceso repetitivo de cuenta atras.
		if(numero>1) {	   								  //Un if para controlar cuando el numero es mayor a 1.
			numero-=100;
			contador++;
			if(contador==4) {								//Dentro usamos otro if para controlar con el 
				System.out.println("***"+numero+"***");		//"controlador" donde iran los "*".
				contador=0;
			}
			
			else {											//Este else imprime los numeros sin "*" cuando
				System.out.println(numero);					//no deben tenerlos.
			}
		}
		
		else if(numero==1) {								//Este if se encarga de segir restando cuando	
			numero-=1;										//el numero llegue a 1 y no se le pueda restar
			contador++;										//100 para llegar a 0.
			System.out.println(numero);
		}
		
	}while(numero!=0);                                      //Hace que el bucle se repita mientras que el
	                                                        //"numero" no sea 0. 
	System.out.println("Fin del Programa");                 //Indica la finalizacion del programa.
	}
}
	
	