/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabdd01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author fabian
 */
public class Conexion {
    
    // VARIABLES GLOBALES 
    private final String usuario = "fabian";
    private final String password = "";
    private final String url="jdbc:mysql://localhost:8889/mascotas";
    private ResultSet rs;
    private Statement stmt;
    private final Scanner scan = new Scanner(System.in);
    
    
    public void conectar(){
        
        try{
            
            Class.forName("org.gjt.mm.mysql.Driver");        
            Connection con=DriverManager.getConnection(this.url,this.usuario, this.password); 
            System.out.println("Conexion Establecida");
            this.stmt=con.createStatement();
            
  
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error:"+ex.getMessage());
        }
    }
   
   
}
