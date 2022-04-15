package com.example.europcar.service;

import com.example.europcar.entityDto.CategoriaDto;

import org.modelmapper.ModelMapper;

import com.example.europcar.entity.Categoria;

public class CategoriaMapper {
    
    public CategoriaDto toDto(Categoria categoria) {
        ModelMapper cMapper = new ModelMapper();
        CategoriaDto cDto = cMapper.map(categoria, CategoriaDto.class);
        return cDto;
    }
    
}
