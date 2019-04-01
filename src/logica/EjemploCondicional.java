/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class EjemploCondicional {
    public void operacion (){
        Random r = new Random();
        int numero = r.nextInt();
        if (numero%2==0) {
            System.out.println(numero +" Es par");
        } else {
            System.out.println(numero +" Es impar");
        }
    }
}
