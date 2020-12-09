package com.clearminds.cdpo.servicios;

import com.clearminds.cdpo.dtos.Estudiante;
import com.clearminds.cdpo.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase{
	
	public void insertarEstudiante(Estudiante estudiante) throws BDDException{
		abrirConexion();
		System.out.println("insertando estudiante:"+estudiante);
		cerrarConexion();
	}
	
}
