/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeros;

import ejercicio.Numeros;

/**
 *
 * @author josea
 */
public class PositivosYNegativos extends Numeros{

    public PositivosYNegativos() {
    }

    public PositivosYNegativos(int num1, int num2) {
        super(num1, num2);
    }

    
    public void positivosNegativos(){
        
        if (num1 >= 0 ){
            System.out.println("Numero 1 es positivo");
        }else {
            System.out.println("Numero 1 es negativo");
        }
        
        if(num2 >= 0){
            System.out.println("Numero 2 es positivo");
        }else {
            System.out.println("Numero 2 es negativo");
        }
    }
}
