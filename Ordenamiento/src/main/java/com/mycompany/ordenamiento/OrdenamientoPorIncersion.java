
package com.mycompany.ordenamiento;

/**
 *
 * @author isaac
 */
public class OrdenamientoPorIncersion {
    
    public void ordenamiento(int lista[], int longitud){
        int valorActual = 0;
        int indice = 0;
        for(int i = 1; i < longitud; i++){
            valorActual = lista[i];
            indice = i - 1;
            while(indice >= 0 && lista[indice] > valorActual){
                lista[indice + 1] = lista[indice];
                indice = indice - 1;
            }
            lista[indice + 1] = valorActual;
        }
    }
    
}
