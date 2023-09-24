package com.mycompany.tpgenerales;
import java.util.Scanner;

public class TPGenerales {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        /*Ejercicio1
        int num1, num2, aux;
        System.out.println("Ingrese el valor de la primer variable: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el valor de la segunda variable");
        num2 = sc.nextInt();
        
        System.out.println("Ahora la variable 1 tendrá el valor de la variable 2 y viceversa");
        aux = num1;
        num1 = num2;
        num2 = aux;
        System.out.println("Variable 1: "+ num1 + ", Variable 2: "+ num2);*/
        
        /*Ejercicio 2
        int num, cifras;
        System.out.println("Ingrese un número para saber la cantidad de cifras que tiene");
        num = sc.nextInt();
        cifras = 0;
        while(num!=0){
            num = num/10;
            cifras++;
        }
        System.out.println("Tiene "+cifras+" cifras");*/
        
        //Ejercicio 3
        int temperatura;
        String caracter;
        
        do{
            System.out.println("Introduce la temperatura en C°: ");
            temperatura = sc.nextInt();
            System.out.println("Grados Kelvin: "+(temperatura+273));
            System.out.println("Repetir proceso? (S/N)");
            caracter = sc.nextLine();
        }while(caracter == "s" || caracter == "S");
        
    }
}
