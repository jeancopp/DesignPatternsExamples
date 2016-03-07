package br.com.coppieters.service;
/**
 *  Enumerador do tipo de documentos
 * @author Jean
 *
 */
public enum TipoDocumento{
	OFICIO {
		@Override
		public String getClassName() {
			return "br.com.coppieters.implementation.Oficio";
		}
	},
	CERTIDAO {
		@Override
		public String getClassName() {
			return "br.com.coppieters.implementation.Certidao";
		}
	},
	ATA {
		@Override
		public String getClassName() {
			return "br.com.coppieters.implementation.Ata";
		}
	};		
	public abstract String getClassName();
}