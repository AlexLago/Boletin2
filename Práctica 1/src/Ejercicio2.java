

/*Realizar un programa que, mediante un men�, nos ofrezca calcular el �rea delas siguientes figuras:
 * 1.�rea del tri�ngulo: (base*altura)/2
 * 2.�rea del cuadrado: (lado*lado)
 * 3.�rea del rect�ngulo: (base * altura)
 * 4.�rea del rombo: (diagonal mayor * diagonal menor)/2
 * 5.�rea del trapecio: (base mayor + base menor)*altura/2
 * 6.�rea del c�rculo: Pi * radio^2
 * 7.�rea de la esfera: 4* Pi * radio^2
 * En cada opci�n del men� nos pedir� los datos necesarios para el c�lculo el �rea y la mostrar� por pantalla.*/


import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean valorCorrecto = false;
		while(!valorCorrecto) {
			System.out.printf("�Que operaci�n desea realizar?%n%n1-Conocer el �rea de un triangulo.%n2-Conocer el �rea de un "
					+ "cuadrado.%n3-Conocer el �rea de un rect�ngulo.%n4-Conocer el �rea de un rombo.%n5-Conocer el �rea de un "
					+ "trapcerio.%n6-Conocer el �rea de un c�rculo.%n7-Conocer el �rea de una esfera.%n8-Cerrar programa.%n%n");
			int selecci�n = 0;
			selecci�n = s.nextInt();
			switch(selecci�n) {
			case 1:
				System.out.printf("Indique la base del tri�ngulo.%n%n");
				int baseTri�ngulo = 0;
				do {
					if(s.hasNextInt()) {
						baseTri�ngulo = s.nextInt();
						if(baseTri�ngulo > -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("La base introducida no es v�lida.%n%n");
							valorCorrecto = false;	
						}
					}
					else {
						System.out.printf("No has introducido la base.%n%n");
						valorCorrecto = false;
						s.next();
					}
				}while(!valorCorrecto);
				System.out.printf("La base introducida del tri�ngulo es %d.%n%n", baseTri�ngulo);
				System.out.printf("Indique la altura del tri�ngulo.%n%n");
				int alturaTri�ngulo = 0;
				do {
					if(s.hasNextInt()) {
						alturaTri�ngulo = s.nextInt();
						if(alturaTri�ngulo > -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("La altura introducida no es v�lida.%n%n");
							valorCorrecto = false;
						}
					}
					else {
						System.out.printf("No has introducido la altura.%n%n");
						valorCorrecto = false;
						s.next();
					}
				}while(!valorCorrecto);
				System.out.printf("La altura introducida del tri�ngulo es %d.%n%n", alturaTri�ngulo);
				if(baseTri�ngulo == 0) {
					System.out.printf("Un triangulo no puede tener de base 0.%n%n");
				}
				else if(alturaTri�ngulo == 0) {
					System.out.printf("Un tri�ngulo no puede tener de altura 0.");
				}
				else if(baseTri�ngulo == 0 && alturaTri�ngulo == 0) {
					System.out.printf("No has introducido ninguna base ni altura.%n%n");
				}
				else {
					int �reaTri�ngulo = 0;
					�reaTri�ngulo = (baseTri�ngulo*alturaTri�ngulo)/2;
					System.out.printf("El �rea del tri�ngulo es %d.%n%n", �reaTri�ngulo);
				}
				valorCorrecto = false;
				break;
			case 2:
				System.out.printf("Indique el tama�o del lado del cuadrado.%n%n");
				int ladoCuadrado = 0;
				do {
					if(s.hasNextInt()) {
						ladoCuadrado = s.nextInt();
						if(ladoCuadrado > -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("El lado introducido no es v�lido.%n%n");
							valorCorrecto = false;	
						}
					}
					else {
						System.out.printf("No has introducido ning�n lado.%n%n");
						valorCorrecto = false;
						s.next();
					}
				}while(!valorCorrecto);
				System.out.printf("El tama�o introducido del lado es %d.%n%n", ladoCuadrado);
				if(ladoCuadrado == 0) {
					System.out.printf("Un cuadrado no puede no tener lados 0.%n%n");
				}
				else {
					int �reaCuadrado = 0;
					�reaCuadrado = ladoCuadrado*ladoCuadrado;
					System.out.printf("El �rea del cuadrado es %d.%n%n", �reaCuadrado);
				}
				valorCorrecto = false;
				break;
			case 3:
				System.out.printf("Indique el tama�o de la base del rect�ngulo.%n%n");
				int baseRect�ngulo = 0;
				do {
					if(s.hasNextInt()) {
						baseRect�ngulo = s.nextInt();
						if(baseRect�ngulo > -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("La base introducida no es v�lida.%n%n");
							valorCorrecto = false;	
						}
					}
					else {
						System.out.printf("No has introducido la base.%n%n");
						valorCorrecto = false;
						s.next();
					}
				}while(!valorCorrecto);
				System.out.printf("La base introducida del rect�ngulo es %d.%n%n", baseRect�ngulo);
				System.out.printf("Indique el tama�o de la altura del rect�ngulo.%n%n");
				int alturaRect�ngulo = 0;
				do {
					if(s.hasNextInt()) {
						alturaRect�ngulo = s.nextInt();
						if(alturaRect�ngulo > -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("La altura introducida no es v�lida.%n%n");
							valorCorrecto = false;
						}
					}
					else {
						System.out.printf("No has introducido la altura.%n%n");
						valorCorrecto = false;
						s.next();
					}
				}while(!valorCorrecto);
				System.out.printf("La altura introducida del rect�ngulo es %d.%n%n", alturaRect�ngulo);
				if(baseRect�ngulo == 0) {
					System.out.printf("Un rect�ngulo no puede tener de base 0.%n%n");
				}
				else if(alturaRect�ngulo == 0) {
					System.out.printf("Un rect�ngulo no puede tener de altura 0.");
				}
				else if(baseRect�ngulo == 0 && alturaRect�ngulo == 0) {
					System.out.printf("No has introducido ninguna base ni altura.%n%n");
				}
				else {
					int �reaRect�ngulo = 0;
					�reaRect�ngulo = baseRect�ngulo*alturaRect�ngulo;
					System.out.printf("El �rea del rect�ngulo es %d.%n%n", �reaRect�ngulo);
				}
				valorCorrecto = false;
				break;
			case 4:
				System.out.printf("Indique la primera diagonal del rombo.%n%n");
				int diagonal1 = 0;
				do {
					if(s.hasNextInt()) {
						diagonal1 = s.nextInt();
						if(diagonal1 > -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("La diagonal introducida no es v�lida.%n%n");
							valorCorrecto = false;	
						}
					}
					else {
						System.out.printf("No has introducido una diagonal.%n%n");
						valorCorrecto = false;
						s.next();
					}
				}while(!valorCorrecto);
				System.out.printf("La diagonal introducida del rombo es %d.%n%n", diagonal1);
				System.out.printf("Indique la segunda diagonal del rombo.%n%n");
				int diagonal2 = 0;
				do {
					if(s.hasNextInt()) {
						diagonal2 = s.nextInt();
						if(diagonal2 > -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("La diagonal introducida no es v�lida.%n%n");
							valorCorrecto = false;
						}
					}
					else {
						System.out.printf("No has introducido una diagonal.%n%n");
						valorCorrecto = false;
						s.next();
					}
				}while(!valorCorrecto);
				System.out.printf("La segunda diagonal introducida del rombo es %d.%n%n", diagonal2);
				if(diagonal1 == 0 || diagonal2 == 0) {
					System.out.printf("Un rombo no puede tener una diagonal con valor 0.%n%n");
				}
				else if(diagonal1 == 0 && diagonal2 == 0) {
					System.out.printf("No has introducido ninguna diagonal.%n%n");
				}
				else {
					int �reaRombo = 0;
					�reaRombo = (diagonal1*diagonal2)/2;
					System.out.printf("El �rea del rombo es %d.%n%n", �reaRombo);
				}
				valorCorrecto = false;
				break;
			case 5:
				System.out.printf("Indique la primera base del trapecio.%n%n");
				int base1Trapecio = 0;
				do {
					if(s.hasNextInt()) {
						base1Trapecio = s.nextInt();
						if(base1Trapecio > -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("La base introducida no es v�lida.%n%n");
							valorCorrecto = false;	
						}
					}
					else {
						System.out.printf("No has introducido la base.%n%n");
						valorCorrecto = false;
						s.next();
					}
				}while(!valorCorrecto);
				System.out.printf("La primera base introducida del trapecio es %d.%n%n", base1Trapecio);
				System.out.printf("Indique la segunda base del trapecio.%n%n");
				int base2Trapecio = 0;
				do {
					if(s.hasNextInt()) {
						base2Trapecio = s.nextInt();
						if(base2Trapecio > -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("La base introducida no es v�lida.%n%n");
							valorCorrecto = false;
						}
					}
					else {
						System.out.printf("No has introducido la base.%n%n");
						valorCorrecto = false;
						s.next();
					}
				}while(!valorCorrecto);
				System.out.printf("La segunda base introducida del trapecio es %d.%n%n", base2Trapecio);
				System.out.printf("Indique la altura del trapecio.%n%n");
				int alturaTrapecio = 0;
				do {
					if(s.hasNextInt()) {
						alturaTrapecio = s.nextInt();
						if(alturaTrapecio > -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("La altura introducida no es v�lida.%n%n");
							valorCorrecto = false;	
						}
					}
					else {
						System.out.printf("No has introducido la altura.%n%n");
						valorCorrecto = false;
						s.next();
					}
				}while(!valorCorrecto);
				System.out.printf("La altura introducida del trapecio es %d.%n%n", alturaTrapecio);
				if(base1Trapecio == 0 || base2Trapecio == 0 || alturaTrapecio == 0) {
					System.out.printf("Un trapecio no puede tener un lado con valor 0.%n%n");
				}
				else if(base1Trapecio == 0 && base2Trapecio == 0 && alturaTrapecio == 0) {
					System.out.printf("No has introducido ningun valor.");
				}
				else {
					int �reaTrapecio = 0;
					�reaTrapecio = (base1Trapecio + base2Trapecio) * alturaTrapecio;
					�reaTrapecio = �reaTrapecio / 2;
					System.out.printf("El �rea del trapecio es %d.%n%n", �reaTrapecio);
				}
				valorCorrecto = false;
				break;
			case 6:
				System.out.printf("Indique el radio del circulo.%n%n");
				double radioCirculo = 0;
				do {
					if(s.hasNextDouble()) {
						radioCirculo = s.nextInt();
						if(radioCirculo > -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("El radio introducido no es v�lido.%n%n");
							valorCorrecto = false;	
						}
					}
					else {
						System.out.printf("No has introducido el radio.%n%n");
						valorCorrecto = false;
						s.next();
					}
				}while(!valorCorrecto);
				System.out.printf("El radio introducido del circulo es %d.%n%n", radioCirculo);
				if(radioCirculo == 0) {
					System.out.printf("Un circulo no puede tener de radio 0.%n%n");
				}
				else {
					double pi = 3.14;
					double �reaCirculo = 0;
					double radioCirculo2 = 0;
					radioCirculo2 = radioCirculo * radioCirculo;
					�reaCirculo = radioCirculo2 * pi;
					System.out.printf("El �rea del circulo es %d.%n%n", �reaCirculo);
				}
				valorCorrecto = false;
				break;
			case 7:
				System.out.printf("Indique el radio de la esfera.%n%n");
				double radioEsfera = 0;
				do {
					if(s.hasNextDouble()) {
						radioEsfera = s.nextInt();
						if(radioEsfera > -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("El radio introducido no es v�lido.%n%n");
							valorCorrecto = false;	
						}
					}
					else {
						System.out.printf("No has introducido el radio.%n%n");
						valorCorrecto = false;
						s.next();
					}
				}while(!valorCorrecto);
				System.out.printf("El radio introducido de la esfera es %d.%n%n", radioEsfera);
				if(radioEsfera == 0) {
					System.out.printf("Una esfera no puede tener de radio 0.%n%n");
				}
				else {
					double pi = 3.14;
					double �reaEsfera = 0;
					double radioEsfera2 = 0;
					radioEsfera2 = radioEsfera * radioEsfera;
					pi = pi *4;
					�reaEsfera = radioEsfera2 * pi;
					System.out.printf("El �rea de la esfera es %d.%n%n", �reaEsfera);
				}
				valorCorrecto = false;
				break;
			case 8:
				System.out.printf("Saliendo ...%n%n");
				valorCorrecto = true;
				break;
			}
		}
		System.out.printf("Has salido con �xito.");
		s.close();
	}
}
