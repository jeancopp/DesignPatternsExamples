package br.com.coppieters.validator;

import java.util.function.BiPredicate;

import org.springframework.stereotype.Service;

import br.com.coppieters.model.Usuario;

@Service
public class UsuarioValidator implements BiPredicate<Usuario,String>{

	@Override
	public boolean test(Usuario usuario, String senha) {
		return usuario.getSenha().equals(senha);
	}
	
}
