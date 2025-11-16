
package vista;
import modelo.Producto;
import controlador.GestorProductos;
import java.util.Scanner;

public class GestionProductosPOO {
   
    public static void main(String[] args) {
    Scanner entradaDato= new Scanner(System.in);
    GestorProductos gestor = new GestorProductos();
    int ciclo;
        do {            
            System.out.println("Menu Productos\n1. Agregar\n2. Consultar\n3. Eliminar\n4. Salir\n");
            ciclo= entradaDato.nextInt();
            switch (ciclo) {
                case 1: 
                    System.out.println("Sistema de productos\n Captura ID:");
    int id= entradaDato.nextInt();
        System.out.println("Captura nombre:");
        String nombre= entradaDato.next();
        System.out.println("Captura precio:");
        double precio= entradaDato.nextDouble();
        System.out.println("Captura Stock:");
        int stock= entradaDato.nextInt();
        
        gestor.agregarPoducto(new Producto(id, nombre, precio, stock));
                    break;
                    
                case 2: 
        gestor.ListarProductos();
                         break;
                case 3: 
                    System.out.println("ID a buscar:");
        Producto p = gestor.buscarPorID(entradaDato.nextInt());
        System.err.println(p != null ? p : "Producto no encontrado");
        System.out.println("ID a eliminar:");
        gestor.eiminarProducto(entradaDato.nextInt());

        gestor.ListarProductos();
                    break;
                case 4:
                    System.out.println("Finalizo Programa");
                    break;
                
                default: System.out.println("Opcion invalida solo tengo 1-4"); break;
            }
        } while (ciclo!=4);
        
        
    
    
    
   
        
        
    }
    
}
