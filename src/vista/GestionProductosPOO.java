
package vista;
import modelo.Producto;
import controlador.GestorProductos;
import java.util.Scanner;

public class GestionProductosPOO {
   
    public static void main(String[] args) {
         Scanner entradaDato= new Scanner(System.in);
    GestorProductos gestor = new GestorProductos();
        
    System.out.println("Sistema de productos\n Captura ID:");
    int id= entradaDato.nextInt();
        System.out.println("Captura nombre:");
        String nombre= entradaDato.next();
        System.out.println("Captura precio:");
        double precio= entradaDato.nextDouble();
        System.out.println("Captura Stock:");
        int stock= entradaDato.nextInt();
        
        gestor.agregarPoducto(new Producto(id, nombre, precio, stock));
    
        gestor.ListarProductos();
        
        System.out.println("ID a buscar:");
        Producto p = gestor.buscarPorID(entradaDato.nextInt());
        System.err.println(p != null ? p : "Producto no encontrado");
        System.out.println("ID a eliminar:");
        gestor.eiminarProducto(entradaDato.nextInt());

        gestor.ListarProductos();
    }
    
}
