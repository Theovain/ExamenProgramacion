import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		//datos
		String[] alumnos = {"Carlos", "Ana", "Eva", "Antonio", "Elena", "Sara"};                 //Arrays dados por el ejercicio
		double[] notas = {4.25, 6.50, 7.75, 5.80, 3.75, 8.00};
		double mayorNota = 0;																	 //Variable que almacena la nota de corte
		int alumno=0;                                                                            //Variable para controlar a que alumno pertenece x nota
		double media = 0;																		 //Variable que guarda la media
		double notaCorte = 0;                                                                    //Variable que guarda la nota de corte introducida por teclado
		
		//programa
		
		//MAYOR NOTA
		for(int i=0; i<notas.length; i++) {
			if(notas[i]>mayorNota) {
				mayorNota=notas[i];
				alumno=i;
			}
		}
		System.out.println("La mayor nota es "+mayorNota+", y pertenece a "+alumnos[alumno]);
		
		//MEDIA
		for(int i=0; i<notas.length; i++) {
			media+=notas[i];
		}
		media/=notas.length;
		System.out.println("La media es "+media);
	
		//NOTA DE CORTE
		System.out.println("Introduce la nota de corte");
		
		Scanner lector = new Scanner(System.in);
		notaCorte=lector.nextDouble();
		
		for(int i=0; i<notas.length; i++) {
			if(notas[i]>=notaCorte) {
				alumno=i;
				System.out.println(alumnos[alumno]+" supera la nota de corte de "+notaCorte);
			}
		}
	}

}
