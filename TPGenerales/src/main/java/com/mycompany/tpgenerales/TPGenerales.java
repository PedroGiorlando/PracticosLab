package com.mycompany.tpgenerales;
import java.util.Scanner;

public class TPGenerales {
   /* public static char obtenerLetraDNI(int dni) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                         'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};                             
        return letras[dni % 23];
}*/
    

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
        
        /*Ejercicio 3
        int temperatura;
        String caracter;
        
        do{
            System.out.println("Introduce la temperatura en C°: ");
            temperatura = sc.nextInt();
            System.out.println("Grados Kelvin: "+(temperatura+273));
            System.out.println("Repetir proceso? (S/N)");
            caracter = sc.next();
            
        }while(caracter.equals("s")|| caracter.equals("S"));*/
        
        /*Ejercicio 4
        int num;
        System.out.println("Ingrese un número para saber su tabla: ");
        num = sc.nextInt();
        for (int i = 1 ; i < 11 ; i++){
            System.out.println(i + " x " + num + " = " + (num*i));
        }*/
        
        /*Ejercicio 5
        int num, contador, n;
        contador = 0;
        System.out.println("Ingrese la cantidad de numeros que desea saber si terminan en 2");
        num = sc.nextInt();
        
        for(int i = 0; i<num; i++){
            System.out.println("Ingrese el numero " + i+1);
            n = sc.nextInt();
            if (n%10==2){
                contador++;
            }
        }
        System.out.println("la cantidad de numeros que terminan en 2 de los "+ num +" numeros ingresados son: "+ contador);*/
        /*Ejercicio 6
        int num, i, suma;
        System.out.println("Ingrese un número para saber si es perfecto");
        num = sc.nextInt();
        suma = 0;
        for (i=1; i<num; i++){
            if (num%i==0){
                suma = suma + i;
            }
            
        }
        if(suma == num){
            System.out.println("Es un número perfecto");
        }else{
                    System.out.println("No es un número perfecto");
                    }*/
        /*Ejercicio 7
        int num1, num2, suma1, suma2, i;
        System.out.println("Ingrese los números para saber si son amigos");
        System.out.println("Ingrese el primer número");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = sc.nextInt();
        suma1=0;
        suma2=0;
        
        for(i=1;i<num1;i++){
            if(num1%i==0){
                suma1 = suma1 + i;
            }
        }
        for(i=1;i<num2;i++){
            if(num2%i==0){
                suma2 = suma2 + i;
            }
        }
        if(suma1 == num2 && suma2 == num1){
            System.out.println("Son números amigos");
        }else{
            System.out.println("No son números amigos");
        }*/
        
        /*Ejercicio 8
              int numero,fibo1,fibo2,i;
  
        do{
            System.out.print("Introduce numero mayor que 1: ");
            numero = sc.nextInt();
        }while(numero<=1);
  
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");                 

        fibo1=1;
        fibo2=1;

        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();*/
        /*Ejercicio 9
        int num, i;
        String numBinario, numBinarioReal;
        numBinario = " ";
        numBinarioReal= " ";
        System.out.println("Introduzca el numero decimal para pasarlo a binario: ");
        num = sc.nextInt();
        while(num!=0){
            if(num%2==0){
                numBinario = numBinario + "0";
            }else{
                numBinario = numBinario + "1";
            }
            num= num/2;     
        }
         for (i = numBinario.length() - 1; i >= 0; i--) {
           
            numBinarioReal += numBinario.charAt(i);
    }
         System.out.println("El número binario es: "+ numBinarioReal);*/
        /*Ejercicio 10
         System.out.print("Introduce un número binario: ");
        String binario = sc.nextLine();

        
        int decimal = 0;

       
        for (int i = binario.length() - 1, exponente = 0; i >= 0; i--, exponente++) {
            char digito = binario.charAt(i);

            
            if (digito == '0' || digito == '1') {
                int valor = Character.getNumericValue(digito); 
                decimal += valor * Math.pow(2, exponente); 
            } else {
                System.out.println("Número binario no válido.");
                return; 
            }
        }

        System.out.println("El número decimal es: " + decimal);*/
        /*Ejercicio 11
        int N;
      do {
             System.out.print("Introduce un número entre 1 y 3999: ");
             N = sc.nextInt();
      } while (N < 1 || N > 3999);
      System.out.println(N + " en numeros romanos -> " + convertirANumerosRomanos(N));                            
  }

  
  public static String convertirANumerosRomanos(int numero) {
      int i, miles, centenas, decenas, unidades;
      String romano = "";
      
     
      miles = numero / 1000;
      centenas = numero / 100 % 10;
      decenas = numero / 10 % 10;
      unidades = numero % 10;

    
      for (i = 1; i <= miles; i++) {
             romano = romano + "M";
      }

     
      if (centenas == 9) {
          romano = romano + "CM";
      } else if (centenas >= 5) {
                 romano = romano + "D";
                 for (i = 6; i <= centenas; i++) {
                      romano = romano + "C";
                 }
      } else if (centenas == 4) {
                 romano = romano + "CD";
      } else {
                 for (i = 1; i <= centenas; i++) {
                      romano = romano + "C";
             }
      }

      
      if (decenas == 9) {
          romano = romano + "XC";
      } else if (decenas >= 5) {
                 romano = romano + "L";
                 for (i = 6; i <= decenas; i++) {
                      romano = romano + "X";
                 }
      } else if (decenas == 4) {
                 romano = romano + "XL";
      } else {
                 for (i = 1; i <= decenas; i++) {
                      romano = romano + "X";
                 }
      }

      
      if (unidades == 9) {
          romano = romano + "IX";
      } else if (unidades >= 5) {
                 romano = romano + "V";
                 for (i = 6; i <= unidades; i++) {                                                           
                      romano = romano + "I";
                 }
      } else if (unidades == 4) {
                 romano = romano + "IV";
      } else {
                 for (i = 1; i <= unidades; i++) {
                      romano = romano + "I";
                 }
      }
      return romano;*/
      /*Ejercicio 12
       String texto;
        int codigo;
        char opcion;
       
        do {
            System.out.print("Introduce un texto: ");
            texto = sc.nextLine();
        } while (texto.isEmpty());
        
        do {
            System.out.print("Introduce el código: ");
            codigo = sc.nextInt();
        } while (codigo < 1);
        
        do {
            sc.nextLine();
            System.out.print("(C) cifrar o (D) descifrar?: ");
            opcion = (char) System.in.read();
        } while (Character.toUpperCase(opcion) != 'C' && Character.toUpperCase(opcion) != 'D');                   
        if (Character.toUpperCase(opcion) == 'C') {
            System.out.println("Texto cifrado: " + cifradoCesar(texto, codigo));
        } else {
            System.out.println("Texto descifrado: " + descifradoCesar(texto, codigo));
        }
    }

    
    public static String cifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) + codigo) > 'z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) + codigo) > 'Z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            }
        }
        return cifrado.toString();
    }

    
    public static String descifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) - codigo) < 'a') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) - codigo) < 'A') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            }
        }
        return cifrado.toString();*/
    /*Ejercicio 13 
        int N, aux, inverso = 0, cifra;
        
        do {
            System.out.print("Introduce un número >= 10: ");                                                 
            N = sc.nextInt();
        } while (N < 10);
       
       
        aux = N;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
    
        if(N == inverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }*/
    /*Ejercicio 14
    int n;
        double nota, suma = 0, mayor, menor;
       
        System.out.println("Nota media, mayor y menor de una clase");
        System.out.println("--------------------------------------");

        do {
            System.out.print("Introduce numero de alumnos: ");
            n = sc.nextInt();  
        } while (n <= 0); 

        System.out.print("Nota del alumno 1: ");
        nota = sc.nextDouble(); 
       
        suma = suma + nota; 
       
        mayor = nota; 
        menor = nota;
       
        for (int i = 2; i <= n; i++) {       
            System.out.print("Nota del alumno " + i + ": ");
            nota = sc.nextDouble();
            suma = suma + nota; 
            if (nota > mayor){  
                mayor = nota;
            } else if (nota < menor) {
                menor = nota;
            }
        }

       
        System.out.printf("Nota media: %.2f %n" , suma/n);
        System.out.println("La mayor nota ha sido un " + mayor);
        System.out.println("La menor nota ha sido un " + menor);*/
    /*Ejercicio 15
        int n;
        double factorial = 1;
        
		
        do {  
            System.out.print("Introduce un numero entero >= 0: ");
            n = sc.nextInt();
        } while (n < 0);

        
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
		
        
        System.out.printf("%d! = %.0f %n", n, factorial);*/
    /*Ejercicio 16
        int n, i;
		
        do {
            System.out.print("Introduce un numero >0: ");
            n = sc.nextInt();
        } while (n <= 0);
		
        if (n == 1) {  
            System.out.println("No es primo");
        } else {
            i = 2;    
            while (n % i != 0) {                           
                i++;
            }
            if (i == n) {    
                System.out.println("Primo");       
            } else {
                System.out.println("No es primo");  
            }
        }*/
    /*Ejercicio 17
        int num, numCifras, aux, i, digito;
        
        do {
            System.out.print("Introduce numero entero >0: ");
            num = sc.nextInt();
        } while (num <= 0);

        
        aux = num;     
        numCifras = 0;             

        
        while (aux != 0) {
            aux = aux / 10;
            numCifras++;
        }

        for (i = numCifras - 1; i >= 0; i--) {
            digito = num / (int) Math.pow(10, i); 
            System.out.print(digito + " ");      
            num = num % (int) Math.pow(10, i);    
        }*/
    /*Ejercicio 18
        int numero, cifra, nuevoNumero;
        
        
        do { 
            System.out.print("Introduce un numero: ");
            numero = sc.nextInt();
        } while (numero <= 0);
        
        nuevoNumero = 0; 
        
        while (numero != 0) {        
            cifra = numero % 10;     
            numero = numero / 10;    
            nuevoNumero = nuevoNumero * 10 + cifra;                               
        }
        
        numero = nuevoNumero;
        
        System.out.println("Número con las cifras invertidas :" + numero);*/
   /*Ejercicio 19
        int n, mayor;     

        System.out.print("Introduce número, para acabar introduce 0: ");
        n = sc.nextInt();
        
        mayor = n; 
        
        while (n != 0) {     
            if (n > mayor) {
                mayor = n;   
            } 
            System.out.print("Introduce número, para acabar introduce 0: ");
            n = sc.nextInt();
        }
        
                       
        if (mayor == 0) {
            System.out.println("No se han introducido números");
        } else {
            System.out.println("El mayor número introducido ha sido: " + mayor);
        }*/
   /*Ejercicio 20
        int num, posicionMayor, cifra, mayor, posicion;
        
        do {
            System.out.print("Introduce numero entero >0: ");
            num = sc.nextInt();
        } while (num <= 0);

        mayor = 0; 
                      

        posicionMayor = 0; 
        posicion = 0; 
            
        while (num != 0) {
               posicion++;
               cifra = num % 10;        
               if (cifra >= mayor) {    
                   mayor = cifra;       
                   posicionMayor = posicion; 
               }
               num = num / 10; 
        }                                   
            
        System.out.print("Cifra mayor: " + mayor); 
            
        System.out.println(" Posición: " + posicionMayor);*/
   /*Ejercicio 21
        int num, aux, posicionMayor, cifra, mayor, posicion, numCifras;

        do {
            System.out.print("Introduce numero entero >0: ");
            num = sc.nextInt();
        } while (num <= 0);

        
        aux = num;
        
        numCifras = 0;
        while (aux != 0) {
                numCifras++;
                aux = aux / 10;
        }

        mayor = 0;
                  
        posicionMayor = 0;     
        posicion = 0; 
        for(int i = numCifras-1; i >= 0; i--){ 
            posicion++;
            cifra = num / (int)Math.pow(10, i); 
            if (cifra > mayor) { 
                mayor = cifra;
                posicionMayor = posicion; 
            }
            num = num % (int)Math.pow(10, i); 
        }
            
        System.out.print("Cifra mayor: " + mayor);
        System.out.println(" Posición: " + posicionMayor);*/
   /*Ejercicio 22
        int num, i, aux, cont, cifra;
        
        do {
            System.out.print("Introduce numero entero positivo: ");
            num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Número no válido");
            }
        } while (num <= 0);

        
        aux = num;
        cont = 0; 
        while (aux != 0) {
              aux = aux / 10;
              cont++;
        }

                                                   
        for (i = cont-1; i >= 0; i--) {

           
            cifra = num / (int) Math.pow(10, i);

            
            switch (cifra) {
                    case 0:
                        System.out.print("cero ");
                        break;
                    case 1:
                        System.out.print("uno ");
                        break;
                    case 2:
                        System.out.print("dos ");
                        break;
                    case 3:
                        System.out.print("tres ");
                        break;
                    case 4:
                        System.out.print("cuatro ");
                        break;
                    case 5:
                        System.out.print("cinco ");
                        break;
                    case 6:
                        System.out.print("seis ");
                        break;
                    case 7:
                        System.out.print("siete ");
                        break;
                    case 8:
                        System.out.print("ocho ");
                        break;
                    case 9:
                        System.out.print("nueve ");
                        break;
            }
            if (i != 0) { 
                System.out.print(" - ");
                num = num % (int) Math.pow(10, i);
            }
            System.out.println();
        }
        System.out.println("Fin de programa");*/
   /*Ejercicio 23
        int n, suma, cifra;
        
        do {
            System.out.print("Introduce un número entero positivo: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Número no válido");
            }
        } while (n <= 0);
        
        suma = 0;                               
        
        while (n != 0) {           
            cifra = n % 10;        
            suma = suma + cifra;   
            n = n / 10;           
        }
        
        System.out.println("La suma de sus cifras es: " + suma);*/
   /*Ejercicio 24
        int N, aux, cifra, numeroCifras = 0;
        double suma;

       
        do {
            System.out.print("Introduce número entero positivo: ");
            N = sc.nextInt();
            if (N <= 0) {
                System.out.println("Error. Debe ser un número positivo");
            }
        } while (N <= 0);

        
        aux = N;
        while (aux != 0) {
            numeroCifras++;
            aux /= 10;
        }

        suma = 0; 
        aux = N;
        while (aux != 0) {      
            cifra = aux % 10;   
            suma = suma + Math.pow(cifra, numeroCifras);       
            aux /= 10;     
        }

        if (suma == N) { 
            System.out.println("Es narcisista");
        } else {
            System.out.println("No es narcisista");
        }*/
   /*Ejercicio 25
        int dni;
        do{
            System.out.print("Introduce número de DNI: ");
            dni = sc.nextInt();
        }while(dni < 1);
        System.out.println("Letra dni -> " + obtenerLetraDNI(dni));*/                                             

    }     
}
