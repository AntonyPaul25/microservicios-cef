package cr.microservicios.cef.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import cr.microservicios.commons.entity.LogMDL;
import cr.microservicios.cef.client.LogFeignClient;

@Service
public class LogMDLServiceImpl implements LogMDLService {

	@Autowired
	private LogFeignClient logclient;

	@Override
	public ResponseEntity<?> save(LogMDL logmdl) {
		return logclient.save(logmdl);
	}

}
