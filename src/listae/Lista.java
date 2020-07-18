/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listae;

import javax.swing.JOptionPane;

/**
 *
 * @author jordy
 */
public class Lista {

    Nodo Inicio;
    Nodo Fin;

    public Lista() {
        Inicio = null;
        Fin = null;
    }

    boolean Vacio() {
        if (Inicio == null) {
            JOptionPane.showMessageDialog(null, "No hay datos enlazados", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }

    void Insertar() {
        String dato, nombre, correo;
        boolean b;
        dato = JOptionPane.showInputDialog(null, "\n\tDato: ", "\tInsertar ", JOptionPane.QUESTION_MESSAGE);
        if (Inicio == null) {
            nombre = JOptionPane.showInputDialog(null, "\n\tNombre: ", "\tInsertar ", JOptionPane.QUESTION_MESSAGE);
            correo = JOptionPane.showInputDialog(null, "\n\tCorreo: ", "\tInsertar ", JOptionPane.QUESTION_MESSAGE);
            Nodo nuevo = new Nodo(dato, nombre, correo);

            Inicio = nuevo;
            Fin = nuevo;

        } else {
            b = Buscar(dato);
            if (b == false) {
                nombre = JOptionPane.showInputDialog(null, "\n\tNombre: ", "\tInsertar ", JOptionPane.QUESTION_MESSAGE);
                correo = JOptionPane.showInputDialog(null, "\n\tCorreo: ", "\tInsertar ", JOptionPane.QUESTION_MESSAGE);
                Nodo nuevo = new Nodo(dato, nombre, correo);

                Fin.Siguiente = nuevo;
                Fin = nuevo;
            }
        }
    }

    boolean Buscar(String dato) {
        Nodo Aux = Inicio;
        while (Aux != null) {
            if (dato.equals(Aux.Dato)) {
                JOptionPane.showMessageDialog(null, "\n\tEl dato ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                return true;
            }
            Aux = Aux.Siguiente;
        }
        return false;
    }

    void In() {
        JOptionPane.showMessageDialog(null, "" + Inicio, "\tVer Inicio", JOptionPane.INFORMATION_MESSAGE);
    }

    void Fn() {
        JOptionPane.showMessageDialog(null, "" + Fin, "\tVer Fin", JOptionPane.INFORMATION_MESSAGE);
    }

    void Mostrar() {
        Nodo Aux = Inicio;
        String Dat = "";
        while (Aux != null) {
            Dat = Dat + Aux;
            Aux = Aux.Siguiente;
        }
        JOptionPane.showMessageDialog(null, "" + Dat, "\tMostrar", JOptionPane.INFORMATION_MESSAGE);
    }

    void BuscarD() {
        Nodo Aux = Inicio;
        String Dato;
        int b;
        b = 0;
        Dato = JOptionPane.showInputDialog(null, "\n\tDato :", "\tBusca Dato", JOptionPane.QUESTION_MESSAGE);
        while (Aux != null) {
            if (Dato.equals(Aux.Dato)) {
                JOptionPane.showMessageDialog(null, "" + Aux, "\tBusca Dato", JOptionPane.INFORMATION_MESSAGE);
                b = 1;
                break;
            }
            Aux = Aux.Siguiente;
        }
        if (b == 0) {
            JOptionPane.showMessageDialog(null, "\n\tEl dato no existe", "\tError", JOptionPane.ERROR_MESSAGE);
        }
    }

    void Modificar() {
        Nodo Aux = Inicio;
        String Dato;
        int b;
        b = 0;
        Dato = JOptionPane.showInputDialog(null, "\n\tDato :", "\tBusca Dato", JOptionPane.QUESTION_MESSAGE);
        while (Aux != null) {
            if (Dato.equals(Aux.Dato)) {
                b = 1;
                Aux.Nombre = JOptionPane.showInputDialog(null, "\n\tNombre : ", "\tModifica Dato - Nodo", JOptionPane.INFORMATION_MESSAGE);
                Aux.Correo = JOptionPane.showInputDialog(null, "\n\tCorreo : ", "\tModifica Dato - Nodo", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            Aux = Aux.Siguiente;
        }
        if (b == 0) {
            JOptionPane.showMessageDialog(null, "\n\tEl dato no existe", "\tError", JOptionPane.ERROR_MESSAGE);
        }
    }

    void Eliminar() {
        Nodo Aux = Inicio;
        String Dato;
        int Contador = 1;
        int Contador2 = 1;
        Nodo AuxA = Aux;
        int b = 0;
        Dato = JOptionPane.showInputDialog(null, "\n\tDato: ", "\tEliminar Dato - Nodo", JOptionPane.QUESTION_MESSAGE);
        while (Aux != null) {
            if (Dato.equals(Aux.Dato)) {
                b = 1;
                JOptionPane.showMessageDialog(null,"" + Aux,"\tEliminar",JOptionPane.WARNING_MESSAGE);
                if (Inicio == Fin) {
                    Inicio = null;
                    Fin = null;
                } else {
                    if (Aux == Inicio) {
                    Inicio = Inicio.Siguiente;
                } else{
                       if (Aux == Fin) {
                            Contador2 = 1;
                            do {
                                Contador2++;
                                AuxA = AuxA.Siguiente;
                            } while (Contador2 < (Contador-1));
                            Fin = AuxA;
                            Fin.Siguiente = null;
                        }
                        else{
                            Contador2 = 1;
                            while(Contador2 < (Contador-1)){
                                Contador2++;
                                AuxA = AuxA.Siguiente;
                            }
                            Aux = Aux.Siguiente;
                            AuxA.Siguiente = Aux;
                       }
                    }
                }
                        break;
            }
            Aux = Aux.Siguiente;
            Contador++;
        }
    if(b == 0){
            JOptionPane.showMessageDialog(null, "\n\tEl dato no existe", "\tError", JOptionPane.ERROR_MESSAGE);
    }
  }
}

