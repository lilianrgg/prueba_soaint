package com.ventas.servicio;

import java.util.Date;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ventas.dao.usuarioDao;
import com.ventas.model.Usuario;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


@Path("auth")
public class loginServicio {
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response validar( Usuario usuario) {
		
	   boolean status=usuarioDao.validar(usuario.getusuario(), usuario.getPwd());
    
	    if (status) {
	    	String KEY="123***";
	    	long tiempo= System.currentTimeMillis();
	    	String jwt = Jwts.builder()
	    			     .signWith(SignatureAlgorithm.HS256, KEY)
	    			     .setSubject("User")
	    			     .setIssuedAt(new Date(tiempo))
	    			     .setExpiration(new Date(tiempo+900000))
	    			     .claim("email", "adm@gmail.com")
	    			     .compact();
	    	
	    	JsonObject json = Json.createObjectBuilder().add("JWT", jwt).build();
	    	return Response.status(Response.Status.CREATED).entity(json).build();
	
	    }
    
      return Response.status(Response.Status.UNAUTHORIZED).build();
		
	}

}
