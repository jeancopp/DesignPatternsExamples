package br.com.coppieters.implementation;

import br.com.coppieters.service.IDocumento;

public class Ata implements IDocumento {

	@Override
	public void ler() {
		System.out.println("Lendo o Ata");
	}

	@Override
	public void escrever(String texto) {
		System.out.println("Escrevendo no Ata:"+texto);

	}

}
