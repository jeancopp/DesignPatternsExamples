package br.com.coppieters.factory;

public enum ConexaoEnum {
	MYSQL("jdbc:mysql://localhost:3306/banco_teste","root","");
	
	private String pass;
	private String uri;
	private String user;

	private ConexaoEnum(String uri, String user, String pass) {
		this.uri = uri;
		this.user = user;
		this.pass = pass;
	}

	public String getPass() {
		return pass;
	}

	public String getUri() {
		return uri;
	}


	public String getUser() {
		return user;
	}

}
