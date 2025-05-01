/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carritocompras;

/**
 *
 * @author josed
 */
public class ItemCarrito {
    private int idItemCarrito;
    private int idCarrito;
    private int idProducto;
    private int cantidad;
    
    
    public ItemCarrito(int idItemCarrito,int idCarrito,int idProducto, int catidad){
        this.idCarrito= idCarrito;
        this.idItemCarrito= idItemCarrito;
        this.idProducto= idProducto;
        this.cantidad= cantidad;
    }
    
    public void actualizarCantidad(int cantidad){
        this.cantidad=cantidad;
        
    }
    
    
    
    
}
