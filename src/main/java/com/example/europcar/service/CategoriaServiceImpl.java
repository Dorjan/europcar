package com.example.europcar.service;

import java.util.List;

import com.example.europcar.entity.Categoria;
import com.example.europcar.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public Categoria findById(Long id) {
        Categoria categoria = categoriaRepository.findById(id).get();
        return categoria;
    }

    @Override
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria delete(Long id) {
        Categoria area = categoriaRepository.findById(id).get();
        categoriaRepository.delete(area);
        return area;
    }

    @Override
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
}
