package com.connector.ProyectoMaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    String url = "jdbc:mysql://localhost:3306/TEST";
    try {
    	Connection conexion = DriverManager.getConnection(url,"root","");
    	//System.out.print("Conexion creada");
    	Statement instruccion = conexion.createStatement();
    	String sql ="SELECT * FROM Accounts";
    	ResultSet resultado = instruccion.executeQuery(sql); 
    	while(resultado.next()) {
    		System.out.print("Id :"+resultado.getInt("id"));
    		System.out.print(" account : "+resultado.getString("account_number"));
    
    	}
    }catch(SQLException ex) {
    	ex.printStackTrace(System.out);
    }
  }
}
