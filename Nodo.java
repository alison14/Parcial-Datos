
package parcial;

/**
 *
 * @author Daniela
 */
class Nodo {
    private int valor;
    private int cant;
    private Nodo siguiente;

    public void Nodo() {
        this.valor = 0;
        this.cant = 0;
        this.siguiente = null;
    }

    public int getValor() {
        return valor;
    }

    public int getCantidad() {
        return cant;
    }

    public void setValor(int valor, int canti) {
        this.valor = valor;
        this.cant = canti;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
