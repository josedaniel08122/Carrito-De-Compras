/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carritocompras;

/**
 *
 * @author Golem
 */
public class Vendedor {
    private int idVendedor;
    private String nombre;
    private String apellido;
    private String email;
    private int reputacion;
    
    public Vendedor(int IdVendedor,String nombre, String apellido,String email, int reputacion){
        this.idVendedor= idVendedor;
        this.nombre= nombre;
        this.apellido= apellido;
        this.email= email;
        this.reputacion = reputacion;
    }
  public void publicarProducto(){
      System.out.println("Producto publicado");
  } 
    
   public void gestionarPedidos(){
       System.out.println(" Pedidos gestionados ");
   }
}


