package com.example.europcar.service;

import java.util.List;

import com.example.europcar.entity.Investimento;
import com.example.europcar.repository.InvestimentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestimentoServiceImpl implements InvestimentoService{

    @Autowired
    InvestimentoRepository investimentoRepository;

    @Override
    public Investimento findById(Long id) {
        Investimento investimento = investimentoRepository.findById(id).get();
        return investimento;
    }

    @Override
    public List<Investimento> findAll() {
        return investimentoRepository.findAll();
    }

    @Override
    public Investimento delete(Long id) {
        Investimento investimento = investimentoRepository.findById(id).get();
        investimentoRepository.delete(investimento);
        return investimento;
    }

    @Override
    public Investimento save(Investimento investimento) {
        return investimentoRepository.save(investimento);
    }
}
