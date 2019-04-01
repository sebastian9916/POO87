/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class CapturaTeclado {
    public void operacion (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre =sc.nextLine();
        System.out.println("hola "+ nombre +  ".");
    }
}
