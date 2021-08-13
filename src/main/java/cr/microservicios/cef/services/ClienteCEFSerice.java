package cr.microservicios.cef.services;

import org.springframework.http.HttpHeaders;

import cr.microservicios.cef.entity.ResponseCefCabecera;
import cr.microservicios.commons.entity.ClienteRequest;

public interface ClienteCEFSerice {

	public ResponseCefCabecera listarCEF(HttpHeaders headerMap, ClienteRequest client);
	
	

}
