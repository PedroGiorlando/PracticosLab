package com.mycompany.tparrays;

import java.util.Random;
import java.util.Scanner;


public class TPArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Ejercicio 1
        int i;
        int pos = 0, neg = 0; 
        int[] numeros = new int[10]; 
        double sumaPos = 0, sumaNeg = 0;                   
        
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=sc.nextInt();
        }
        
        for (i = 0; i < 10; i++) {
            if (numeros[i] > 0){ 
                sumaPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0){ 
                sumaNeg += numeros[i];
                neg++;
            }
        }
        
        if (pos != 0) {
            System.out.println("Media de los valores positivos: " + sumaPos / pos);                
        } else {
            System.out.println("No ha introducido numeros positivos");
        }
        if (neg != 0) {
            System.out.println("Media de los valores negativos: " + sumaNeg / neg);
        } else {
            System.out.println("No ha introducido numeros negativos");
        }*/
        /*Ejercicio 2
        int i;
        int[] numeros = new int[10];
        double media = 0;

        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }
        
        for (i = 0; i < 10; i++) {
            if (i % 2 == 0){ 
                media = media + numeros[i]; 
            }
        }
        
        System.out.println("Media de los valores que se encuentran en posiciones pares: "+ media/5);*/
        /*Ejercicio 3
        int numAlum, i;
        double suma = 0, media;
        
        do {
            System.out.print("Número de alumnos de la clase: ");
            numAlum = sc.nextInt();
        } while (numAlum <= 0);

        double[] notas = new double[numAlum]; 
        
        for (i = 0; i < notas.length; i++) {
            System.out.print("Alumno " + (i + 1) + " Nota final: ");
            notas[i] = sc.nextDouble();
        }

        for (i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }

        media = suma / notas.length;

        System.out.printf("Nota media del curso: %.2f %n", media);

        
        System.out.println("Listado de notas superiores a la media: ");
        for (i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno numero " + (i + 1)+ " Nota final: " + notas[i]);
            }
        }*/
        /*Ejercicio 4
        int i, cont = 2;

        int[] pares = new int[20];

        for (i = 0; i < pares.length; i++) {
            pares[i] = cont;
            cont += 2;
        }
         
        for (i = 0; i < pares.length; i++) {
            System.out.println(pares[i]);
        }*/
        /*Ejercicio 5
        int[] numeros = new int[10];
        int pos = 0, neg = 0, cero = 0; 
        int i;
                                                   
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }
  
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                pos++;
            } else if (numeros[i] < 0) {
                neg++;
            } else {
                cero++;
            }
        }
  
        System.out.println("Positivos: " + pos);                                                                  
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cero);*/
        /*Ejercicio 6
        int[] numeros = new int[10];
        int pos = 0, neg = 0;  
        int i;
        double sumaPos = 0, sumaNeg = 0;                                          
  
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=sc.nextInt();
        }
  
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0){ 
                sumaPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0){ 
                sumaNeg += numeros[i];
                neg++;
            }
        }
  
        if (pos != 0) {
            System.out.println("Media de los valores positivos: " + sumaPos / pos);
        } else {
            System.out.println("No ha introducido números positivos");
        }
        if (neg != 0) {
            System.out.println("Media de los valores negativos: " + sumaNeg / neg);                               
        } else {
            System.out.println("No ha introducido números negativos");
        }*/
        /*Ejercicio 7
        int i, N;
        int contMas = 0, contMenos = 0;
        double media = 0;
  
        do{
            System.out.print("Número de personas: ");                                                             
            N = sc.nextInt();
        }while(N<=0);
  
        double[] alto = new double[N];
  
        System.out.println("Lectura de la altura de las personas: ");
        for (i = 0; i < N; i++) {
            System.out.print("persona " + (i+1) + " = ");
            alto[i] = sc.nextDouble();
            media = media + alto[i];                           
        }
  
        media = media / N;
  

        for (i = 0; i < alto.length; i++) {
            if (alto[i] > media){ 
                contMas++;
            } else if (alto[i] < media){
                contMenos++;
            }
        }
  
        System.out.println("Estatura media: " + media);
        System.out.println("Personas con estatura superior a la media: " + contMas);
        System.out.println("Personas con estatura inferior a la media: " + contMenos);*/
  
        /*Ejercicio 8
        String[] empleados = new String[20];
        double[] sueldos = new double[20];

        String nombreMayor;
        double mayorSueldo;

        int i = 0;

        System.out.println("Lectura de nombres y sueldos de empleados: ");                                        
        System.out.print("Empleado " + (i + 1) + ": ");
        empleados[i] = sc.nextLine();
        System.out.print("Sueldo: ");
        sueldos[i] = sc.nextDouble();

        mayorSueldo = sueldos[i];
        nombreMayor = empleados[i];

        for (i = 1; i < empleados.length; i++) {
            sc.nextLine(); 
            System.out.print("Empleado " + (i + 1) + ": ");
            empleados[i] = sc.nextLine();
            System.out.print("Sueldo: ");
            sueldos[i] = sc.nextDouble();
            
            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                nombreMayor = empleados[i];
            }
        }

        System.out.println("Empleado con mayor sueldo: " + nombreMayor );                                         
        System.out.println("Sueldo: " + mayorSueldo);*/
        /*Ejercicio 9
        int tamano = 10;

        Random random = new Random();

        int[] array = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            
            int numeroAleatorio = random.nextInt(100) + 1;

            array[i] = numeroAleatorio;
        }

        System.out.print("Array de números aleatorios: ");
        for (int i = 0; i < tamano; i++) {
            System.out.print(array[i] + " ");
        }*/
        /*Ejercicio 10
        int filas, columnas;

        do {
            System.out.print("Número de filas: ");
            filas = sc.nextInt();
        } while (filas < 1);
        do {
            System.out.print("Número de columnas: ");
            columnas = sc.nextInt();
        } while (columnas < 1);

        int[][] A = new int[filas][columnas];
        int[][] B = new int[filas][columnas];
        int[][] C = new int[filas][columnas];

        System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");                                            
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("matriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
      
        System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nmatriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.printf("%3d", B[i][j]);
            }
            System.out.println();
        }

        
        System.out.println("\nmatriz Suma:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.printf("%3d", C[i][j]);
            }
            System.out.println();
        }*/
        /*Ejercicio 11
        int[][] matrizOriginal = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int filas = matrizOriginal.length;
        int columnas = matrizOriginal[0].length;

        int[][] matrizTranspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }

        System.out.println("Matriz Original:");
        imprimirMatriz(matrizOriginal);

        System.out.println("Matriz Transpuesta:");
        imprimirMatriz(matrizTranspuesta);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }*/
        /*Ejercicio 12
        int[][] M = crearArray();

        
        cuadradoMagico(M);

      
        mostrarMatriz(M);
    }

    public static int[][] crearArray() {
        Scanner sc = new Scanner(System.in);
        int filas;
        
        do {
            System.out.print("Número de filas (impar): ");
            filas = sc.nextInt();
        } while (filas % 2 == 0 || filas < 0);
        
        int[][] A = new int[filas][filas];
        return A;
    }

    public static void cuadradoMagico(int[][] matriz) {                                                           
        int N = matriz.length;
        int i = 0, j = N / 2, cont = 1;
        boolean multiplo = false;
        matriz[i][j] = cont; 
        for (cont = 2; cont <= N * N; cont++) { 
            if (!multiplo) {        
                i--;               
                if (i < 0){ 
                    i = N - 1;
                }
                j++;                
                if (j >= N){ 
                    j = 0; 
                }
            } else {                
                i++;                
                if (i >= N){
                    i = 0;
                }
            }
            matriz[i][j] = cont;
            if (cont % N == 0){     
                multiplo = true;
            } else { 
                multiplo = false;
            }
        }
    }

    public static void mostrarMatriz(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println();
        }*/
        /*Ejercicio 13
        int N = leerFilas();
        
      
        int[][] M = cuadradoLatino(N);

    
        mostrarMatriz(M);

    }

    public static int leerFilas() {
        Scanner sc = new Scanner(System.in);
        int filas;
      
        do {
            System.out.print("Número de filas > 2: ");
            filas = sc.nextInt();
        } while (filas <= 2);
        return filas;
    }

    public static int [][] cuadradoLatino(int n) {
       
        int [][] a = new int[n][n];
        for (int j = 0; j < a.length; j++) { 
            a[0][j] = j + 1;
        }

        for (int i = 1; i < a.length; i++) { 
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = a[i - 1][j];
            }
            desplazarDerecha(a[i]);    
        }
        return a;
    }

    public static void desplazarDerecha(int[] a) {
        int aux = a[a.length - 1];                     
        for (int i = a.length - 1; i > 0; i--) { 
            a[i] = a[i - 1];                     
        }
        a[0] = aux;                      
    }

    public static void mostrarMatriz(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println();
        }*/
        
    }
}
