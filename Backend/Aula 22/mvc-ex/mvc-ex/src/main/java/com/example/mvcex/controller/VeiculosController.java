package com.example.mvcex.controller;


import com.example.mvcex.model.Veiculos;
import com.example.mvcex.service.impl.VeiculosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veiculos")

public class VeiculosController {

    @Autowired
    private VeiculosServiceImpl veiculosService;

    @GetMapping

     public List<Veiculos> getVeiculosList() {
     return veiculosService.listVeiculos();
    }
}
