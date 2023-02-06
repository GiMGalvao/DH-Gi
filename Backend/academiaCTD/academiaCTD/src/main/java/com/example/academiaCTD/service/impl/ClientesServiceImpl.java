package com.example.academiaCTD.service.impl;


import com.example.academiaCTD.entity.Clientes;
import com.example.academiaCTD.entity.DTO.ClientesDTO;
import com.example.academiaCTD.repository.ClientesRepository;
import com.example.academiaCTD.service.IClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class ClientesServiceImpl implements IClientesService<Clientes> {


    @Autowired
    private ClientesRepository clientesRepository;
    private Clientes convertClientesDTOIntoClientes(Clientes clientesSaved) {
    }

    @Override
    public ClientesDTO cadastrar(ClientesDTO clientesDTO) {
        clientesDTO.getSenha();
        ClientesDTO convertClientesDTOIntoClientes = new ClientesDTO();
        return   convertClientesDTOIntoClientes;
    }

    @Override
    public Clientes consultarPorId(Integer id) {
        Optional<Clientes> clientesById = clientesRepository.findById(id);
        return clientesById.get();
    }

    @Override
    public Clientes cadastrar(Clientes clientes) {
        return null;
    }

    @Override
    public Clientes atualizar(Integer id, Clientes clientes) {
        return null;
    }

    public List<Clientes> findAll() {
        return clientesRepository.findAll().stream()
                .map(this::convertClientesDTOIntoClientes).collect(Collectors.toList());
    }

    @Override
    public ClientesDTO atualizar(Integer id, ClientesDTO clientesDTO) {
        Clientes clientesById = consultarPorId(id);
        clientesDTO.setId(clientesById.getId());
        ClientesDTO clientes = convertClientesDTOIntoClientes(clientesDTO);
        ClientesDTO clientesSaved = clientesRepository.saveAndFlush(clientes);
        return convertClientesDTOIntoClientes(clientesSaved);
    }



    @Override
    public void excluirPorId(Integer id) {
        consultarPorId(id);
        clientesRepository.deleteById(id);
    }

}