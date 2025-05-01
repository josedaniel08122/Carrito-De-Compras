/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carritocompras;

/**
 *
 * @author josed
 */

import java.util.ArrayList;
import java.util.List;

public class Carrito {
   
    private int idCarrito;
    private int idUsuario;
    private String fechaCreacion;
    private double total;
    private List<Producto>productos;
    
    
    public Carrito(int idCarrito, int idUsuario, String fechaCreacion, double total){
        this.idCarrito= idCarrito;
        this.idUsuario= idUsuario;
        this.fechaCreacion= fechaCreacion;
        this.total= total;
        this.productos= new ArrayList<>();
        
    }
    
    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }
    
    public void eliminarProducto(Producto producto){
        this.productos.remove(producto);
    }
    
    public void actualizarTotal(){
        this.total = 0;
        for(Producto producto : productos){
            this.total += producto.getPrecio();
        }
    }
    
}
