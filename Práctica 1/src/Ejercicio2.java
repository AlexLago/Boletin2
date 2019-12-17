

/*Realizar un programa que, mediante un menú, nos ofrezca calcular el área delas siguientes figuras:
 * 1.Área del triángulo: (base*altura)/2
 * 2.Área del cuadrado: (lado*lado)
 * 3.Área del rectángulo: (base * altura)
 * 4.Área del rombo: (diagonal mayor * diagonal menor)/2
 * 5.Área del trapecio: (base mayor + base menor)*altura/2
 * 6.Área del círculo: Pi * radio^2
 * 7.Área de la esfera: 4* Pi * radio^2
 * En cada opción del menú nos pedirá los datos necesarios para el cálculo el área y la mostrará por pantalla.*/


import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean valorCorrecto = false;
		while(!valorCorrecto) {
			System.out.printf("¿Que operación desea realizar?%n%n1-Conocer el área de un triangulo.%n2-Conocer el área de un "
					+ "cuadrado.%n3-Conocer el área de un rectángulo.%n4-Conocer el área de un rombo.%n5-Conocer el área de un "
					+ "trapcerio.%n6-Conocer el área de un círculo.%n7-Conocer el área de una esfera.%n8-Cerrar programa.%n%n");
			int selección = 0;
			selección = s.nextInt();
			switch(selección) {
			case 1:
				System.out.printf("Indique la base del triángulo.%n%n");
				int baseTriángulo = 0;
				do {
					if(s.hasNextInt()) {
						baseTriángulo = s.nextInt();
						if(baseTriángulo > -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("La base introducida no es válida.%n%n");
							valorCorrecto = false;	
						}
					}
					else {
						System.out.printf("No has introducido la base.%n%n");
						valorCorrecto = false;
						s.next();
					}
				}while(!valorCorrecto);
				System.out.printf("La base introducida del triángulo es %d.%n%n", baseTriángulo);
				System.out.printf("Indique la altura del triángulo.%n%n");
				int alturaTriángulo = 0;
				do {
					if(s.hasNextInt()) {
						alturaTriángulo = s.nextInt();
						if(alturaTriángulo > -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("La altura introducida no es válida.%n%n");
							valorCorrecto = false;
						}
					}
					else {
						System.out.printf("No has introducido la altura.%n%n");
						valorCorrecto = false;
						s.next();
					}
				}while(!valorCorrecto);
				System.out.printf("La altura introducida del triángulo es %d.%n%n", alturaTriángulo);
				if(baseTriángulo == 0) {
					System.out.printf("Un triangulo no puede tener de base 0.%n%n");
				}
				else if(alturaTriángulo == 0) {
					System.out.printf("Un triángulo no puede tener de altura 0.");
				}
				else if(baseTriángulo == 0 && alturaTriángulo == 0) {
					System.out.printf("No has introducido ninguna base ni altura.%n%n");
				}
				else {
					int áreaTriángulo = 0;
					áreaTriángulo = (baseTriángulo*alturaTriángulo)/2;
					System.out.printf("El área del triángulo es %d.%n%n", áreaTriángulo);
				}
				valorCorrecto = false;
				break;
			case 2:
				System.out.printf("Indique el tamaño del lado del cuadrado.%n%n");
				int ladoCuadrado = 0;
				do {
					if(s.hasNextInt()) {
						ladoCuadrado = s.nextInt();
						if(ladoCuadrado > -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("El lado introducido no es válido.%n%n");
							valorCorrecto = false;	
						}
					}
					else {
						System.out.printf("No has introducido ningún lado.%n%n");
						valorCorrecto = false;
						s.next();
					}
				}while(!valorCorrecto);
				System.out.printf("El tamaño introducido del lado es %d.%n%n", ladoCuadrado);
				if(ladoCuadrado == 0) {
					System.out.printf("Un cuadrado no puede no tener lados 0.%n%n");
				}
				else {
					int áreaCuadrado = 0;
					áreaCuadrado = ladoCuadrado*ladoCuadrado;
					System.out.printf("El área del cuadrado es %d.%n%n", áreaCuadrado);
				}
				valorCorrecto = false;
				break;
			case 3:
				System.out.printf("Indique el tamaño de la base del rectángulo.%n%n");
				int baseRectángulo = 0;
				do {
					if(s.hasNextInt()) {
						baseRectángulo = s.nextInt();
						if(baseRectángulo > -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("La base introducida no es válida.%n%n");
							valorCorrecto = false;	
						}
					}
					else {
						System.out.printf("No has introducido la base.%n%n");
						valorCorrecto = false;
						s.next();
					}
				}while(!valorCorrecto);
				System.out.printf("La base introducida del rectángulo es %d.%n%n", baseRectángulo);
				System.out.printf("Indique el tamaño de la altura del rectángulo.%n%n");
				int alturaRectángulo = 0;
				do {
					if(s.hasNextInt()) {
						alturaRectángulo = s.nextInt();
						if(alturaRectángulo > -1) {
							valorCorrecto = true;
						}
						else {
							System.out.printf("La altura introducida no es válida.%n%n");
							valorCorrecto = false;
						}
					}
					else {
						System.out.printf("No has introducido la altura.%n%n");
						valorCorrecto = false;
						s.next();
					}
				}while(!valorCorrecto);
				System.out.printf("La altura introducida del rectángulo es %d.%n%n", alturaRectángulo);
				if(baseRectángulo == 0) {
					System.out.printf("Un rectángulo no puede tener de base 0.%n%n");
				}
				else if(alturaRectángulo == 0) {
					System.out.printf("Un rectángulo no puede tener de altura 0.");
				}
				else if(baseRectángulo == 0 && alturaRectángulo == 0) {
					System.out.printf("No has introducido ninguna base ni altura.%n%n");
				}
				else {
					int áreaRectángulo = 0;
					áreaRectángulo = baseRectángulo*alturaRectángulo;
					System.out.printf("El área del rectángulo es %d.%n%n", áreaRectángulo);
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
							System.out.printf("La diagonal introducida no es válida.%n%n");
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
							System.out.printf("La diagonal introducida no es válida.%n%n");
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
					int áreaRombo = 0;
					áreaRombo = (diagonal1*diagonal2)/2;
					System.out.printf("El área del rombo es %d.%n%n", áreaRombo);
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
							System.out.printf("La base introducida no es válida.%n%n");
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
							System.out.printf("La base introducida no es válida.%n%n");
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
							System.out.printf("La altura introducida no es válida.%n%n");
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
					int áreaTrapecio = 0;
					áreaTrapecio = (base1Trapecio + base2Trapecio) * alturaTrapecio;
					áreaTrapecio = áreaTrapecio / 2;
					System.out.printf("El área del trapecio es %d.%n%n", áreaTrapecio);
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
							System.out.printf("El radio introducido no es válido.%n%n");
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
					double áreaCirculo = 0;
					double radioCirculo2 = 0;
					radioCirculo2 = radioCirculo * radioCirculo;
					áreaCirculo = radioCirculo2 * pi;
					System.out.printf("El área del circulo es %d.%n%n", áreaCirculo);
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
							System.out.printf("El radio introducido no es válido.%n%n");
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
					double áreaEsfera = 0;
					double radioEsfera2 = 0;
					radioEsfera2 = radioEsfera * radioEsfera;
					pi = pi *4;
					áreaEsfera = radioEsfera2 * pi;
					System.out.printf("El área de la esfera es %d.%n%n", áreaEsfera);
				}
				valorCorrecto = false;
				break;
			case 8:
				System.out.printf("Saliendo ...%n%n");
				valorCorrecto = true;
				break;
			}
		}
		System.out.printf("Has salido con éxito.");
		s.close();
	}
}
