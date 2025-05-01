/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carritocompras;

/**
 *
 * @author josed
 */
public class Usuario {
    public int idUsuario;
    private String nombre;
    private String apellido;
    private String email;
    private String contraseña;
    
    public  Usuario(int idUsuario, String nombre,String apellido, String email, String contraseña){
        this.idUsuario = idUsuario;
        this.apellido = apellido;
        this.nombre = nombre;
        this.email= email;
        this.contraseña = contraseña;
    }
    
    public void registrarse(){
        System.out.println("Usuario registrado");
    }
    
    public void iniciarSecion(){
        System.out.println("El usuario inicio sesion: "+nombre +""+ apellido);
        
    }
    
    
    
    
}
