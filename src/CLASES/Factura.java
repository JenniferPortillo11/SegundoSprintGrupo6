/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;


public class Factura {
    private int idfactura;
    private String num_fact;
    private Float cuota;
    private Float total;

    public Factura() {
    }

    public Factura(int idfactura, String num_fact, Float cuota, Float total) {
        this.idfactura = idfactura;
        this.num_fact = num_fact;
        this.cuota = cuota;
        this.total = total;
    }

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    public String getNum_fact() {
        return num_fact;
    }

    public void setNum_fact(String num_fact) {
        this.num_fact = num_fact;
    }

    public Float getCuota() {
        return cuota;
    }

    public void setCuota(Float cuota) {
        this.cuota = cuota;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }
    
    
    
}
