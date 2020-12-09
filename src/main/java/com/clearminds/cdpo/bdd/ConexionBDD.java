package com.clearminds.cdpo.bdd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConexionBDD {

	
	public static String leerPropiedad(String nombrePropiedad){
		String valorPropiedad = null;
		
		Properties p = new Properties();
		try {
			p.load(new FileReader(System.getProperty("user.dir")+"//src//main//java//com//clearminds//cdpo//middleware//conexion.properties"));
			valorPropiedad = p.getProperty(nombrePropiedad);
		} catch (FileNotFoundException e) {
			System.out.println("Error: Archivo no Encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Error al capturar archivo");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Error: ");
			e.printStackTrace();
		}
		finally {
			p.clear();
		}
		
		
		return valorPropiedad;
	}
	
}
