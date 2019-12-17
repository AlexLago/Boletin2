/*Realizar un programa con tres opciones.
 * Realizar la multiplicación
 * La división entera 
 * Y el cálculo del resto entre dos números solicitados al usuario
 * Cada operación(multiplicación, división y cálculo de resto) deberá realizarse mediante el uso de funciones
 * y tan sólo podrán realizarse las operaciones mediante sumas o restas 
 *(no usar los operadores * ni / ni tampoco funciones de Math)*/

import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean valorCorrecto = false;
		while(!valorCorrecto) {
			System.out.printf("¿Que operación desea realizar?:%n%n1-Realizar una Multiplicación.%n2-Realizar una División"
					+ " Entera.%n3-Conocer el Resto de una División entre dos números.%n4-Cerrar programa.%n%n");
			int Selección = 0;
			Selección = s.nextInt();
			switch(Selección) {
				case 1:
					System.out.printf("Indique el primer número a multiplicar.%n%n");
					int multiplicacion1 = 0;
					multiplicacion1=obtenerNumeroPositivo();
					System.out.printf("Indique el segundo número a multiplicar%n%n");
					int multiplicacion2 = 0;
					multiplicacion2=obtenerNumeroPositivo();
					int resultadoMultiplicacion = 0;
					if(multiplicacion1 == 0) {
						resultadoMultiplicacion = 0;
					}
					else if(multiplicacion2 == 0) {
						resultadoMultiplicacion = 0;
					}
					else if(multiplicacion1 < multiplicacion2){
						for(int i = 0; i < multiplicacion2; i++ ) {
							resultadoMultiplicacion = resultadoMultiplicacion + multiplicacion1;
						}
					}
					else{
						for(int i = 0; i < multiplicacion1; i++ ) {
							resultadoMultiplicacion = resultadoMultiplicacion + multiplicacion2;
						}
					}
					System.out.printf("El resultado de multiplicar %d y %d es %d%n%n", multiplicacion1 ,multiplicacion2 ,resultadoMultiplicacion);
					valorCorrecto = false;
					break;
				case 2:
					System.out.printf("Indique el dividendo.%n%n");
					int dividendo = 0;
					dividendo = obtenerNumeroPositivo();
					System.out.printf("Indique el divisor.%n%n");
					int divisor = 0;
					divisor = obtenerNumeroPositivo();
					int cociente = 0;
					int dividendoDivisión = dividendo;
					if(dividendo == 0) {
						cociente = 0;
					}
					else if(divisor == 0) {
						System.out.printf("No se puede dividir entre 0.%n%n");
						valorCorrecto = false;
						break;
					}
					else {
						while(dividendoDivisión > 0) {
							cociente++;
							dividendoDivisión = dividendoDivisión - divisor;
						}
					}
					System.out.printf("El resultado de dividir %d entre %d es %d%n%n",dividendo ,divisor ,cociente);
					valorCorrecto = false;
					break;
				case 3:
					System.out.printf("Indique el dividendo.%n%n");
					int dividendoResto = 0;
					dividendoResto = obtenerNumeroPositivo();
					System.out.printf("Indique el divisor.%n%n");
					int divisorResto = 0;
					divisorResto = obtenerNumeroPositivo();
					int resto = dividendoResto;
					if(dividendoResto == 0) {
						resto = dividendoResto;
					}
					else if(divisorResto == 0) {
						System.out.printf("No se puede dividir entre 0.%n%n");
						valorCorrecto = false;
						break;
					}
					else {
						while(resto >= divisorResto) {
							resto = resto - divisorResto;
						}
					}
					System.out.printf("El resto al dividir %d entre %d es %d%n%n",dividendoResto ,divisorResto ,resto);
					valorCorrecto = false;
					
					break;
				case 4:
					System.out.printf("Saliendo ...%n%n");
					valorCorrecto = true;
					break;
			}
		}
		System.out.printf("Has salido con éxito.");
		s.close();
	}//main
	private static int obtenerNumeroPositivo()
	{
		boolean valorCorrecto;
		int num=0;
		Scanner s= new Scanner(System.in);
		do {
			if(s.hasNextInt()) {
				num = s.nextInt();
				if(num > -1) {
					valorCorrecto = true;
				}
				else {
					System.out.printf("El número introducido no es válido%n%n");
					valorCorrecto = false;	
				}
			}
			else {
				System.out.printf("No has introducido ningún número%n%n");
				valorCorrecto = false;
				s.next();
			}
		}while(!valorCorrecto);
		//s.close();
		return num;
	}
}
