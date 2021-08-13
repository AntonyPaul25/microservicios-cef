package cr.microservicios.cef.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import cr.microservicios.cef.client.CefFeignClient;
import cr.microservicios.cef.entity.ResponseCefCabecera;
import cr.microservicios.commons.entity.ClienteRequest;

@Service
public class ClienteCEFSericeImpl implements ClienteCEFSerice {

	@Autowired
	private CefFeignClient clienteRTG;

	@Override
	public ResponseCefCabecera listarCEF(HttpHeaders headerMap, ClienteRequest client) {
		return clienteRTG.listarCEF(headerMap, client);
	}

}
