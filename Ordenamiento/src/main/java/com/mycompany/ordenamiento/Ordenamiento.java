
package com.mycompany.ordenamiento;

/**
 *
 * @author isaac
 */
public class Ordenamiento {

    public static void main(String[] args) {
        int lista[] = new int[5];
        lista[0] = 905;
        lista[1] = 210;
        lista[2] = 550;
        lista[3] = 102;
        lista[4] = 443;
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
        System.out.println("");
        
        OrdenamientoPorIncersion orden = new OrdenamientoPorIncersion();
        orden.ordenamiento(lista, 5);
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
   }
}
