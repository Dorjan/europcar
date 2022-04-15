package com.example.europcar.service;

import com.example.europcar.entity.Investimento;
import com.example.europcar.entityDto.InvestimentoDto;

import org.modelmapper.ModelMapper;

public class InvestimentoMapper {
    
    public InvestimentoDto toDto(Investimento investimento) {
        ModelMapper iMapper = new ModelMapper();
        InvestimentoDto iDto = iMapper.map(investimento, InvestimentoDto.class);
        return iDto;
    }
}
