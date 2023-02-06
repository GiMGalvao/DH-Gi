package com.example.ClinicaOdontologica.controller;

import com.example.ClinicaOdontologica.entity.dto.EnderecoDTO;
<<<<<<< HEAD
import com.example.ClinicaOdontologica.repository.impl.EnderecoServiceImpl;
=======
import com.example.ClinicaOdontologica.service.impl.EnderecoServiceImpl;
>>>>>>> 195489bf3aa125d384774c08dc0f9b16a9bce7a4
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    EnderecoServiceImpl enderecoService;

    @PostMapping()
    @Transactional
    public ResponseEntity<EnderecoDTO> cadastrar(@RequestBody @Valid EnderecoDTO enderecoDTO) {
        ResponseEntity responseEntity;

        if (enderecoDTO.getRua() != null) {
            EnderecoDTO enderecoDTO1 = enderecoService.cadastrar(enderecoDTO);
            responseEntity = new ResponseEntity(enderecoDTO1, HttpStatus.OK);
        } else {
            responseEntity = new ResponseEntity("Rua não preenchida", HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnderecoDTO> consultarPorId(@PathVariable Integer id) {
        return ResponseEntity.ok().body(enderecoService.consultarPorId(id));
    }

    @GetMapping
    public ResponseEntity<List<EnderecoDTO>> findAll() {
        return ResponseEntity.ok().body(enderecoService.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<EnderecoDTO> atualizar(@PathVariable Integer id, @RequestBody @Valid EnderecoDTO enderecoDTO) {
        return ResponseEntity.ok().body(enderecoService.atualizar(id, enderecoDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluirPorId(@PathVariable Integer id) {
        enderecoService.excluirPorId(id);
        return ResponseEntity.noContent().build();
    }

}
