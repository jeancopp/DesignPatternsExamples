package br.com.coppieters.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.coppieters.factory.DocumentoFactory;
import br.com.coppieters.service.IDocumento;
import br.com.coppieters.service.TipoDocumento;

public class DocumentoFactoryTest {

	@Test
	public void test() {
		List<ReflectiveOperationException> ex = new ArrayList<>();
		String mensagem = "Olá mundo!";

		for (TipoDocumento tipo : TipoDocumento.values()) {
			try {
				IDocumento documento = DocumentoFactory.create(tipo);
				documento.ler();
				documento.escrever(mensagem);
			} catch (ReflectiveOperationException e) {
				ex.add(e);
			}
		}
		
		assertEquals(0, ex.size());
		
	}
}
