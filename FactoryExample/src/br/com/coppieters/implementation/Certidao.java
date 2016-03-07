package br.com.coppieters.implementation;

import br.com.coppieters.service.IDocumento;

public class Certidao implements IDocumento {

	@Override
	public void ler() {
		System.out.println("Lendo o Certidao");
	}

	@Override
	public void escrever(String texto) {
		System.out.println("Escrevendo no Certidao:"+texto);

	}

}
