/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import logica.CapturaTeclado;
import logica.EjemploCiclo;
import logica.EjemploCondicional;

/**
 *
 * @author Estudiantes
 */
public class principal {
    
    public static void main(String [] args){
        CapturaTeclado ct = new CapturaTeclado();
        EjemploCondicional ec = new EjemploCondicional();
        EjemploCiclo eci = new EjemploCiclo();
        System.out.println("Ejemplo de captura: ");
        ct.operacion();
        System.out.println("Ejemplo de condicional: ");
        ec.operacion();
        System.out.println("Ejemplo ciclo: ");
        eci.operacion();
    }
    
}
