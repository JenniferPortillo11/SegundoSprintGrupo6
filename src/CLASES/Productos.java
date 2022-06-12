/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

public class Productos {

    private int idproducto;
    private String nombre;
    private String decripcion;
    private int cantidad;
    private float precio_costo;
    private float precio_venta;
    private String fecha_ingreso;
    private String cod_producto;
    private String proveedor;
    private String tipo;

    public Productos() {
    }

    public Productos(int idproducto, String nombre, String decripcion, int cantidad, float precio_costo, float precio_venta, String fecha_ingreso, String cod_producto, String proveedor, String tipo) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.decripcion = decripcion;
        this.cantidad = cantidad;
        this.precio_costo = precio_costo;
        this.precio_venta = precio_venta;
        this.fecha_ingreso = fecha_ingreso;
        this.cod_producto = cod_producto;
        this.proveedor = proveedor;
        this.tipo = tipo;
    }

    
    
    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio_costo() {
        return precio_costo;
    }

    public void setPrecio_costo(float precio_costo) {
        this.precio_costo = precio_costo;
    }

    public float getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(String cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
