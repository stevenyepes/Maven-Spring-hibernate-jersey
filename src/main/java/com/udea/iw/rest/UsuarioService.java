package com.udea.iw.rest;


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

import com.udea.iw.dao.UsuarioDAO;
import com.udea.iw.dto.Usuario;
import com.udea.iw.exception.MyException;


@Component
@Path("/get/user")
public class UsuarioService {
    
	@Autowired
	UsuarioDAO usuarioDAO;
	
    @GET
    @Path("/personalizado/{param}")
    @Produces(MediaType.TEXT_HTML)
    public String getSaludoHTML(@PathParam("param") String nombre) throws MyException {

    	
    	return "<html> " + "<title>" + "Hola Mundo" + "</title>"  
             + "<body><h1>" + "Hola Mundo en HTML : " +nombre  
             + "</body></h1>" + "</html> ";
    }
    
    /*@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getSaludoPlain() {
        return "Hola mundo!"  ;
    }*/
    
 
	@GET
	@Path("/{user_id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Transactional
	public Usuario getUser(@PathParam("user_id") String user_id) throws MyException {

		Usuario usuario = new Usuario();
        usuario = usuarioDAO.consultar(user_id);
		return usuario;

	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Usuario> getUsuarios() throws MyException {
		
		return usuarioDAO.consultarTodos();
	}

}