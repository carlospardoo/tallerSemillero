package com.clearminds.cdpo.bdd.test;

import com.clearminds.cdpo.bdd.ConexionBDD;

public class TestPropiedades {

	public static void main(String[] args) {
		//String valor = ConexionBDD.leerPropiedad("propiedad1");
		String valor = ConexionBDD.leerPropiedad("usuario");
		System.out.println(valor);
		valor = ConexionBDD.leerPropiedad("xx");
		System.out.println(valor);
	}

}
