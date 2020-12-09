package com.clearminds.cdpo.servicios;

import java.sql.SQLException;
import java.sql.Statement;

import com.clearminds.cdpo.dtos.Estudiante;
import com.clearminds.cdpo.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase{
	
	public void insertarEstudiante(Estudiante estudiante) throws BDDException{
		abrirConexion();
		System.out.println("insertando estudiante:"+estudiante);
		Statement stmt = null;
		
		try {
			stmt = getConexion().createStatement();
			
			String sql = "insert into estudiantes(nombre,apellido) values('"+estudiante.getNombre()+"','"
			+estudiante.getApellido()+"')";
			
			System.out.println("Script: "+sql);
			
			stmt.executeUpdate(sql);
			cerrarConexion();
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}
		
		
	}
	
}
