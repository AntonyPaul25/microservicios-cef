package cr.microservicios.cef.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import cr.microservicios.cef.entity.ResponseCefCabecera;
import cr.microservicios.commons.entity.ClienteRequest;

@FeignClient(name = "rtg", url = "https://dpisit.grupoib.local:5020/ibk/sit/api/enterprise-loan/v1/loan-limit/financial-statements")
public interface CefFeignClient {

	@PostMapping
	public ResponseCefCabecera listarCEF(@RequestHeader HttpHeaders headerMap,
			@RequestBody ClienteRequest client);

}
