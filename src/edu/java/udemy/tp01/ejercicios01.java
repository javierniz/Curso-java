package edu.java.udemy.tp01;

import java.util.Scanner;

public class ejercicios01 {

	public static void main(String[] args) {
				
		//ejercicio 6 
		 
		 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el numero1:");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el numero2:");
        int numero2 = Integer.parseInt(scanner.nextLine());
        System.out.println("El numero mayor es:");
        System.out.println(numero1 > numero2 ? numero1 : numero2);
        
    }
}


/*ejercicio 6 
				 * 
				 
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Proporciona el numero1:");
		        int numero1 = Integer.parseInt(scanner.nextLine());
		        System.out.println("Proporciona el numero2:");
		        int numero2 = Integer.parseInt(scanner.nextLine());
		        System.out.println("El numero mayor es:");
		        System.out.println(numero1 > numero2 ? numero1 : numero2);
		        
		    }
		}
	    */
/*
 * ejercicio 05 int id = 0;
 * 
 * double precio = 0;
 * 
 * Scanner input = new Scanner(System.in);
 * 
 * String nombre; boolean envioGratuito;
 * 
 * System.out.println("Proporciona el nombre:");
 * System.out.println("Programacion con Java"); nombre = input.nextLine();
 * System.out.println("Proporciona el id:"); id = input.nextInt();
 * System.out.println("Proporciona el precio:"); precio = input.nextDouble();
 * System.out.println("Proporciona el envio gratuito:\r\n" + true);
 * envioGratuito=input.equals(true);
 * System.out.println("Programacion con Java #1520\r\n" + "Precio:$\r\n"+ precio
 * + "Envio Gratituto:\r\n "+ envioGratuito);
 * 
 * } }
 */

/*
 * ejercicio 4 boolean varbooleano= true;
 * 
 * System.out.println("var boolean" + varbooleano);
 * 
 * if(varbooleano) { System.out.println("La bandera es verdadera "); }else {
 * System.out.println("la bandera es falsa"); }
 * 
 * int edad=30; boolean esAdulto = edad >= 18; if (esAdulto) {
 * System.out.println("Eres mayor de edad"); }else {
 * System.out.println("Eres menor de edad"); }
 * 
 * }
 */

/*
 * Ejercicio 01 String nombre="javier"; System.out.println(nombre); nombre =
 * "carlos"; System.out.println(nombre);
 */

/*
 * Ejercicio 02 titulo = "Sin titulo"; String autor = "Sin autor";
 * 
 * Scanner input= new Scanner(System.in);
 * 
 * System.out.println("Por favor ingrese el titulo del libro"); titulo =
 * input.nextLine(); System.out.println("Por favor ingrese nombre del autor");
 * autor = input.nextLine(); System.out.println(titulo + " fue escrito por " +
 * autor);
 */

//System.out.println("comillas simples:\'" + nombre + "\'");

/*
 * Ejercicio 03 "Tipos primitivos de tipo flotante y double";
 * 
 * float numeroFloat = (float) 3.4028236E38D; System.out.println("numeroFloat "+
 * numeroFloat); System.out.println("valor minimio tipo float:" +
 * Float.MIN_VALUE); System.out.println("valos maximo de tipo float" +
 * Float.MAX_VALUE);
 * 
 * double numeroDouble = 10; System.out.println("numeroDouble = "+
 * numeroDouble); System.out.println("valor minimo tipo double: "+
 * Double.MIN_VALUE); System.out.println("valor maximo tipo double: "+
 * Double.MAX_VALUE);
 */
