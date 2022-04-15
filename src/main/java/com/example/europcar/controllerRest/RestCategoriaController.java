package com.example.europcar.controllerRest;

import java.util.List;

import com.example.europcar.entity.Categoria;
import com.example.europcar.service.CategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/categoria")
public class RestCategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @GetMapping(value = "/{id}")
    public Categoria getById(@PathVariable ("id") Long id) {
        Categoria categoria = categoriaService.findById(id);
        return categoria;
    }

    @GetMapping(value = "/lista")
    public List<Categoria> getAll() {
        return categoriaService.findAll();
    }

    @PostMapping(value = "/newCategoria")
    public void newCategoria(@RequestBody Categoria categoria) {
        categoriaService.save(categoria);
    }

    @DeleteMapping(value = "/deleteCategoria/{id}")
    public void deleteCategoriaById(@PathVariable("id") Long id) {
        categoriaService.delete(id);
    }
}
