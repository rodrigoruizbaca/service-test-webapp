package com.siriusxm.idm;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/say-hello")
    ResponseEntity<String> home() {
        return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
    }
}
