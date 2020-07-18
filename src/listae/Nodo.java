
package listae;

/**
 *
 * @author jordy
 */
public class Nodo {
    String Dato;
    String Nombre;
    String Correo;
    Nodo Siguiente;
    Nodo Anterior;
    
    public Nodo(String D, String N, String C) {
        Dato = D;
        Nombre = N;
        Correo= C;
        Siguiente = null;
        Anterior = null;
    }

    @Override
    public String toString() {
        return "\n\tDato: " + Dato + "\n\tNombre: " + Nombre + "\n\tCorreo: " + Correo + "\n";
    }
    
    
}
