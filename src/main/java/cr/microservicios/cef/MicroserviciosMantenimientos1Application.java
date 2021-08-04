package cr.microservicios.cef;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({ "cr.microservicios.commons.entity" })
public class MicroserviciosMantenimientos1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosMantenimientos1Application.class, args);
	}

}
