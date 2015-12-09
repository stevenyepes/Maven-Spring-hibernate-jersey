package com.udea.iw.rest;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.udea.iw.dao.UsuarioDAO;
import com.udea.iw.dto.Usuario;
import com.udea.iw.exception.MyException;

@Component
@Path("/get/users")
public class UsuarioService {
    
	@Autowired
	UsuarioDAO usuarioDAO;
	
	@GET
	@Path("/{user_id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Transactional
	public Response getUser(@PathParam("user_id") String user_id) throws MyException {

		Usuario usuario = new Usuario();
        usuario = usuarioDAO.consultar(user_id);
        return Response.ok() //200
				.entity(usuario)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.build();

	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsuarios(@PathParam("id") String id) throws MyException{
		List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios = usuarioDAO.consultarTodos();
		return Response.ok() //200
				.entity(usuarios)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.build();
	}

}