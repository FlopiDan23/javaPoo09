/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Enrico
 */
public class Matematica {
    private int num1;
    private int num2;
    public Matematica(){
        
    }

    public Matematica(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
     public int getNum1() {
        return num1;
     }
     public int getNum2() {
        return num2; 
     }
      public void setNum1(int num1) {
        this.num1=num1;
     }
       public void setNum2(int num2) {
        this.num2=num2;
     }
     public void devolverMayor(){

        if(num1 == num2){
            System.out.println("Son iguales");
        }else if(num1 < num2) {
            System.out.println("El numero 2 es mayor");
        }else {
            System.out.println("El numero 1 es mayor");
        }
    }
     public double calcularPotencia(){
         double potencia;
         if ( num1 >=  num2) {
          potencia=(Math.pow(num1,num2));         
         }else{
          potencia=(Math.pow(num2, num1)); 
          
         }
         return potencia;
         
     }
     public void calcularRaíz(){
         double raíz;
         if(num1< num2){
             raíz=Math.sqrt(num1);
         }else{
             raíz=Math.sqrt(num2);
         }
          System.out.println("La raiz es: " + raíz);
     }
}
