package com.example.europcar.service;

import java.util.List;

import com.example.europcar.entity.Categoria;

public interface CategoriaService {

    public Categoria findById(Long id);

    public List<Categoria> findAll();

    public Categoria delete(Long id);

    public Categoria save(Categoria categoria);
}
