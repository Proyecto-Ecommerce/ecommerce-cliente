package com.ecommerce.cliente.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.ecommerce.cliente.entity.AltaCliente;
import com.ecommerce.cliente.entityDTO.AltaClienteRequest;
import com.ecommerce.cliente.entityDTO.AltaClienteResponse;
import com.ecommerce.cliente.service.AltaClienteService;

@Component
public class AltaClienteBusiness {
	
	@Autowired
	private AltaClienteService altaClienteService;
	
	public ResponseEntity<AltaClienteResponse> altaCliente(AltaClienteRequest altaClienteRequest){
		AltaClienteResponse altaClienteResponse = new AltaClienteResponse();
		AltaCliente altaCliente = new AltaCliente();
		altaCliente.setId(altaClienteRequest.getId());
		altaCliente.setNombre(altaClienteRequest.getNombre());
		altaCliente.setApellidoPaterno(altaClienteRequest.getApellidoPaterno());
		altaCliente.setApellidoMaterno(altaClienteRequest.getApellidoMaterno());
		altaCliente.setDireccion(altaClienteRequest.getDireccion());
		altaCliente.setEmail(altaClienteRequest.getEmail());
		altaCliente.setTelefono(altaClienteRequest.getTelefono());
		System.out.println(">> Lo pasamos a la entity: " + altaCliente.toString());
		
		AltaCliente ac = altaClienteService.guardaAltaCliente(altaCliente);
		altaClienteResponse.setId(ac.getId());
		altaClienteResponse.setNombre(ac.getNombre());
		altaClienteResponse.setApellidoPaterno(ac.getApellidoPaterno());
		altaClienteResponse.setApellidoMaterno(ac.getApellidoMaterno());
		
		System.out.println(">> Lo mandamos al servic para guardar y obtener respuesta en ac: " + ac.toString());
		System.out.println("Veamos la respuesta hacia al front: " + altaClienteResponse.toString());
		
		return new ResponseEntity<AltaClienteResponse>(altaClienteResponse, HttpStatus.OK);
	}

}
