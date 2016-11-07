package br.com.coppieters.controller;

import java.sql.Connection;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.coppieters.dao.UsuarioDAO;
import br.com.coppieters.factory.ConexaoEnum;
import br.com.coppieters.factory.ConexaoFactory;
import br.com.coppieters.model.Usuario;
import br.com.coppieters.validator.UsuarioValidator;

@RestController
public class UsuarioController {

	@RequestMapping(method = RequestMethod.GET, value = "/validar")
	public ResponseEntity<Boolean> validaUsuario(Usuario usuario){
		UsuarioValidator validador = new UsuarioValidator();
		try{
			Connection conexao = ConexaoFactory.criarConexao(ConexaoEnum.MYSQL); 
			UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
			
			Usuario usuarioDoBanco = usuarioDao.buscarPorNome(usuario.getLogin());
			boolean usuarioEstaValido = validador.test(usuarioDoBanco, usuario.getSenha());
		
			conexao.close();
			
			HttpStatus resp = usuarioEstaValido ? HttpStatus.FOUND : HttpStatus.NOT_FOUND;
			return new ResponseEntity<Boolean>(usuarioEstaValido, resp);
		}catch(Throwable t){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
