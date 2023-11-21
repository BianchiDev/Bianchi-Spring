package com.bianchi.bianchi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bianchi.bianchi.domain.Categoria;
import com.bianchi.bianchi.repository.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository catego;

    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = catego.findById(id);
        return obj.orElse(null);

    }
}
