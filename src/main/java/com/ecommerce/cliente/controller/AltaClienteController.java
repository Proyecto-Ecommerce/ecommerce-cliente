package com.ecommerce.cliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.cliente.business.AltaClienteBusiness;
import com.ecommerce.cliente.entityDTO.AltaClienteRequest;
import com.ecommerce.cliente.entityDTO.AltaClienteResponse;

@RestController
@RequestMapping(name = "/cliente")
public class AltaClienteController {
	
	@Autowired
	private AltaClienteBusiness altaClienteBusiness;
	
	@PostMapping(value = "/altacliente")
	public ResponseEntity<AltaClienteResponse> altaCliente(@RequestBody AltaClienteRequest altaClienteRequest){
		System.out.println(">> Estamos en cntroller y lo enviamos al business request: " + altaClienteRequest.toString());
		return altaClienteBusiness.altaCliente(altaClienteRequest);
	}

}
