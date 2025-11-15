/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.util.ArrayList;
import modelo.Producto;
import java.util.List;
/**
 *
 * @author rebem
 */
public class GestorProductos {
    List<Producto> productos = new ArrayList<>();
    
    public void agregarPoducto(Producto p){
        productos.add(p);
        
    }
    public void ListarProductos(){
        if (productos.isEmpty() ) {
            System.out.println("No hay productos");
            return;
        }
        productos.forEach(System.out::println);
    }
    
    public Producto buscarPorID(int id){
        for (Producto p : productos) {
            if(p.getId() == id) return p;
        }
 
        return null;
        
    }
    
    public void eiminarProducto(int id){
        Producto p = buscarPorID(id);
        if (p !=null) {
            productos.remove(p);
            System.out.println("Producto borrado del sistema");
        } else {
            System.out.println("Error no existe el producto");
        }
    }
}
