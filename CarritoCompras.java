/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carritocompras;

/**
 *
 * @author Golem
 */
public class CarritoCompras {
    
 
        public static void main(String[] args){
            Usuario usuario = new Usuario(1," Leonardo ","Pacheco","leo180620@gmail,com","leo17");
            usuario.registrarse();
            usuario.iniciarSecion();
            
            Producto producto = new Producto(1,"Laptop  Asus Tuf Gaming A15","Potente,economica y versatil ",16000,10,"Electronica");
            producto.agregarAlcarrito();
            Producto producto2= new Producto(2,"Memoria Usb y tipo c ",", facil  para usar y mover tus  datos ",200,5,"Electronica");
             producto2.agregarAlcarrito();
             producto.getPrecio();
            
             
             
             Carrito carrito= new Carrito(1,501,"01/05/2025",16000);
             carrito.actualizarTotal();
             carrito.agregarProducto(producto);
             carrito.eliminarProducto(producto);
             
             Pedido pedido = new Pedido(1,501,"se a realizo con la fecha  01/05/2025",16000," Pendiente esperando a ser pagado,  ");
             pedido.realizarPedido();
             
             Pago pago= new Pago(1,501,"Tarjeta de credito ","En la siguiente fecha 01/05/2025");
             pago.realizarPago();
             
             Envio envio= new Envio(1,501,"Avenida ferrocarril sin numero,Colonia el jordan ","Tu pedido llega entre el 6 y 7 de mayo de 2025");
             envio.realizarEnvio();
             
        }
    }

