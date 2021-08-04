package cr.microservicios.cef.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CefController {

	@GetMapping
	public ResponseEntity<?> prueba() {
		return ResponseEntity.ok("test CEF");
	}
	
}
