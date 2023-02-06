package com.example.academiaCTD.controller;

import com.example.academiaCTD.entity.Clientes;
import com.example.academiaCTD.entity.DTO.ClientesDTO;
import com.example.academiaCTD.service.impl.ClientesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
    ClientesServiceImpl clientesService = null;
    @Autowired
    private ClientesServiceImpl academiaService;


    @PostMapping()
    public ResponseEntity<ClientesDTO> cadastrar(@RequestBody  ClientesDTO clientesDTO) {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clientes> consultarPorId(@PathVariable Integer id) {
        return ResponseEntity.ok().body(clientesService.consultarPorId(id));
    }

    @GetMapping
    public ResponseEntity<List<Clientes>> findAll() {
        return ResponseEntity.ok().body(clientesService.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClientesDTO> atualizar(@PathVariable Integer id, @RequestBody ClientesDTO clientesDTO) {

        return ResponseEntity.ok().body(clientesService.atualizar(id, clientesDTO));
    }

    @DeleteMapping("/{id}")

    public ResponseEntity excluirPorId(@PathVariable int id) {
        clientesService.excluirPorId(id);
        return ResponseEntity.noContent().build();
    }



}