/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.swing.JOptionPane;

public class TerminadasEn8 {

    public int HHMMSS(int h, int m, int s) {

        s = 3700;
        h = s / 3600;
        s = s % 3600;
        m = s / 60;
        s = s % 60;

        System.out.println("El tiempo en formato HHMMSS es:  " + h + ":" + m + ":" + s);
        return 0;
    }

    public int DSemana(int dia) {

        switch (dia) {

            case 1:
                System.out.println("Es lunes!");
                break;

            case 2:
                System.out.println("Es martes!");
                break;
            case 3:
                System.out.println("Es miercoles!");
                break;
            case 4:
                System.out.println("Es jueves!");
                break;
            case 5:
                System.out.println("Es viernes!");
                break;
            case 6:
                System.out.println("Es sabado!");
                break;
            case 7:
                System.out.println("Es domingo!");
                break;

        }
        return 0;
    }

    public int sumatoria(int k) {

        k = (10 * (10 + 1));
        k /= 2;

        return k;
    }

    public int NumerosPrimos(int num, int num2) {

        num = 0;
        num2 = num - 1;

        while ((num % num2) != 0) {

            num2--;

        }
        if (num2 == 1) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
        return 0;
    }

    public int SumArreglo(int a, int b, int array[]) {

        array = new int[20];
        a = 2;
        b = 0;
        for (int i = 0; i < 20; i++) {
            array[i] = a;
            b += a;
            a += 2;
        }
        return 0;
    }

    public int SumMatriz(int a, int b, int array[][]) {

        array = new int[2][5];
        array[0][0] = 5;
        array[0][1] = 6;
        array[0][2] = 7;
        array[0][3] = 9;
        array[0][4] = 0;
        array[1][0] = 11;
        array[1][1] = 8;
        array[1][2] = 2;
        array[1][3] = 0;
        array[1][4] = 0;
        for (int i = 0; i < 2; i++) {
            a = 0;
            for (int j = 0; j < 5; j++) {
                a += array[i][j];
                array[i][5] = a;
            }
        }
        return 0;
    }

    public String MayMin(String a, String b) {
        a = "";
        b = "";
        a = JOptionPane.showInputDialog(null, "Ingrese la frase o palabra");
        b = a;

        return "";
    }

    public int Pow(int a, int b) {
        int pow = a;
        for (int i = 0; i < b; i++) {
            pow *= a;
        }
        return pow;
    }
    
}
