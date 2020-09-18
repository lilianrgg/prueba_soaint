package com.ventas.dao;


public class usuarioDao {
	
	public static boolean validar (String usuario, String pwd) {
		
		return (usuario.equals("admin") && pwd.equals("admin"));	

	}

}
