package com.example.academiaCTD.service;


import com.example.academiaCTD.entity.DTO.ClientesDTO;

import java.util.List;

public interface IClientesService<T> {
    ClientesDTO cadastrar(ClientesDTO clientesDTO);

    T consultarPorId(Integer id) throws Exception;
    T cadastrar (T t);
    T atualizar (Integer id, T t);

    ClientesDTO atualizar(Integer id, ClientesDTO clientesDTO);

    void excluirPorId (Integer id);
    List<T> findAll();
}
