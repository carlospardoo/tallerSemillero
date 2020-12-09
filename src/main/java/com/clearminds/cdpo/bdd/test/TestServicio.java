package com.clearminds.cdpo.bdd.test;

import com.clearminds.cdpo.dtos.Estudiante;
import com.clearminds.cdpo.excepciones.BDDException;
import com.clearminds.cdpo.servicios.ServicioEstudiante;

public class TestServicio {

	public static void main(String[] args) {
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try {
			srvEstudiante.insertarEstudiante(new Estudiante("Marco", "Chavez"));
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

}
