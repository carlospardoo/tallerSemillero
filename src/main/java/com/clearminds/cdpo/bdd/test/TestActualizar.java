package com.clearminds.cdpo.bdd.test;

import com.clearminds.cdpo.dtos.Estudiante;
import com.clearminds.cdpo.excepciones.BDDException;
import com.clearminds.cdpo.servicios.ServicioEstudiante;

public class TestActualizar {

	public static void main(String[] args) {
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try {
			srvEstudiante.actualizarEstudiante(new Estudiante("Pedro", "Navaja", 2,15));
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}

	}

}
