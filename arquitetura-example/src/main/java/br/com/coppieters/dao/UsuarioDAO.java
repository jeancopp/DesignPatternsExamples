package br.com.coppieters.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.coppieters.model.Usuario;

public class UsuarioDAO {
	private Connection conn;

	public UsuarioDAO(Connection conn){
		this.conn = conn;
	}
	
	public Usuario buscarPorNome(String nome) throws SQLException{
		PreparedStatement statement = this.conn.prepareStatement("select * from usuario");
		ResultSet resultSet = statement.executeQuery();
		if(resultSet.next()){
			return new Usuario(resultSet.getString("login"),resultSet.getString("senha"));
		}else return null;
	}
	
}
