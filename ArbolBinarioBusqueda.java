import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArbolBinarioBusqueda implements InterfazArbolBinario{
    private NodoArbol raiz;
    private Random aleatorio;

    public ArbolBinarioBusqueda() {
        this.aleatorio = new Random();
    }

    @Override
    public void insertar(Nodo nodo) {
        raiz = insertarRec(raiz, nodo);
    }

    private NodoArbol insertarRec(NodoArbol raiz, Nodo nodo) {
        if (raiz == null) {
            System.out.println(nodo.obtenerId() + " se inserta en la raíz");
            return (NodoArbol) nodo;
        }

        if (aleatorio.nextDouble() < nodo.obtenerProbabilidad()) {
            if (raiz.getIzquierda() == null) {
                System.out.println(nodo.obtenerId() + " inserta a la IZQUIERDA");
                raiz.setIzquierda((NodoArbol) nodo);
            } else {
                System.out.println(nodo.obtenerId() + " sigue a la IZQUIERDA");
                raiz.setIzquierda(insertarRec(raiz.getIzquierda(), nodo));
            }
        } else {
            if (raiz.getDerecha() == null) {
                System.out.println(nodo.obtenerId() + " inserta a la DERECHA");
                raiz.setDerecha((NodoArbol) nodo);
            } else {
                System.out.println(nodo.obtenerId() + " sigue a la DERECHA");
                raiz.setDerecha(insertarRec(raiz.getDerecha(), nodo));
            }
        }

        return raiz;
    }

    @Override
    public Nodo buscar(int id) {
        return buscarRec(raiz, id);
    }

    private Nodo buscarRec(NodoArbol raiz, int id) {
        if (raiz == null) {
            return null;
        }
        if (raiz.obtenerId() == id) {
            return raiz;
        }

        Nodo resultado = buscarRec(raiz.getIzquierda(), id);
        if (resultado == null) {
            resultado = buscarRec(raiz.getDerecha(), id);
        }
        return resultado;
    }

    @Override
    public List<Nodo> enOrden() {
        List<Nodo> nodos = new ArrayList<>();
        enOrdenRec(raiz, nodos);
        return nodos;
    }

    private void enOrdenRec(NodoArbol raiz, List<Nodo> nodos) {
        if (raiz != null) {
            enOrdenRec(raiz.getIzquierda(), nodos);
            nodos.add(raiz);
            enOrdenRec(raiz.getDerecha(), nodos);
        }
    }
}
