/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carritocompras;

/**
 *
 * @author Golem
 */
public class Envio {
    private int idEnvio;
    private int idPedido;
    private String direccion;
    private String fechaEnvio;
    
    public Envio(int idEnvio, int idPedido, String direccion, String fechaEnvio){
        this.idEnvio= idEnvio;
        this.idPedido= idPedido;
        this.direccion= direccion;
        this.fechaEnvio= fechaEnvio;
    }
    
    public void realizarEnvio(){
        System.out.println("El envio sera realizado  "+" a la siguiente direccion "+direccion+""+fechaEnvio);
    }
    
    
}
