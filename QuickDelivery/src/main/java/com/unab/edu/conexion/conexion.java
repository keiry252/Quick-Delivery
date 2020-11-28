
package com.unab.edu.conexion;

import java.sql.Connection;
import java.sql.DriverManager;


public class conexion {
    
    private Connection conexion; 
    
    public conexion()
    {
        
        try
        {
            
           conexion = DriverManager.getConnection("jdbc:mysql://localhost/QuickDeliveryBD","root","root");
            
            System.out.println("Conectado a la BD");
        
        }
        catch(Exception e)
        {
        
            System.out.println("Error de Conexion" + e);
            
        }
        
    }
    
    public Connection retornarConexion()
    {
        return conexion;
    }
    
}
