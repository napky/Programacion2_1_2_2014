/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package herencia;

import java.util.Date;

/**
 *
 * @author Docente 17082011
 */
public class CuentaBancaria {
    protected int numero;
    protected String cliente;
    protected double saldo;
    protected Date fechaApertura;

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }
    
    
}
