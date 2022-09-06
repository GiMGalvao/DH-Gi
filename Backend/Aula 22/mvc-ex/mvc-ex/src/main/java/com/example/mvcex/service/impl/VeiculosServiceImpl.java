package com.example.mvcex.service.impl;

import com.example.mvcex.model.Veiculos;
import com.example.mvcex.service.IVeiculosService;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class VeiculosServiceImpl implements IVeiculosService {


    @Override
    public List<Veiculos> listVeiculos() {
        return Arrays.asList(new Veiculos("Ford", "rosa"), new Veiculos("Chevrolet", "amarelo"));
    }
}
