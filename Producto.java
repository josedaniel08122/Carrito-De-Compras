/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carritocompras;

/**
 *
 * @author Golem
 */
public class Producto {
    
    private int inProducto;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private String categoria;
    
    public Producto(int idProducto,String nombre,String descripcion,double precio, int stock, String categoria){
        this.inProducto= idProducto;
        this.nombre= nombre;
        this.descripcion= descripcion;
        this.precio= precio;
        this.stock= stock;
        this.categoria= categoria;
    }
    
    public void agregarAlcarrito(){
        System.out.println("Agregar producto al carrito :  "+nombre+"  "+descripcion+"con un precio de: "+precio);
    }
    
    public void eliminarDelCarrito(){
        System.out.println("Producto eliminado del carrito");
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
}
