
package listae;

import javax.swing.JOptionPane;

/**
 *
 * @author jordy
 */
public class ListaE {

    
    public static void main(String[] args) {
        Lista c = new Lista();
       int opcion;
       String op;
       do{
           op = JOptionPane.showInputDialog(null,"\n\tMenu"
                   + "\n\n\t1. Insertar - Nodo"
                   + "\n\t2. Ver Inicio - Nodo"
                   + "\n\t3. Ver Fin - Nodo"
                   + "\n\t4. Mostrar - Nodo"
                   + "\n\t5. Busca Dato - Nodo"
                   + "\n\t6. Elimina Dato - Nodo"
                   + "\n\t7. Modifica Dato - Nodo"
                   + "\n\n\t0. Salir\n","Menu Principal",JOptionPane.INFORMATION_MESSAGE);
           if("1".equals(op) || "2".equals(op) || "3".equals(op) || "4".equals(op) || "5".equals(op) || "6".equals(op) || "7".equals(op) || "0".equals(op)){
               opcion = Integer.parseInt(op);
           }
           else
               if(op == null){
                   opcion = 0;
               }
               else{
                   opcion = -1;
               }
               switch(opcion){
                   case 1:
                       c.Insertar();
                       break;
                   case 2:
                       
                       if(c.Vacio() == false){
                           c.In();
                       }
                       break;
                   case 3:
                       
                       if(c.Vacio() == false){
                           c.Fn();
                       }
                       break;
                   case 4:
                       
                       if(c.Vacio() == false){
                           c.Mostrar();
                       }
                       break;
                   case 5:
                       
                       if(c.Vacio() == false){
                           c.BuscarD();
                       }
                       break;
                   case 6:
                       
                       if(c.Vacio() == false){
                           c.Eliminar();
                       }
                       break;
                   case 7:
                       
                       if(c.Vacio() == false){
                           c.Modificar();
                       }
                        break;
                   case 0:
                       JOptionPane.showMessageDialog(null,"\n\tVuelva Pronto","Error",JOptionPane.INFORMATION_MESSAGE);
                       break;
                   default:
                       JOptionPane.showMessageDialog(null,"\n\tOpcion Invalida","Error",JOptionPane.ERROR_MESSAGE);
               }
     
       }while(opcion != 0);
               
    }
    
}
