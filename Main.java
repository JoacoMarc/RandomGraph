import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda Arbol = new ArbolBinarioBusqueda();

        Arbol.insertar(new NodoArbol(1, 0.2));
        Arbol.insertar(new NodoArbol(2, 0.9));
        Arbol.insertar(new NodoArbol(3, 0.5));
        Arbol.insertar(new NodoArbol(4, 0.4));
        Arbol.insertar(new NodoArbol(5, 0.3));
        Arbol.insertar(new NodoArbol(6, 0.1));
        Arbol.insertar(new NodoArbol(7, 0.8));
        Arbol.insertar(new NodoArbol(8, 0.7));
        Arbol.insertar(new NodoArbol(9, 0.5));
        Arbol.insertar(new NodoArbol(10, 0.6));


        List<Nodo> nodos = Arbol.enOrden();
        for (Nodo nodo : nodos) {
            System.out.println("ID del Nodo: " + nodo.obtenerId() + ", Probabilidad: " + nodo.obtenerProbabilidad());
        }

        Nodo nodoBuscado = Arbol.buscar(4);
        if (nodoBuscado != null) {
            System.out.println("ID del Nodo Buscado: " + nodoBuscado.obtenerId() + ", Probabilidad: " + nodoBuscado.obtenerProbabilidad());
        } else {
            System.out.println("No se encontró ningún nodo con el ID dado.");
        }
    }
}
