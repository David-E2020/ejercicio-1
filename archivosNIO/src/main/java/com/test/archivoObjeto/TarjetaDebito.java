/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.archivoObjeto;

import java.io.Serializable;

/**
 *
 * @author David Elias Mamani Laura
 */
public class TarjetaDebito implements Serializable{
    static final long serialVersionUID=42L;
    //atributos
    private int nroTarjeta;
    private int nroCuenta;
    private double saldo;
    private String estado;
    //metodos
    public void mostrarTarjeta(){
        System.out.println("Nro. Tarjeta: "+this.nroTarjeta);
        System.out.println("Nro. Cuenta: "+this.nroCuenta);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Estado: "+this.estado);
    }
    //getter ysetter

    public int getNroTarjeta() {
        return nroTarjeta;
    }

    public void setNroTarjeta(int nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
