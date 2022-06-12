/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

public class Venta {

    private int idventas;
    private String cliente;
    private double total;
    private String Num_venta;

    public Venta() {
    }

    public Venta(int idventas, String cliente, double total, String Num_venta) {
        this.idventas = idventas;
        this.cliente = cliente;

        this.total = total;
        this.Num_venta = Num_venta;
    }

    public int getIdventas() {
        return idventas;
    }

    public void setIdventas(int idventas) {
        this.idventas = idventas;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

  

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNum_venta() {
        return Num_venta;
    }

    public void setNum_venta(String Num_venta) {
        this.Num_venta = Num_venta;
    }

}
