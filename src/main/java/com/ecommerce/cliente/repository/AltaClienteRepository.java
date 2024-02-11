package com.ecommerce.cliente.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.cliente.entity.AltaCliente;

@Repository
public interface AltaClienteRepository extends JpaRepository<AltaCliente, Serializable>{

}
