package com.siriusxm.idm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	private static final Logger LOG = LoggerFactory.getLogger(Controller.class);
	
	@RequestMapping("/say-hello")
    ResponseEntity<String> home() {
		LOG.info("Log4J Calling say-hello endpoint");
        return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
    }
}
