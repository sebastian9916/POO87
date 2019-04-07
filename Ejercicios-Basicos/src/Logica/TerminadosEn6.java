/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Scanner;

/**
 *
 * @author SEBASTIAN
 */
public class TerminadosEn6 {

    public int ParImpar(int a) {

        if (a % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

        return 0;
    }

    public int Pares(int a) {

        for (a = 1; a == 25; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
        return 0;
    }

    public float Media(float a, float x) {
        float aux = 0;
        System.out.println("Ingrese la cantidad de numeros a evaluar");

        Scanner num = new Scanner(System.in);
        a = num.nextFloat();

        for (int i = 0; i < a; i++) {

            System.out.println("Ingrese el numero " + (i + 1));
            x = num.nextFloat();
            aux += x;

        }
        x = aux / a;

        return x;
    }

    public int CopiaConsecutivos(int arrayX[], int arrayY[]) {
        for (int i = 0; i < 5; i++) {
            arrayX[i] = i;
        }
        for (int i = 0; i < 5; i++) {
            arrayX[i] = arrayY[i];
        }
        return 0;
    }

    public int MultMatriz(int array[][]) {

        array = new int[3][3];
        array[0][0] = 5;
        array[0][1] = 6;
        array[0][2] = 13;
        array[1][0] = 14;
        array[1][1] = 2;
        array[1][2] = 4;
        array[2][0] = 21;
        array[2][1] = 7;
        array[2][2] = 6;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] *= 2;
            }
        }
        return 0;
    }
    public boolean Palindromo (String palabra){
        
        for(int i=0; i< palabra.length(); i++){
            if(palabra.charAt(i)!= palabra.length()-i-1){
                return false;
            }
        }
        return true;       
    }
    public  String Palind (){
        
        String palabra= "yosoy";
        
        if (Palindromo(palabra) == true){
            System.out.println("La frase \"%s\" es un palindromo");
            
        } else {
            System.out.println("La frase \"%s\" no es un palindromo");
        }
        
        return "";
    }
}
