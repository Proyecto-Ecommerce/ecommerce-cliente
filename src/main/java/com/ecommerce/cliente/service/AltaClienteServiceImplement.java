package com.ecommerce.cliente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.cliente.entity.AltaCliente;
import com.ecommerce.cliente.repository.AltaClienteRepository;

@Service
public class AltaClienteServiceImplement implements AltaClienteService{
	
	@Autowired
	private AltaClienteRepository altaClienteRepository;

	@Override
	public AltaCliente guardaAltaCliente(AltaCliente altaCliente) {
		AltaCliente ac = altaClienteRepository.save(altaCliente);
		System.out.println(">> Se manda  aguardar con el dao repo y se devulve: " + ac.toString());
		return ac;
	}

}
