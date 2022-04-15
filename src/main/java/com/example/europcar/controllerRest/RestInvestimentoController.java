package com.example.europcar.controllerRest;

import java.util.List;

import com.example.europcar.entity.Investimento;
import com.example.europcar.service.InvestimentoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/investimento")
public class RestInvestimentoController {
   
    @Autowired
    InvestimentoService investimentoService;

    @GetMapping(value = "/{id}")
    public Investimento getById(@PathVariable ("id") Long id) {
        Investimento investimento = investimentoService.findById(id);
        return investimento;
    }

    @GetMapping(value = "/lista")
    public List<Investimento> getAll() {
        return investimentoService.findAll();
    }

    @PostMapping(value = "/newInvestimento")
    public void newInvestimento(@RequestBody Investimento investimento) {
        investimentoService.save(investimento);
    }

    @DeleteMapping(value = "/deleteInvestimento/{id}")
    public void deleteInvestimentoById(@PathVariable("id") Long id) {
        investimentoService.delete(id);
    }
}
