/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

/**
 *
 * @author zSG
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conexion {
    String bd="";
    String url="jdbc:mysql://localhost:3306/";
    String user="root";
    String pass="";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection cx;

    public Conexion(String bd) {
        this.bd=bd;
    }
    
    public Connection conectar(){
       
        try {
            Class.forName(driver);
            cx=DriverManager.getConnection(url+bd,user,pass);
            System.out.println("Se conecto a la BD " +bd);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se conecto a la BD "+ bd);
            //Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
}
    public void desconectar(){
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args){
        //Conexion conexion = new Conexion("pg_proyecto");
        //conexion.conectar();
    }
}
