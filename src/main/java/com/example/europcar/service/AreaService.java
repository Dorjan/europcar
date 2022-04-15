package com.example.europcar.service;

import java.util.List;

import com.example.europcar.entity.Area;

public interface AreaService {

    public Area findById(Long id);
    
    public List<Area> findAll();

    public Area delete(Long id);

    public Area save(Area area);
}
