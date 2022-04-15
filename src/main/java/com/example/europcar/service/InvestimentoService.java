package com.example.europcar.service;

import java.util.List;

import com.example.europcar.entity.Investimento;

public interface InvestimentoService {

    public Investimento findById(Long id);

    public List<Investimento> findAll();

    public Investimento delete(Long id);

    public Investimento save(Investimento investimento);
}
