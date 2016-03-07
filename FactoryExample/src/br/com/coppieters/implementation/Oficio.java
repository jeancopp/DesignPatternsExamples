package br.com.coppieters.implementation;

import br.com.coppieters.service.IDocumento;

public class Oficio implements IDocumento {

	@Override
	public void ler() {
		System.out.println("Lendo o oficio");
	}

	@Override
	public void escrever(String texto) {
		System.out.println("Escrevendo no oficio:"+texto);

	}

}
