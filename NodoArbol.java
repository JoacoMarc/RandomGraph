public class NodoArbol implements Nodo {
    private final int id;
    private double probabilidad;
    private NodoArbol izquierda;
    private NodoArbol derecha;



    public NodoArbol(int id, double probabilidad) {
        this.id = id;
        this.probabilidad = probabilidad;
    }

    @Override
    public int obtenerId() {
        return id;
    }

    @Override
    public double obtenerProbabilidad() {
        return probabilidad;
    }

    @Override
    public void establecerProbabilidad(double probabilidad) {
        this.probabilidad = probabilidad;
    }

    public NodoArbol getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoArbol izquierda) {
        this.izquierda = izquierda;
    }

    public NodoArbol getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoArbol derecha) {
        this.derecha = derecha;
    }
}
