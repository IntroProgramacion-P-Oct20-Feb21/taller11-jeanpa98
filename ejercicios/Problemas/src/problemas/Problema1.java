/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *Generar un procedimiento (método que no devuelva valor) que imprima los valor
 * pares de un arreglo bidimensional.
El arreglo para probar la solución es:

int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
 * @author reroes
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TODO code application logic here
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        obtenerValor(informacion);
    }
    public static void obtenerValor(int [][] arreglo){
        String cadena = "" ;
        for(int fila = 0; fila < arreglo.length; fila++){
            for(int col = 0; col < arreglo[fila].length; col++){
                if(arreglo[fila][col] % 2 == 0) {
                    cadena = String.format("%s%d\t",cadena, arreglo[fila][col]);
                    
            }
            }
        }
        System.out.printf("Los numero pares son: \n%s",cadena);
    }
    }

    
    

