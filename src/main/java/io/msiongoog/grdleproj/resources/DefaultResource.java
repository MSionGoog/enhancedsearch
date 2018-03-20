package io.msiongoog.grdleproj.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.msiongoog.grdleproj.models.HttpResponseMessage;

@RestController
public class DefaultResource {
	
	@GetMapping(path="/start")
	public ResponseEntity<HttpResponseMessage> defaultMethod() {
		
		return new ResponseEntity<HttpResponseMessage>(new HttpResponseMessage("hello world"), HttpStatus.OK);
	}

}
