/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carritocompras;

/**
 *
 * @author josed
 */
public class Pedido {
    private int idPedido;
    private int idCarrito;
    private String fechaPedido;
    private double total;
    private String estado;
    
    public Pedido(int idPedido,int idCarrito, String fechaPedido, double total, String estado){
        this.idPedido= idPedido;
        this.idCarrito= idCarrito;
        this.estado= estado;
        this.fechaPedido= fechaPedido;
        this.total= total; 
    }
    
    public void realizarPedido(){
        System.out.println("El pedido ha sido realizado por el momento se encuentra : "+estado+fechaPedido);
        
        
    }
    public void actualizarEstado(String estado){
        this.estado = estado;
        
    }
}
