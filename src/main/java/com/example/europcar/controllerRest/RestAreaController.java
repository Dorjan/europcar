package com.example.europcar.controllerRest;

import java.util.List;

import com.example.europcar.entity.Area;
import com.example.europcar.service.AreaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/area")
public class RestAreaController {

    @Autowired
    AreaService areaService;

    @GetMapping(value = "/{id}")
    public Area getById(@PathVariable ("id") Long id) {
        Area area = areaService.findById(id);
        return area;
    }

    @GetMapping(value = "/lista")
    public List<Area> getAll() {
        return areaService.findAll();
    }

    @PostMapping(value = "/newArea")
    public void newArea(@RequestBody Area area) {
        areaService.save(area);
    }

    @DeleteMapping(value = "/deleteArea/{id}")
    public void deleteAreaById(@PathVariable("id") Long id) {
        areaService.delete(id);
    }
}
