package com.example.europcar.service;

import com.example.europcar.entity.Area;
import com.example.europcar.entityDto.AreaDto;

import org.modelmapper.ModelMapper;

public class AreaMapper {

    public AreaDto toDto(Area area) {
        ModelMapper aMapper = new ModelMapper();
        AreaDto aDto = aMapper.map(area, AreaDto.class);
        return aDto;
    }
    
}
