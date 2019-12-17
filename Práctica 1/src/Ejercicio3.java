

/*Realizar un programa que nos de las siguientes opciones:
 * 1.Pasar de decimal a octal
 * 2.Pasar de octal a decimal
 * 3.Pasar de decimal a hexadecimal
 * 4.pasar de hexadecimal a decimal
 * 5.pasar de decimal a binario
 * 6.pasar de binario a decimal
 * En cada una de las opciones se pedir� el valor a convertir (num�rico entero) y se mostrar�la soluci�n*/

import java.util.Scanner;
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String hexNum = null;
		int num = 0;
		boolean valorCorrecto = false;
		while(!valorCorrecto) {
			System.out.printf("�Que operaci�n desea realizar?%n%n1-Pasar de numeraci�n decimal a octal.%n2-Pasar de numeraci�n "
					+ "octal a decimal.%n3-Pasar de numeraci�n decimal a hexadecimal.%n4-Pasar de numeraci�n hexadecimal a deci"
					+ "mal.%n5-Pasar de numeraci�n decimal a binario.%n6-Pasar de numeraci�n binario a decimal.%n7-Cerrar programa.%n%n");
			int selecci�n = 0;
			selecci�n = s.nextInt();
			switch(selecci�n) {
			case 1:
				System.out.printf("Indique el n�mero en decimal que quieres pasar a octal%n");
				
				do {
					if(s.hasNextInt()) {
						num = s.nextInt();
						if(num > -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("El valor introducido no es v�lido.%n%n");
							valorCorrecto = false;	
						}
					}
					else {
						System.out.printf("No has introducido ning�n valor.%n%n");
						valorCorrecto = false;
						s.next();
					}
				}while(!valorCorrecto);
				char digitosO[]={'0','1','2','3','4','5','6','7'};
		        String octal2 = "";
		        int resto, aux = num;
		         
		        while(aux>0){
		            resto = aux % 8;
		            octal2 = digitosO[resto] + octal2;
		            aux /= 8; 
		        }
		        System.out.printf("%n%n El n�mero %d en Octal es %s", num, octal2);
				valorCorrecto = false;
				break;
			case 2:
				System.out.printf("Indique el n�mero en octal que quieres pasar a decimal%n");
	
				do {
					if(s.hasNextInt()) {
						num = s.nextInt();
						if(num > -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("El valor introducido no es v�lido.%n%n");
							valorCorrecto = false;	
						}
					}
					else {
						System.out.printf("No has introducido ning�n valor.%n%n");
						valorCorrecto = false;
						s.next();
					}
				}while(!valorCorrecto);
		        int decimal = convertirOctalDecimal(num);
		        System.out.printf("%n%n El n�mero %d en decimal es %s", num, decimal);
				valorCorrecto = false;
				break;
			case 3:
				System.out.printf("Indique el n�mero en decimal que quieres pasar a hexadecimal");
				do {
					if(s.hasNextInt()) {
						num = s.nextInt();
						if(num > -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("El valor introducido no es v�lido.%n%n");
							valorCorrecto = false;	
						}
					}
					else {
						System.out.printf("No has introducido ning�n valor.%n%n");
						valorCorrecto = false;
						s.next();
					}
				}while(!valorCorrecto);
				char digitosH[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		        String hexadecimal2 = "";
		        int resto1, aux1 = num;
		         
		        while(aux1>0){
		            resto = aux1 % 16;
		            hexadecimal2 = digitosH[resto] + hexadecimal2;
		            aux1 /= 16; 
		        }
		        System.out.printf("%n%n El n�mero %d en decimal es %s", num, hexadecimal2);
				valorCorrecto = false;
				break;
			case 4:
				System.out.printf("Indique el n�mero en hexadecimal que quieres pasar a decimal%n");
				break;
			case 5:
				System.out.printf("Indique el n�mero en decimal que quieres pasar a binario%n");
				do {
					if(s.hasNextInt()) {
						num = s.nextInt();
						if(num > -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("El valor introducido no es v�lido.%n%n");
							valorCorrecto = false;	
						}
					}
					else {
						System.out.printf("No has introducido ning�n valor.%n%n");
						valorCorrecto = false;
						s.next();
					}
					}while(!valorCorrecto);
						int exp, digito;
						double binario;
				        exp=0;
				        binario=0;
				        while(num!=0){
				                digito = num % 2;           
				                binario = binario + digito * Math.pow(10, exp);  
				                exp++;
				                num = num/2;
				        }
				        System.out.printf("%n%n El n�mero %d en binario es %s", num, binario);
				 
				valorCorrecto = false;
				break;
			case 6:
				System.out.printf("Indique el n�mero en binario que quieres pasar a decimal%n");
				do {
					if(s.hasNextInt()) {
						num = s.nextInt();
						if(num> -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("El valor introducido no es v�lido.%n%n");
							valorCorrecto = false;	
						}
					}
					else {
						System.out.printf("No has introducido ning�n valor.%n%n");
						valorCorrecto = false;
						s.next();
					}
				}while(!valorCorrecto);
				
				valorCorrecto = false;
				break;
			case 7:
				System.out.printf("Cerrando ...%n%n");
				valorCorrecto = true;
				break;
			}
		}
		System.out.printf("Has cerrado el programa con �xito.");
		s.close();
	}

public static int convertirOctalDecimal(int num){
    int decimalNumber = 0, i = 0;
    while(num != 0)
    {
        decimalNumber += (num % 10) * Math.pow(8, i);
        ++i;
        num/=10;
    }
    return decimalNumber;
	} 
}