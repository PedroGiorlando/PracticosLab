
package com.mycompany.tpcondicionales;

import java.util.Scanner;


public class TPCondicionales {

    public static void main(String[] args) {
        /*Ejercicio 13
         Scanner sc = new Scanner(System.in);
        int año;

        System.out.print("Introduzca el año: ");
        año = sc.nextInt();

        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0){                                                 
            System.out.println("Es un año bisiesto");
        } else{
            System.out.println("No es un año bisiesto");
        }*/
        /*Ejercicio 14
        int n;

        System.out.print("Introduzca número de 3 cifras: ");
        n = sc.nextInt();

        if (n >= 100 && n <= 999){  
            if (n % 10 == n / 100){                                   
                System.out.println("El número es capicúa");
            } else{
                System.out.println("El número no es capicúa");
            }
        } else{ 
            System.out.println("No es un número de 3 cifras");
        }*/
        /*Ejercicio 15
         double dividendo, divisor;
        System.out.print("Introduzca el dividendo: ");
        dividendo = sc.nextDouble();
        System.out.print("Introduzca el divisor: ");
        divisor = sc.nextDouble();
        if(divisor==0){
           System.out.println("No se puede dividir por cero");   
        }else{
            System.out.println(dividendo/divisor);  
        }*/
        /*Ejercicio 16
        double n1, n2, mayor, menor;

        System.out.print("Introduzca primer número: ");
        n1 = sc.nextDouble();
        System.out.print("Introduzca segundo número: ");
        n2 = sc.nextDouble();

        if(n1 != n2){
           if (n1 > n2) {
               mayor = n1;
               menor = n2;
           } else {
               mayor = n2;
               menor = n1;
           }

           if (menor == 0) {
               System.out.println("No se puede dividir por cero");
           } else {
               System.out.println(mayor / menor);                                 
           } 
        }else{
            System.out.println("Los números son iguales");
        }*/
        /*Ejercicio 17
        int n1, n2, n3;
        System.out.print("Introduzca primer número: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca segundo número: ");
        n2 = sc.nextInt();
        System.out.print("Introduzca tercer número: ");
        n3 = sc.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El mayor es: " + n1);                                             
            } else {
                System.out.println("el mayor es: " + n3);     
            }
        } else if (n2 > n3) {
            System.out.println("el mayor es: " + n2);
        } else {
            System.out.println("el mayor es: " + n3);
        }*/
        /*Ejercicio 18
         int H,M,S;
        System.out.print("Introduzca hora: ");
        H =  sc.nextInt();
        System.out.print("Introduzca minutos: ");
        M =  sc.nextInt();
        System.out.print("Introduzca segundos: ");
        S =  sc.nextInt();
        if(H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60)  {                                                        
           System.out.println("Hora correcta");
        }
        else{
            System.out.println("Hora incorrecta");
        }*/
        /*Ejercicio 19
         int mes;
        System.out.print("Introduzca número de mes: ");
        mes =  sc.nextInt();
        if(mes < 1 || mes > 12)                                   
            System.out.println("Mes incorrecto");
        else{  
            switch(mes){                                    
                case 1 -> System.out.print("Enero");
                case 2 -> System.out.print("Febrero");
                case 3 -> System.out.print("Marzo");
                case 4 -> System.out.print("Abril");
                case 5 -> System.out.print("Mayo");
                case 6 -> System.out.print("Junio");
                case 7 -> System.out.print("Julio");
                case 8 -> System.out.print("Agosto");
                case 9 -> System.out.print("Septiembre");
                case 10 -> System.out.print("Octubre");
                case 11 -> System.out.print("Noviembre");
                case 12 -> System.out.print("Diciembre");
            }
             switch (mes) {
                 case 4, 6, 9, 11 -> System.out.println(" es un mes de 30 días");
                 case 2 -> System.out.println(" es un mes de 28 días");
                 default -> System.out.println(" es un mes de 31 días");
             }*/
             /*Ejercicio 20
             int nota;

            System.out.print("Introduzca nota entre 0 y 10: ");
            nota = sc.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota incorrecta");
            } else if (nota < 5) {
                System.out.println("Insuficiente");
            } else if (nota < 6) {
                System.out.println("Suficiente");
            } else if (nota < 7) {
                System.out.println("Bien");
            } else if (nota < 9) {
                System.out.println("Notable");
            } else {
                System.out.println("Sobresaliente");                                                                  
            }
        }*/
    }
}
