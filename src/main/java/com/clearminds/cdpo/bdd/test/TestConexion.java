package com.clearminds.cdpo.bdd.test;

import java.sql.Connection;

import com.clearminds.cdpo.bdd.ConexionBDD;
import com.clearminds.cdpo.excepciones.BDDException;

public class TestConexion {

	public static void main(String[] args) {
		try{
			Connection conexion = ConexionBDD.obtenerConexion();
			if(conexion!=null){
				System.out.println("Conexión exitosa");
			}
		}
		catch (BDDException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
