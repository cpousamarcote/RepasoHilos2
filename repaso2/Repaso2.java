/*
 * Programa en Java que cree 4 hilos que acceden a una variable compartida que es un contador.
 * Cada uno de los hilos accede cuatro veces al contador y aumenta en una unidad su valor.
 */
package repaso2;

/**
 *
 * @author findag
 */
public class Repaso2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Creamos 4 hilos distintos.
        Hilo hilo1 = new Hilo();
        Hilo hilo2 = new Hilo();
        Hilo hilo3 = new Hilo();
        Hilo hilo4 = new Hilo();
        
        // Lanzamos los hilos.
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        
    }
    
}
