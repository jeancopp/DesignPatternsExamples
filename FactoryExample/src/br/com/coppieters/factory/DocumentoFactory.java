package br.com.coppieters.factory;

import br.com.coppieters.service.IDocumento;
import br.com.coppieters.service.TipoDocumento;
/**
 * Factory para criação de documento usando reflection
 * @author Jean
 *
 */
public class DocumentoFactory {

		public static IDocumento create(TipoDocumento tipoDocumento) 
				throws ReflectiveOperationException{
		Class<?> tipo = Class.forName(tipoDocumento.getClassName());
		IDocumento instancia = (IDocumento) tipo.newInstance();
		return instancia;
	}
}
