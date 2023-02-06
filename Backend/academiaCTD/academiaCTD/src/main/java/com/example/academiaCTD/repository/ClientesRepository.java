package com.example.academiaCTD.repository;

import com.example.academiaCTD.entity.Clientes;
import com.example.academiaCTD.entity.DTO.ClientesDTO;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ClientesRepository  {

    Optional<Clientes> findByEmail(String email);

   Clientes save(Clientes convertClientesDTOIntoClientes);

    Optional<Clientes> findAll();

    void deleteById(Integer id);

    ClientesDTO saveAndFlush(ClientesDTO clientes);

    Optional<Clientes> findById(Integer id);
}
