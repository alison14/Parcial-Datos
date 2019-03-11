
package parcial;

/**
 *
 * @author Daniela
 */
public class Lista {
    private Nodo inicio;
    private int tamanio;
    private int cantidad;

    public void Lista() {
        inicio = null;
        tamanio = 0;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void agregarAlInicio(int valor, int cantidad) {

        Nodo nuevo = new Nodo();

        nuevo.setValor(valor, cantidad);
        if (esVacia()) {
            inicio = nuevo;
        } else {

            nuevo.setSiguiente(inicio);

            inicio = nuevo;
        }

        tamanio++;
    }

    public void listar() {

        if (!esVacia()) {

            Nodo aux = inicio;

            int i = 0;
            System.out.println("   Productos <-----> Cantidad <------> Valor ");
            while (aux != null) {

                System.out.println(i + "          " + i + "        " + aux.getCantidad() + "  " + "         " + aux.getValor() + "  ");

                aux = aux.getSiguiente();

                i++;
            }
        }
    }

    public void moverPorPosicion(int posicion) {

        if (posicion >= 0 && posicion < tamanio) {

            if (posicion == 0) {

                inicio = inicio.getSiguiente();
            } else {

                Nodo aux = inicio;

                for (int i = 0; i < posicion - 1; i++) {
                    aux = aux.getSiguiente();
                }

                Nodo siguiente = aux.getSiguiente();

                aux.setSiguiente(siguiente.getSiguiente());
            }

            tamanio--;
        }
    }

    public void Cambio(int pos1, int pos2) {
        Nodo aux = inicio;
        Nodo aux1 = inicio;
        Nodo aux2 = inicio;
        for (int i = 0; i < pos2; i++) {
            aux2 = aux2.getSiguiente();
        }
        int auxiliar_canti = aux2.getCantidad();
        int auxiliar_valor = aux2.getValor();

        if (pos1 >= 0 && pos1 < tamanio) {
            if (pos1 == 0) {
                int valor1 = aux1.getValor();
                int cantidad1 = aux1.getCantidad();
                inicio.setValor(auxiliar_valor, auxiliar_canti);
                aux2.setValor(valor1, cantidad1);
            } else {
                for (int i = 0; i < pos1; i++) {
                    aux = aux.getSiguiente();
                }
                int valor1 = aux.getValor();
                int cantidad1 = aux.getCantidad();
                aux.setValor(auxiliar_valor, auxiliar_canti);
                aux2.setValor(valor1, cantidad1);
            }
        }
    }

    public void total(double suma) {
        System.out.println("Total                               " + suma);
        double iva = suma * 0.19;
        System.out.println("Impuesto                            " + iva);
        double total = (short) iva + suma;
        System.out.println("Total a Pagar                       " + total);
    }
}
