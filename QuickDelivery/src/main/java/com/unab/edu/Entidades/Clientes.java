/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Entidades;

import lombok.Data;

/**
 *
 * @author orell
 */
@Data
public class Clientes extends Usuarios{
    protected int idCliente;
    protected int idUsuario;
    protected int idCompra;  
}
