/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoo.ej09.math;

import Entidad.Matematica;

/**
 *
 * @author Enrico
 */
public class JavaPOOEj09Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int aleatorio1 = (int) (Math.random()* 10);//los numeros son aleatorios, no los ingresa el usuario
    int aleatorio2 = (int) (Math.random() * 10);
    Matematica matematica=new Matematica(aleatorio1,aleatorio2);
        System.out.println("número 1: " + matematica.getNum1() + "número 2: "  + matematica.getNum2());
    matematica.devolverMayor();
        System.out.println("La potencia es: " + matematica.calcularPotencia());
    matematica.calcularRaíz();
    
    
   }
}
