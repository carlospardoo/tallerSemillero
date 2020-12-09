package com.clearminds.cdpo.bdd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.clearminds.cdpo.excepciones.BDDException;

public class ConexionBDD {

	public static String leerPropiedad(String nombrePropiedad) {
		String valorPropiedad = null;

		Properties p = new Properties();
		try {
			p.load(new FileReader(System.getProperty("user.dir")
					+ "//src//main//java//com//clearminds//cdpo//middleware//conexion.properties"));
			valorPropiedad = p.getProperty(nombrePropiedad);
		} catch (FileNotFoundException e) {
			System.out.println("Error: Archivo no Encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Error al capturar archivo");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error: ");
			e.printStackTrace();
		} finally {
			p.clear();
		}

		return valorPropiedad;
	}

	public static Connection obtenerConexion() throws BDDException {

		Properties p = new Properties();
		Connection conn = null;

		try {
			p.load(new FileReader(System.getProperty("user.dir")
					+ "//src//main//java//com//clearminds//cdpo//middleware//conexion.properties"));
			String usuario = p.getProperty("usuario");
			String pass = p.getProperty("password");
			String urlConexion = p.getProperty("urlConexion");

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(urlConexion, usuario, pass);

		} catch (FileNotFoundException e) {
			System.out.println("Error: Archivo no Encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Error al capturar archivo");
			e.printStackTrace();
		} catch (SQLException e) {
			//System.out.println("Error: Error al conectar a la base de datos");
			e.printStackTrace();
			throw new BDDException("No se pudo conectar a la base de datos");
		} catch (Exception e) {
			System.out.println("Error: ");
			e.printStackTrace();
		} finally {
			p.clear();
		}

		return conn;
	}

}
