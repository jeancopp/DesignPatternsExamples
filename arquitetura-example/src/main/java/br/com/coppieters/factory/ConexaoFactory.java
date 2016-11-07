package br.com.coppieters.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection criarConexao(ConexaoEnum tipoDeConexao) throws SQLException {
		return DriverManager.getConnection(tipoDeConexao.getUri(), tipoDeConexao.getUser(),
				tipoDeConexao.getPass());
	}
}
