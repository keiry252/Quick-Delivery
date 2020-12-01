/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Entidades;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author orell
 */
@Data
public class Ventas extends Productos {
    protected int idVenta;
    protected int idVendedor;
    protected int idProducto;
    protected double totalV;
    protected double comisionEnvio;
    protected Date fechaVenta;
}
