

package com.mycompany.tpfunciones;

import java.util.Scanner;


public class TPFunciones {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      /*Punto 1
        System.out.println("Ingrese el valor de la primer variable: ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el valor de la segunda variable: ");
        int num2 = sc.nextInt();

        swapVariables(num1, num2);

        System.out.println("Variable 1: " + num1 + ", Variable 2: " + num2);
    }

    
    public static void swapVariables(int a, int b) {
        int aux = a;
        a = b;
        b = aux;
    }*/

     /*Punto 2 
        System.out.println("Ingrese un número para saber la cantidad de cifras que tiene: ");
        int num = sc.nextInt();

        int cifras = countDigits(num);

        System.out.println("Tiene " + cifras + " cifras");
    }


    // Método para contar la cantidad de cifras en un número
    public static int countDigits(int number) {
        int cifras = 0;
        while (number != 0) {
            number = number / 10;
            cifras++;
        }
        return cifras;
}
}*/
    /* Punto 3
       convertirTemperatura(sc);
    }

    // Método para convertir temperatura de Celsius a Kelvin y repetir si el usuario lo desea
    public static void convertirTemperatura(Scanner sc) {
        int temperatura;
        String caracter;

        do {
            System.out.println("Introduce la temperatura en C°: ");
            temperatura = sc.nextInt();
            System.out.println("Grados Kelvin: " + (temperatura + 273));
            System.out.println("Repetir proceso? (S/N)");
            caracter = sc.next();
        } while (caracter.equalsIgnoreCase("s"));
    }
} */
    /* Punto 4
    System.out.println("Ingrese un número para saber su tabla: ");
        int num = sc.nextInt();

        imprimirTabla(num);
    }

    // Método para imprimir la tabla de multiplicar de un número
    public static void imprimirTabla(int numero) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " x " + numero + " = " + (numero * i));
        }
    }
}*/
    /* Punto 5
    System.out.println("Ingrese la cantidad de números que desea saber si terminan en 2: ");
        int num = sc.nextInt();

        int contador = contarNumerosTerminadosEn2(sc, num);

        System.out.println("La cantidad de números que terminan en 2 de los " + num + " números ingresados son: " + contador);
    }

    // Método para contar números terminados en 2
    public static int contarNumerosTerminadosEn2(Scanner sc, int cantidad) {
        int contador = 0;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            int n = sc.nextInt();
            if (n % 10 == 2) {
                contador++;
            }
        }
        return contador;
    }
}*/
    /*Punto 6
     System.out.println("Ingrese un número para saber si es perfecto: ");
        int num = sc.nextInt();

        boolean esPerfecto = verificarNumeroPerfecto(num);

        if (esPerfecto) {
            System.out.println("Es un número perfecto");
        } else {
            System.out.println("No es un número perfecto");
        }
    }

    // Método para verificar si un número es perfecto
    public static boolean verificarNumeroPerfecto(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma = suma + i;
            }
        }
        return suma == numero;
    }
}*/
    /* Punto 7
      System.out.println("Ingrese los números para saber si son amigos");
        System.out.println("Ingrese el primer número");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = sc.nextInt();

        boolean sonAmigos = sonNumerosAmigos(num1, num2);

        if (sonAmigos) {
            System.out.println("Son números amigos");
        } else {
            System.out.println("No son números amigos");
        }
    }

    // Método para verificar si dos números son amigos
    public static boolean sonNumerosAmigos(int num1, int num2) {
        int suma1 = 0;
        int suma2 = 0;

        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                suma1 = suma1 + i;
            }
        }

        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0) {
                suma2 = suma2 + i;
            }
        }

        return suma1 == num2 && suma2 == num1;
    }
}*/
    /* Punto 8
         int numero;
        do {
            System.out.print("Introduce un número mayor que 1: ");
            numero = sc.nextInt();
        } while (numero <= 1);

        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");
        
        imprimirSerieFibonacci(numero);
    }

    // Método para imprimir los primeros n términos de la serie de Fibonacci
    public static void imprimirSerieFibonacci(int n) {
        int fibo1 = 1;
        int fibo2 = 1;

        System.out.print(fibo1 + " ");
        for (int i = 2; i <= n; i++) {
            System.out.print(fibo2 + " ");
            int temp = fibo2;
            fibo2 = fibo1 + fibo2;
            fibo1 = temp;
        }
        System.out.println();
    }
}*/
    /* Punto 9
    System.out.println("Introduzca el número decimal para pasarlo a binario: ");
        int num = sc.nextInt();

        String numBinario = convertirDecimalABinario(num);

        System.out.println("El número binario es: " + numBinario);
    }

    // Método para convertir un número decimal a binario
    public static String convertirDecimalABinario(int numeroDecimal) {
        String numBinario = "";
        while (numeroDecimal != 0) {
            if (numeroDecimal % 2 == 0) {
                numBinario = "0" + numBinario;
            } else {
                numBinario = "1" + numBinario;
            }
            numeroDecimal = numeroDecimal / 2;
        }
        return numBinario;
    }
}*/
    /* Punto 10
       System.out.print("Introduce un número binario: ");
        String binario = sc.nextLine();

        int decimal = convertirBinarioADecimal(binario);

        if (decimal != -1) {
            System.out.println("El número decimal es: " + decimal);
        } else {
            System.out.println("Número binario no válido.");
        }
    }

    // Método para convertir un número binario a decimal
    public static int convertirBinarioADecimal(String binario) {
        int decimal = 0;
        
        for (int i = binario.length() - 1, exponente = 0; i >= 0; i--, exponente++) {
            char digito = binario.charAt(i);
            
            if (digito == '0' || digito == '1') {
                int valor = Character.getNumericValue(digito);
                decimal += valor * Math.pow(2, exponente);
            } else {
                return -1; // Número binario no válido
            }
        }
        
        return decimal;
    }
}*/
    }
}
