/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carritocompras;

/**
 *
 * @author Golem
 */
public class Pago {
    private int idPago;
    private int idPedido;
    private String metodoPago;
    private String fechaPago;
    
    public Pago(int idPago, int idPedido, String metodoPago, String fechaPago){
        this.idPago= idPago;
        this.idPedido= idPedido;
        this.fechaPago= fechaPago;
        this.metodoPago= metodoPago;
    }
    public void realizarPago(){
        System.out.println("Pago realizado con: "+metodoPago+""+fechaPago);
        
    }
    
    
    
}
