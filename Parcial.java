
package parcial;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class Parcial {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Lista lista = new Lista();
        short opcion = 0;
        int precio = 0;
        int cantidad = 0;
        double suma = 0;
        int tc = 0;
        int iva = 0;

        while (opcion != 5) {
            System.out.println(".:MENU:.");
            System.out.println("\n1-Agregar productos a la Factura  "
                    + "\n2-Eliminar productos de la Factura "
                    + "\n3-Modificar los Elementos  "
                    + "\n4-Modificar la Factura  "
                    + "\n5-Salir");
            System.out.println("Que accion decea ejecutar");
            opcion = leer.nextShort();

            switch (opcion) {
                case 1:
                    precio = (int) ((Math.random() * 100) + 1);
                    cantidad = (int) ((Math.random() * 20) + 1);
                    suma += precio * cantidad;
                    lista.agregarAlInicio(precio, cantidad);
                    System.out.println("          <<-- Lista -->>");
                    System.out.println("");
                    lista.listar();
                    break;
                case 2:
                    System.out.println("\nCual pocion deces eliminar");
                    int pos = leer.nextInt();
                    lista.moverPorPosicion(pos);
                    System.out.println(lista.getTamanio());
                    System.out.println("          <<-- Lista -->>\n¡Listo!");
                    lista.listar();
                    break;
                case 3:
                    System.out.println("Cual Poscion decea sustituir");
                    int opcion1 = leer.nextInt();
                    System.out.println("Por cual");
                    int opcion2 = leer.nextInt();
                    lista.Cambio(opcion1, opcion2);
                    lista.listar();
                    break;
                case 4:
                    lista.listar();
                    lista.total(suma);
                    break;

            }
            System.out.println(" \n------------------------------------------- ");
            lista.total(suma);
        }
        
    }
    
}
